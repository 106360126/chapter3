package chapter3;

public class sample3_23
{
	public static void main(String[] args)
	{
	
		Car car1 ;
		car1=new Car();
		
		car1.show();
		
		int number =1234;
		double gasoline =20.5;
		String str = "1����";
	
		car1.setcar(number, gasoline);
		car1.setname(str);
		
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	private String name;
	public Car()
	{
		num =0;
		gas=0.0;
		name="�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+ num +"�N�T�o�q�]��"+ this.gas);
	}
	public void setname(String nm)
	{
		name=nm;
		System.out.println("�N�W�ٳ]��"+name);
	}
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
		System.out.println("���W�O"+this.name);
	}
}
