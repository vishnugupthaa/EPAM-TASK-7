package EPAM.Design_Pattern;

public class Composite_Pattern1 {

	public static void main(String[] args) {
		Employee Chairman = new Employee("YVS Vaishnavi","Chairman",1000000);

		Employee HR = new Employee("Rajeshwari","Human Resource", 100000);
		Employee Marketing_Director = new Employee("Sanjay","Marketing Director",80000);

		Employee Production_Manager = new Employee("Pallavi","Product Manager",50000);
		Employee Training_and_development_officer = new Employee("Akanksha","Training and development officer", 50000);

		Employee Production_Staff = new Employee("Ranjitha","Prduction_Staff", 10000);
		Employee Store_Manager= new Employee("Ramya","Store_Manager", 10000);

		Chairman.add(HR);
		Chairman.add(Marketing_Director);

		HR.add(Training_and_development_officer);
		Marketing_Director.add(Production_Manager);

		Production_Manager.add(Production_Staff);
		Production_Manager.add(Store_Manager);
		System.out.println(Chairman); 
		for (Employee headEmployee : Chairman.getAssociates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getAssociates()) {
				System.out.println(employee);
			}
		}	
	}

}