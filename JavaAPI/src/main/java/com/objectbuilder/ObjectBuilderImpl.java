/**
 * 
 */
package com.objectbuilder;

import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 
 * Class used to simplify object creation when involving too many attributes from objects in NetCracker
 * @author Junie
 *
 */
public class ObjectBuilderImpl implements ObjectBuilder {

	private ScriptEngine scriptEngine;
	private String propertyName;
	private String propertyNameNoTrigger;
	
    /** Generic Constructor*/
	public ObjectBuilderImpl(){} 
	
	public ObjectBuilderImpl(String propertyName, Map<String, Object> refMap) {
		
		/** Create the script engine */
		ScriptEngineManager scriptEngineMgr = new ScriptEngineManager();
		scriptEngine = scriptEngineMgr.getEngineByName("JavaScript");
		
		/** Add the reference objects from the map */
		for (Map.Entry<String, Object> entry : refMap.entrySet()) {
			scriptEngine.put(entry.getKey(), entry.getValue());
		}
		
		/** Save the attribute property name we should use */
		this.propertyName = propertyName;
		this.propertyNameNoTrigger = propertyName + "_NO_TRIGGER"; 
		
	}
	
	/**
	 * Search the NC Object for attributes 
	 * @param ncObject
	 * @throws ScriptException
	 */
	public boolean buildObjects(NCObject object) throws ScriptException {
		boolean result = false;
		
		Map<Object,Attribute> attrs = object.getAttributes();
		for(Attribute attr : attrs.values()) {
			String script = attr.getProperties().get(this.propertyName);
			
			if(null != script && !script.isEmpty()) {
				String value = null;
					
				switch(attr.getTypeID()) {
					case 0:   /** Text */
					case 2:   /** Number */
					case 4:   /** Date */
					case 5:   /** Masked */
						value = attr.getValue();
						break;
					case 9:   /** Reference (not in design right now_ ) */
                        /** TODO - call buildObjects again using the reference? */
						break;
				    default:
				    	System .out.println(attr.getName() + " " + attr.getID() + " Unknown type " + attr.getTypeID());
				}
				
				if(null != value) {
					scriptEngine.put("value", value);
					
					try {
						scriptEngine.eval(script);
					} catch (ScriptException e) {
						System.out.println("attr name: " + attr.getName() + "script value: " + script +  "\nException: " + e.getMessage());
						throw e;
					}
					if(! attr.getProperties().containsKey(propertyNameNoTrigger)) { result = true; }
					
				} else {
					System.out.println("attr name: " + attr.getName() + "script value: " + script +  "; SKIPPED Due to Null value. \n");
				}
			}
		}
		
		return result;
	}

}
