package Collection_FrameWork;
import java.util.*;
public class SortEmployee implements Comparator<Employee2>{
	@Override
	public int compare(Employee2 e1,Employee2 e2) {
		return e1.id-e2.id;//ascending
//		return e2.id-e1.id;//descending
//		return e1.name.compareTo(e2.name);//ascending order comparing by name
	}
}
