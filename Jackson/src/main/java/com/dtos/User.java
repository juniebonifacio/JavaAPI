package com.dtos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class User {

	private int id;
	private String name;
	
	@JsonBackReference(value="User-To-Item")
	private List<Item> userItems;
	
    public User() {
        super();
    }

    public User(final int id, final String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public void addItem(Item item) {
    	if(null == this.userItems) {
    		this.userItems = new ArrayList<Item>();
    	}
    	this.userItems.add(item);
    }
    
}
