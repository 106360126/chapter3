package chapter3;

public class sample3_4 
{
	public static void main(String[] args)
	{
		Carr car1 ;
		car1=new Carr();
		
		car1.num=1234;
		car1.gas =20.5;
		car1.show();
		car1.show();
	}
}
class Carr
{
	int num;
	double gas;
	void show()
	{
		System.out.println("�����O"+ this.num);
		System.out.println("�T�o�q�O"+ this.gas);
	}
}
