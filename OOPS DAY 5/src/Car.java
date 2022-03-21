
public class Car {
	//member variables
	//member methods
	int noofcars; 
	//student class --->variables int
	//sid , String sname,float sgpa ,String sbranch
	String Model;
	int speed;
	public void setSpeed(int S)
	{
	this.speed=S;
	}
	public int getSpeed()
	{
	return speed;
	}
	void display()
	{
	System.out.println("Welcome to Kia-Motors");
	}
	public static void main(String[] args)
	{
	//object creation
	//syntax for object -- classname objectname=newclassname();
	Car obj=new Car();
	obj.display();
	 obj.setSpeed(80);
	 System.out.println(obj.getSpeed());
	}
	
}
