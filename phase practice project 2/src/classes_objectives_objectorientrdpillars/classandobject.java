package classes_objectives_objectorientrdpillars;
public class classandobject {
	
	double areaOfCircle;
	
	public double area(int a,int b)
	{
		areaOfCircle=a*b*3.14;
		return areaOfCircle;
	}
	
	public static void main(String[] args)
	{
		classandobject c=new classandobject();      //Object creation 
		
		System.out.println(c.area(2,3));
	}


}
