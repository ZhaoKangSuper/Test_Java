package NumberSystemConversion;

public class Test1 {
	
	public void Test1(){}
	
	public String Conversion(int i)
	{
		String result = "";
		char c;
		int m = 0 ;
		int n = i ;
	    if ( n == 0 )
	    	result = "0";  
	    if ( n > 0 )
	    {
	    	while( n % 16 != 0 || n/16 != 0){  
	    		m = n % 16;  
		    	if( m / 10 == 1 )
		    		c = ( char )( 65 + m % 10);  
		    	else
		    		c = ( char )( 48 + m );  
		    	result = c + result;  
		    	n = n / 16 ;  
		        }  
		    return result ;
	    }
	    else
	    {
	    	   for (int j = 0; j < 32; j++)
	           {
	               int t = (i & 0x80000000 >>> j) >>> (31 - j);
	               result += t ;
	           }
	    	return result;
	    }
	    
	    	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Test1()).Conversion(30));
		System.out.println((new Test1()).Conversion(-1));
		
	}

}
