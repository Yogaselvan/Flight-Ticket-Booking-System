package model;

public class Vehicle {
	private String numberPlate;
    private int id;
    private String model;
    private int year;
    public String getNumberPlate() {
		return numberPlate;
	}
	public Vehicle(String numberPlate, int id, String model, int year) {
		super();
		this.numberPlate = numberPlate;
		this.id = id;
		this.model = model;
		this.year = year;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	@Override
    public String toString() {
        return id + " " + model + " (" + year + ") - " + numberPlate;
    }	
}
