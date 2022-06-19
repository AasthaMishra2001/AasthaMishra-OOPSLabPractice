package com.gl.lab;
import java.util.Scanner;
import com.gl.lab.Employee;
import com.gl.lab.credentialservice;

  public class Driver{
	public static void main(String[] args) {
			// TODO Auto-generated method stub

			String firstName,lastName,department = null;
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Please enter your first name");
			firstName =  sc.next();
			
			System.out.println("Please enter your last name");
			lastName =  sc.next();
			
			System.out.println("Please select your department:\n1. Technical\n2. Admin\n3. Legal\n4. Hr");
			int dept=sc.nextInt();
			switch (dept) {
			case 1:
				department = "Technical";
				break;
				
			case 2:
				department = "Admin";
				break;
			
			case 3:
				department = "Legal";
				break;
			
			case 4:
				department = "Hr";
				break;
				 
			}
			
			Employee emp = new Employee (firstName,lastName,department);
			credentialservice empcred= new credentialservice();
			empcred.generateEmailAddress(emp);
			empcred.generatePassword(emp);
			empcred.showCredentials(emp);
		}

	}


