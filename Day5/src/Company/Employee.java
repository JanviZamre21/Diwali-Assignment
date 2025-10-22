package Company;

public class Employee {

	    
	    private String empName;
	    private int empID;
	    private String empRole;

	    
	    public Employee() {
	        this.empName = "Unknown";
	        this.empID = 0;
	        this.empRole = "Not Assigned";
	    }

	   
	    public Employee(int empID, String empName) {
	        this.empID = empID;
	        this.empName = empName;
	        this.empRole = "Employee"; 
	    }

	    
	    public Employee(int empID, String empName, String empRole) {
	        this.empID = empID;
	        this.empName = empName;
	        this.empRole = empRole;
	    }

	    
	    public String getEmpName() { return empName; }
	    public void setEmpName(String empName) { this.empName = empName; }

	    public int getEmpID() { return empID; }
	    public void setEmpID(int empID) { this.empID = empID; }

	    public String getEmpRole() { return empRole; }
	    public void setEmpRole(String empRole) { this.empRole = empRole; }

	 
	    public void promote(String newRole) {
	        System.out.println(empName + " promoted from " + empRole + " to " + newRole);
	        this.empRole = newRole;
	    }

	   
	    @Override
	    public String toString() {
	        return "Employee Details:\n" +
	               "ID: " + empID + "\n" +
	               "Name: " + empName + "\n" +
	               "Role: " + empRole;
	    }
	}



