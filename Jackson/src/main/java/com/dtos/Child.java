package com.dtos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Child {

	private Long id;
	private String name;
	
	@JsonManagedReference
	private Parent parent;
	
	public Child() {
		super();
	}
	
	public Child(Long id, String name, Parent parent) {
		this.id = id;
		this.name = name;
		this.parent = parent;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the parent
	 */
	public Parent getParent() {
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	@JsonProperty
	public Long getParentId() {
		return parent == null ? null : parent.getId();
	}
}
