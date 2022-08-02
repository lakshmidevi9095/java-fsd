
interface Aclass
{
	default void display()
	{
		System.out.println("Aclass method");
	}
	
	
}

interface Bclass
{
	default void display()
	{
		System.out.println("Bclass method");
	}
}

public class diamond implements Aclass,Bclass {
	
	@Override
	public void display() {
		Aclass.super.display();
		Bclass.super.display();
	}

	public static void main(String[] args) {
	diamond d=new diamond();
	d.display();

	System.out.println("Hence, diamond Problem can be solved using interface");
	}

}