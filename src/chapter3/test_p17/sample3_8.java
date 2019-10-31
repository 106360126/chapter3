package chapter3;

public class sample3_8
{
	public static void main(String[] args)
	{
		Car car1 ;
		car1=new Car();
		car1.setnumgas(1234,20.5);
		int number = car1.getnum();
		double gasoline = car1.getgas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+number+" ，汽油量是"+gasoline);
		
	}
}
class Car
{
	int num;
	double gas;
	void setnumgas(int n,double g)
	{
		num = n;
		gas=g;
		System.out.println("將車號設為"+ this.num+"， 將汽油量設為"+this.gas);
		
	}
	
	int getnum()
	{
		System.out.println("調查車號");
		return num;
		
	}
	double getgas()
	{
		System.out.println("調查汽油量");
		return gas;
		
	}
}
