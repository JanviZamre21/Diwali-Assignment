import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import Company.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> employees = new ArrayList<>();
	        boolean running = true;

	        while (running) {
	            System.out.println("\n--- Employee Management Menu ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Remove Employee");
	            System.out.println("3. Show All Employees");
	            System.out.println("4. Show Employees Sorted by ID");
	            System.out.println("5. Find Employee by Name");
	            System.out.println("6. Save All Employees to File");
	            System.out.println("7. Quit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Employee ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Employee Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Employee Role: ");
	                    String role = sc.nextLine();
	                    employees.add(new Employee(id, name, role));
	                    System.out.println("Employee added successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter Employee ID to remove: ");
	                    int removeId = sc.nextInt();
	                    boolean removed = employees.removeIf(e -> e.getEmpID() == removeId);
	                    if (removed) System.out.println("Employee removed successfully!");
	                    else System.out.println("Employee with ID " + removeId + " not found.");
	                    break;

	                case 3:
	                    if (employees.isEmpty()) System.out.println("No employees to show.");
	                    else {
	                        System.out.println("All Employees:");
	                        for (Employee e : employees) System.out.println(e);
	                    }
	                    break;

	                case 4:
	                    if (employees.isEmpty()) System.out.println("No employees to show.");
	                    else {
	                        employees.sort(Comparator.comparingInt(Employee::getEmpID));
	                        System.out.println("Employees Sorted by ID:");
	                        for (Employee e : employees) System.out.println(e);
	                    }
	                    break;

	                case 5:
	                    System.out.print("Enter Employee Name to search: ");
	                    String searchName = sc.nextLine();
	                    boolean found = false;
	                    for (Employee e : employees) {
	                        if (e.getEmpName().equalsIgnoreCase(searchName)) {
	                            System.out.println("Employee Found: " + e);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found) System.out.println("Employee not found.");
	                    break;

	                case 6:
	                    System.out.print("Enter filename to save (e.g., employees.txt): ");
	                    String filename = sc.nextLine();
	                    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
	                        for (Employee e : employees) {
	                            writer.println(e.getEmpID() + "," + e.getEmpName() + "," + e.getEmpRole());
	                        }
	                        System.out.println("Employees saved successfully to " + filename);
	                    } catch (IOException ex) {
	                        System.out.println("Error saving file: " + ex.getMessage());
	                    }
	                    break;

	                case 7:
	                    System.out.println("Exiting program. Goodbye!");
	                    running = false;
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }

	        sc.close();
	    }

	}



