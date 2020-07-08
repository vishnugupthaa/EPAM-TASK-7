package EPAM.Design_Pattern;

public class Shape {
	public static Shape shape=new Shape();
	public static Shape getInstance()
	{
		return shape;
	}
	private Shape()
	{
		
	}
	public void getShape()
	{
		System.out.println("The Shape is Circle");
	}

}