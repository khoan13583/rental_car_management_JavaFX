package application;

import java.sql.Date;

public class customerData {
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private String carId;
    private String brand;
    private String model;
    private Double total;
    private Date dateRented;
    private Date dateReturn;
    
    public customerData(Integer customerId, String firstName, String lastName, String gender
    		, String carId, String brand, String model, Double total, Date dateRented, Date dateReturn ) {
    	this.customerId = customerId;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.gender = gender;
    	this.carId = carId;
    	this.brand = brand;
    	this.model = model;
    	this.total = total;
    	this.dateRented = dateRented;
    	this.dateReturn = dateReturn;	
    }
    
	public Integer getCustomerId(){
    	return customerId;
    }
    
    public String getFirstName(){
    	return firstName;
    }
    
    public String getLastName(){
    	return lastName;
    }
    
    public String getGender(){
    	return gender;
    }
    
    public String getCarId(){
    	return carId;
    }
    
    public String getBrand(){
    	return brand;
    }
    
    public String getModel(){
    	return model;
    }
    
    public Double getTotal(){
    	return total;
    }
    
    public Date getDateRented(){
    	return dateRented;
    }
    
    public Date getDateReturn(){
    	return dateReturn;
    }
    
}
