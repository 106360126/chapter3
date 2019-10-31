package chapter3;

public class sample3_7
{
	public static void main(String[] args)
	{
		Car car1 ;
		car1=new Car();
		
		int number =1234;
		double gasoline =20.5;
		
		car1.setnumgas(number,gasoline);
		
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
	
	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量為"+this.gas);
		
	}
}
