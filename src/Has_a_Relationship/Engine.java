package Has_a_Relationship;

public class Engine {
	
	private double cc;
	private String fuel_type;
	
	public void setCc(double cc) {
		this.cc=cc;
	}
	
	public void setFuel_Type(String fuel_type) {
		this.fuel_type=fuel_type;
	}
	
	public double getCc() {
		return this.cc;
	}
	
	public String getFuel_Type() {
		return this.fuel_type;
	}
}
