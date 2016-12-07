package base;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int x)
	{
		iValue = x;
	}
	public int getiValue()
	{
		return iValue;
	}
	public static boolean isEven(int a)
	{
		if((a %2)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int a)
	{
		if((a %2)!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(int a)
	{
		if(a==1)
		{
			return false;
		}
		for (int prime=2; prime < a; prime ++)
		{
			if(a %prime==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public boolean isEven()
	{
		return isEven(iValue);
	}
	public boolean isOdd()
	{
		return isOdd(iValue);
	}
	public boolean isPrime()
	{
		return isPrime(iValue);
	}
	public static boolean isEven(MyInteger a)
	{
		return a.isEven();
	}
	public static boolean isOdd(MyInteger a)
	{
		return a.isOdd();
	}
	public static boolean isPrime(MyInteger a)
	{
		return a.isPrime();
	}
	public boolean equals(int b)
	{
		return (iValue==b);
	}
	public boolean equals(MyInteger b)
	{
		return equals(b.getiValue());
	}
}
