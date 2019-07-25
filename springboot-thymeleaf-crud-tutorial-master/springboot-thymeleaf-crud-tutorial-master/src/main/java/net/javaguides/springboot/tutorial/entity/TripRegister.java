package net.javaguides.springboot.tutorial.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "tripregister")
public class TripRegister {

	
	private String lorryNumber;
	
	private String driverName;

	public  TripRegister() {
		// TODO Auto-generated constructor stub
	}
	
	@DynamoDBHashKey(attributeName = "lorryNumber")
	public String getLorryNumber() {
		return lorryNumber;
	}

	public void setLorryNumber(String lorryNumber) {
		this.lorryNumber = lorryNumber;
	}
	@DynamoDBAttribute(attributeName = "driverName")
	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
	
}
