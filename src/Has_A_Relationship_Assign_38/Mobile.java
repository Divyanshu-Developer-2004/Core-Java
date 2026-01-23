package Has_A_Relationship_Assign_38;

public class Mobile {
	
	private Battery ba;//Composition Has-a Relationship
	private Sim si;//Aggregation Has-a Relationship
	public Mobile(Battery ba) {
		this.ba=ba;
	}
	
	public Sim getSi() {
		return si;
	}
	
	public void setSi(Sim si) {
		this.si = si;
	}
	
	public Battery getBattery() {
		return ba;
	}
	
	public void setBattery(Battery ba) {
		this.ba = ba;
	}
}
