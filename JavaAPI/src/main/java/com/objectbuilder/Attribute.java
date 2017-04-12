package com.objectbuilder;

import java.math.BigInteger;
import java.util.Map;

public interface Attribute {

	public BigInteger getID();
	public int getTypeID();
	public void setTypeID(int typeID);
	public String getName();
	public void setName(String name);
	public String getValue();
	public void setValue(String value);
	public Map<String, String> getProperties();
	public void setProperties(Map<String, String> properties);
	
}
