package com.objectbuilder;

import javax.script.ScriptException;

/**
 * 
 * @author Junie
 *
 */
public interface ObjectBuilder {

	public boolean buildObjects(NCObject object) throws ScriptException, Exception;
	
}
