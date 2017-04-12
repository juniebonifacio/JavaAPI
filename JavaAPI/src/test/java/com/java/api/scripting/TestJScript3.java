package com.java.api.scripting;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestJScript3 {

	@Test
	public void testJScript() {
		String script = "com.java.api.scripting.TestJScript3.sayHello()";
		
		try {
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			
			engine.eval(script);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
	
	public static void sayHello(){
		System.out.println("Hello");
	}
}