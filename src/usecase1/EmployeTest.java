package usecase1;

import java.util.Scanner;

public class EmployeTest {

	public static void main(String[] args) {
		Employe obj=new Employe();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter fName");
		String fN = scan.next();
		System.out.println("Enter lName");
		String lN = scan.next();
		System.out.println("Enter empId");
		int eId = scan.nextInt();
		System.out.println("Enter exp");
		int exp = scan.nextInt();
		System.out.println("Enter designation");
		String deg = scan.next();
		System.out.println("Enter salary");
		float salary = scan.nextFloat();
		obj.setfName(fN);
		obj.setlName(lN);
		obj.setEmpId(eId);
		obj.setExp(exp);
		obj.setDesignation(deg);
		obj.setSal(salary);
		System.out.println("FirstName:"+obj.getfName());
		System.out.println("LastName:"+obj.getlName());
		System.out.println("Experience:"+obj.getExp());
		System.out.println("Disignation:"+obj.getDesignation());
		System.out.println("Salary:"+obj.getSal());
	    if(deg=="manager" && exp>=5) 
	    {
	    	double hike_salary=salary+(salary*0.20);
	    	System.out.println("Salary with Hike:"+hike_salary);
	    	
	    }
	    else if(exp>=3)
	    {
	       double hike_sal= salary+(salary*0.10);
	       System.out.println("Salary with Hike:"+hike_sal);
	    }
	    
	}
}
