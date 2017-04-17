package com;

import org.junit.Test;

import com.dtos.Child;
import com.dtos.Parent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit test for simple App.
 */
public class ParentChildAppTest {

	@Test//(expected = JsonMappingException.class)
	public void givenBidirectionRelation_whenSerializing_thenException() throws JsonProcessingException {
		Parent parent = new Parent(1L, "Nica Jean");
		Child child = new Child(2L, "Alexa", parent);
		parent.addChild(child);
		
		
		String result = new ObjectMapper().writeValueAsString(child);
		System.out.println("result: " + result);
	}
}
