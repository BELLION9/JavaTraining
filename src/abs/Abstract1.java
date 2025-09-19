package abs;

abstract class Employee {
	String name;
	int age;
	double baseSalary;
	String role;
	abstract double calculateBonus();
	void Details() {
		System.out.println("Role: "+role);
		System.out.println("Name: " +name );
		System.out.println("Age: " +age);
		System.out.println("Salary: "+baseSalary);	
	}	
}
class Developer extends Employee {
	Developer(String r, String n, int a, double s){
		name = n;
		baseSalary = s;
		age = a;
		role = r;
	}
	double calculateBonus() {
		return baseSalary*0.10;
	}
}
class Manager extends Employee {
	Manager(String r,String n, int a, double s){
		name = n;
		baseSalary = s;
		age = a;
	}
	double calculateBonus() {
		return baseSalary*0.20;
	}
}


public class Abstract1 {

	public static void main(String[] args) {
		Developer d = new Developer("Developer","Krish", 21, 50000);
        d.Details();	
        System.out.println("Bonus: " + d.calculateBonus());
        System.out.println("-------");
        Manager m = new Manager("Manager","Priyanshu", 22, 80000);
        m.Details();
        System.out.println("Bonus: " + m.calculateBonus());


	}

}
