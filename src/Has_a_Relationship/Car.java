package Has_a_Relationship;

public class Car {
	
	private int id;
	private String color;
	private String brand;
	private Engine engine;
	
	//Constructor of Car
	public Car(int id,String brand,String color,double cc,String fuel_type) {
		setID(id);
		setBrand(brand);
		setColor(color);
		setEngine(new Engine());
		engine.setCc(cc);
		engine.setFuel_Type(fuel_type);
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public Engine getEngine() {
		return this.engine;
	}

}
