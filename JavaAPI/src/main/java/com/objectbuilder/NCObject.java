package com.objectbuilder;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public interface NCObject {

	/**
	 * @return the iD
	 */
	public BigInteger getID();
	/**
	 * @param iD the iD to set
	 */
	public void setID(BigInteger iD);
	/**
	 * @return the projectID
	 */
	public BigInteger getProjectID();
	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(BigInteger projectID);
	/**
	 * @return the name
	 */
	public String getName();
	/**
	 * @param name the name to set
	 */
	public void setName(String name);
	/**
	 * @return the description
	 */
	public String getDescription();
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description);
	/**
	 * @return the attributes
	 */
	public Map<Object, Attribute> getAttributes();
	
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Map<Object, Attribute> attributes);
	
}
