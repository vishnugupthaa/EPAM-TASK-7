package EPAM.Design_Pattern;
import java.util.*;


public class Employee {
	private String name;
	private String dept;
	private int idno;
	private List<Employee> associate;
	public Employee(String name,String dept, int idno) {
		this.name = name;
		this.dept = dept;
		this.idno = idno;
		associate = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		associate.add(e);
	}

	public void remove(Employee e) {
		associate.remove(e);
	}

	public List<Employee> getAssociates(){
		return associate;
	}

	public String toString(){
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", Idno :" + idno+" ]");
	}   

}
