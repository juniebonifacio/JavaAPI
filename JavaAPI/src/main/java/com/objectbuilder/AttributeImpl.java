package com.objectbuilder;

import java.math.BigInteger;
import java.util.Map;

public class AttributeImpl implements Attribute {

	private BigInteger ID;
	private int typeID;
	private String name;
	private String value;
	private Map <String,String> properties;
	
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
	 * @return the typeID
	 */
	public int getTypeID() {
		return typeID;
	}
	/**
	 * @param typeID the typeID to set
	 */
	public void setTypeID(int typeID) {
		this.typeID = typeID;
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

}
