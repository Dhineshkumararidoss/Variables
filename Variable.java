package org.variable;

public class Variable {

	public static int a;
	int b ;
	private void empId(int b) {
		int a = 10;
		System.out.println(a+b);
	}
	
	private void empNo( int b) {
	
	     int a= 200087;  
	     System.out.println(a+b);
	}
	
	private void studentId() {
		 b = 100;
		}
	private void studentNo() {
		 b=200;
	}
	public static void companyId() {
		a=20000;
	}
	
	public static void companyNo() {
		a=50000;
	}
	private void companyFaxNo() {
		a=5000007;
	}
	
	public static void main(String[] args) {
		System.out.println("static------- variable");
		System.out.println(a);
		companyId();
		System.out.println(a);
		companyNo();
		System.out.println(a);
		Variable staticvariable = new Variable();
		staticvariable.companyFaxNo();
		System.out.println(a);
		Variable staticvariable1=new Variable();
		System.out.println(a);
		
		System.out.println("intance------ variable");
		Variable variable = new Variable();
		System.out.println(variable.b);
		variable.studentId();
		System.out.println(variable.b);
		variable.studentNo();
		System.out.println(variable.b);
		Variable variable1 = new Variable();
		System.out.println(variable1.b);
		variable1.studentId();
		System.out.println(variable1.b);
		variable1.studentNo();
		System.out.println(variable1.b);
		Variable instance = new Variable();
		System.out.println(instance.b);
		
		
		System.out.println("local----- variable");
		Variable variable3= new Variable();
		variable3.empId(300);
		variable3.empNo(400);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
