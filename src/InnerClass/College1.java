package InnerClass;

public class College1 {
	
	//Enum of Gender
	enum Gender{Male,Female}
	
	//Enum of Mode
	enum Mode{Online,Offline}
	
	//Student Inner Class
	class Student{
		private int id;
		private String name;
		private Trainer tr;
		private Gender gen;
		private Mode mode;
		
		public Student(int id,String name,Gender gen,Trainer tr,Mode mode) {
			this.id=id;
			this.name=name;
			this.gen=gen;
			this.tr=tr;
			this.mode=mode;
		}
		
		//getter setter for id
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		//getter setter for name
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		//getter setter for tr
		public Trainer getTr() {
			return tr;
		}
		public void setTr(Trainer tr) {
			this.tr = tr;
		}
		
		//getter setter for gender
		public Gender getGen() {
			return gen;
		}
		public void setGen(Gender gen) {
			this.gen = gen;
		}
		
		//getter setter for Mode
		public Mode getMode() {
			return mode;
		}
		public void setGen(Mode mode) {
			this.mode=mode;
		}
	}
	
	//Trainer Inner Class
	class Trainer implements Staff{
		private int t_id;
		private String t_name;
		private Gender t_gen;
		private double salary;
		
		public Trainer(int t_id,String t_name,Gender t_gen,double salary) {
			this.t_id=t_id;
			this.t_name=t_name;
			this.t_gen=t_gen;
			this.salary=salary;
		}
		//getter setter for t_id
		public int getT_id() {
			return t_id;
		}
		public void setT_id(int t_id) {
			this.t_id = t_id;
		}
		
		//getter setter for t_name
		public String getT_name() {
			return t_name;
		}
		public void setT_name(String t_name) {
			this.t_name = t_name;
		}
		
		//getter setter for trainer gender
		public Gender getT_gen() {
			return t_gen;
		}
		public void setT_gen(Gender t_gen) {
			this.t_gen = t_gen;
		}
		
		//getter setter for trainer salary
		public double getSalary() {
			return salary;
		}
		public void setTSalary(double salary) {
			this.salary=salary;
		}
		
		public void updateSalary(double sal) {
			this.salary=sal;
		}
	}
	
	//Security Guard Inner Class
	class SecurityGuard implements Staff{
		private int s_id;
		private String s_name;
		private Gender s_gen;
		private double salary;
		
		public SecurityGuard(int s_id,String s_name,Gender s_gen,double salary) {
			this.s_id=s_id;
			this.s_name=s_name;
			this.s_gen=s_gen;
			this.salary=salary;
		}
		//getter setter for s_id
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		
		//getter setter for s_name
		public String getS_name() {
			return s_name;
		}
		public void setS_name(String s_name) {
			this.s_name = s_name;
		}
		
		//getter setter for s_gender
		public Gender getS_gen() {
			return s_gen;
		}
		public void setS_gen(Gender s_gen) {
			this.s_gen = s_gen;
		}
		
		//getter setter for Security Guard salary
		public double getSalary() {
			return salary;
		}
		public void setTSalary(double salary) {
			this.salary=salary;
		}
		
		public void updateSalary(double sal) {
			this.salary=sal;
		}
	}
	
	//Staff Inner Interface
	interface Staff{
		void updateSalary(double sal);
		
	}
	
	public static void main(String[] args) {
		College1 c=new College1();
		College1.Trainer t1=c.new Trainer(1,"Dinga Ka Papa",Gender.Male, 66000.0);
		College1.Trainer t2=c.new Trainer(2,"Dingi Ka Papa",Gender.Male, 72000.0);
		College1.Student s1=c.new Student(1, "Dinga",Gender.Male, t2, Mode.Online);
		College1.Student s2=c.new Student(1, "Dingi",Gender.Female, t1, Mode.Offline);
		College1.SecurityGuard seg1=c.new SecurityGuard(11,"Genda",Gender.Male,33000.0);
	}
}
