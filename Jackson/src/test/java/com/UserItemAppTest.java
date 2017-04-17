package com;

import org.junit.Test;

import com.dtos.Item;
import com.dtos.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit test for simple App.
 */
public class UserItemAppTest {

	@Test//(expected = JsonMappingException.class)
	public void givenBidirectionRelation_whenSerializing_thenException() throws JsonProcessingException {
		User user = new User (1, "John");
		Item item = new Item(2, "book", user);
		user.addItem(item);
		
		String result = new ObjectMapper().writeValueAsString(item);
		System.out.println("result: " + result);
	}
}
