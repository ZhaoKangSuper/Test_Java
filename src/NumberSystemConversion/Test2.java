package NumberSystemConversion;

public class Test2 {
	
	public String Conversion(int i)
	{
		if(i >= 0 )
			return Integer.toHexString(i);
		else
			return Integer.toBinaryString(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Test2()).Conversion(30));
		System.out.println((new Test2()).Conversion(-1));
	}

}
