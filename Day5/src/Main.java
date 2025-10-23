import Company.Employee;

public class Main {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Janvi");
        Employee e3 = new Employee(102, "Bhushan", "Manager");

        System.out.println(e1 + "\n");
        System.out.println(e2 + "\n");
        System.out.println(e3 + "\n");

     
        e3.promote("Senior Manager");
        System.out.println("\nAfter Promotion:\n" + e3);
    }

	}



