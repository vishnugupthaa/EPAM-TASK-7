package EPAM.Design_Pattern;

public class Singleton_5 {
	public static void main(String[] args) {
		//Shape s=new Shape(); 
		Shape s = Shape.getInstance();
		s.getShape();
	}

}