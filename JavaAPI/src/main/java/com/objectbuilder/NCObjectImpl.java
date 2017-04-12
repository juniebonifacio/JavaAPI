/**
 * 
 */
package com.objectbuilder;

import java.math.BigInteger;
import java.util.Map;

/**
 * @author Junie
 *
 */
public class NCObjectImpl {

	private BigInteger ID;
	private BigInteger projectID;
	private String name;
	private String description;
	private Map<Object, Attribute> attributes;
	
	/**
	 * @return the iD
	 */
	public BigInteger getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(BigInteger iD) {
		ID = iD;
	}
	/**
	 * @return the projectID
	 */
	public BigInteger getProjectID() {
		return projectID;
	}
	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(BigInteger projectID) {
		this.projectID = projectID;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the attributes
	 */
	public Map<Object, Attribute> getAttributes() {
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Map<Object, Attribute> attributes) {
		this.attributes = attributes;
	}
	
}
