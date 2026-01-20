package ObjectClass;
import java.util.Objects;
public class Home {
	int hs_no;
	String loc;
	
	public Home(int hs_no,String loc) {
		this.hs_no=hs_no;
		this.loc=loc;
	}
	
	@Override
	public String toString() {
		return "House Number: "+hs_no+", House Location: "+loc;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hs_no,loc);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null || this.getClass()!=o.getClass()) {
			return false;
		}
		else {
			Home h=(Home)o;
			return h.hs_no==this.hs_no;
		}
	}
	
	public static void main(String[] args) {
		Home h1=new Home(3,"Dum Dum");
		Home h2=null;
		h2.toString();
	}
}
