package OOPS;

public class employee {
	String name;
	int year;
	String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee emp1 = new employee();
		emp1.name = "Robert";
		emp1.year = 1994;
		emp1.address = "64C- WallsStreet";
		
		
		System.out.println(emp1.name);
		System.out.println(emp1.year);
		System.out.println(emp1.address);

		employee emp2 = new employee();
		emp2.name = "Sam";
		emp2.year = 2000;
		emp2.address = "68D- WallsStreet";
		
		
		System.out.println(emp2.name);
		System.out.println(emp2.year);
		System.out.println(emp2.address);

		employee emp3 = new employee();
		emp3.name = "John";
		emp3.year = 1999;
		emp3.address = "26B- WallsStreet";
		
		
		
		System.out.println(emp3.name);
		System.out.println(emp3.year);
		System.out.println(emp3.address);

	}

}
