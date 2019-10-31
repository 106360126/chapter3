package chapter3;

public class sample3_10
{
	public static void main(String[] args)
	{
		Car car1 ;
		car1=new Car();
		car1.setnumgas(1234,20.5);
		car1.show();
		
		System.out.println("只並不正確的汽油量看看(-10.0)看看");
		
		car1.setnumgas(1234, -10.0);
		car1.show();
		
	}
}
class Car
{
	private int num;
	private double gas;
	public void setnumgas(int n,double g)
	{
		if(g>0&&g<100)
		{
		num = n;
		gas=g;
		System.out.println("將車號設為"+ this.num+"， 將汽油量設為"+this.gas);
		}
		else 
		{
		System.out.println(g+"不是正確的汽油量");
		System.out.println("無法變更汽油量");
		
		}
	}
	
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
