package chapter3;

public class sample3_10
{
	public static void main(String[] args)
	{
		Car car1 ;
		car1=new Car();
		car1.setnumgas(1234,20.5);
		car1.show();
		
		System.out.println("�u�ä����T���T�o�q�ݬ�(-10.0)�ݬ�");
		
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
		System.out.println("�N�����]��"+ this.num+"�A �N�T�o�q�]��"+this.gas);
		}
		else 
		{
		System.out.println(g+"���O���T���T�o�q");
		System.out.println("�L�k�ܧ�T�o�q");
		
		}
	}
	
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}
