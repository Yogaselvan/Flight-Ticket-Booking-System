package model;

public class Service {
	private int id;
	private String fuelType;
    private String fuelAmount;
    private String serviceType;
    private String serviceAmount;
    private String serviceDate;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getFuelAmount() {
		return fuelAmount;
	}
	public void setFuelAmount(String fuelAmount) {
		this.fuelAmount = fuelAmount;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceAmount() {
		return serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", fuelType=" + fuelType + ", fuelAmount=" + fuelAmount + ", serviceType="
				+ serviceType + ", serviceAmount=" + serviceAmount + ", serviceDate=" + serviceDate + ", getId()="
				+ getId() + ", getFuelType()=" + getFuelType() + ", getFuelAmount()=" + getFuelAmount()
				+ ", getServiceType()=" + getServiceType() + ", getServiceAmount()=" + getServiceAmount()
				+ ", getServiceDate()=" + getServiceDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Service() {
		super();
		
	}
	public Service(int id,String fuelType, String fuelAmount, String serviceType, String serviceAmount, String serviceDate) {
        this.id = id;
        this.fuelType = fuelType;
        this.fuelAmount = fuelAmount;
        this.serviceType = serviceType;
        this.serviceAmount = serviceAmount;
        this.serviceDate = serviceDate;
    }

}
