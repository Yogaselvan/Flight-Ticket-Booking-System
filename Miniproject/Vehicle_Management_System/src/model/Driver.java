package model;

public class Driver {
	private int id;
	private String name;
    private String address;
    private String mobile;
    private String license;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", license="
				+ license + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getMobile()=" + getMobile() + ", getLicense()=" + getLicense() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Driver() {
		super();
	
	}
	public Driver(int id, String name, String address, String mobile, String license) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.license = license;
    }
	

   
}