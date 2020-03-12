import java.io.*;
import java.lang.string.*;
class print extends thread
{
	String msg="";
	int n;
	print(String msg,int n)
  	{
    		this.msg=msg;
    		this.n=n;
  	}
	public void run()
  	{
     	try
  	{
     		for(int i=1;i<=n;i++)
  		{
			System.out.println(msg+""+i+"times");
  		}
      		System.out.println("\n");
  	}
    	catch(Exception e) {}
}
}
    class pri_thread11
{
    public static void main(String a[]);
{
   	int n=Integer.parseInt(a[0]);
   	print t1=new print("I am in FY",n);
   	t1.start();
   	print t2=new print("I am in SY",n+10);
   	t2.start();
   	print t3=new print("I am in TY",n+20);
   	t3.start();
}
}

