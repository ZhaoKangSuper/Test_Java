package StringMatching;

public class Test1 {
	
	public Test1(){}
	
	 public boolean match(String input,String pattern){
	        if( input == null || pattern == null) 
	        	return false;
	        return matchCore(input,0,pattern,0);
	    }
	    private boolean matchCore(String input,int i,String pattern,int p){
	        if((input.length() == i) && (pattern.length() == p)){
	            return true;
	        }
	        if((i != input.length() ) && (pattern.length() == p)){
	            return false;
	        }
	        if(( input.length() == i) && (pattern.length() != p)){
	            return false; 
	        }
	        
	        if(( p + 1 < pattern.length() ) && (pattern.charAt(p + 1) == '*')){
	            if(( input.charAt( i ) == pattern.charAt( p )) || (pattern.charAt( p ) == '.')){
	                return matchCore(input,i+1,pattern,p+2) 
	                     || matchCore(input,i+1,pattern,p)    
	                     || matchCore(input,i,pattern,p+2);   
	            }else{
	                return matchCore(input,i,pattern,p+2);
	            }
	        }
	        
	        if((input.charAt(i) == pattern.charAt( p ))||(pattern.charAt( p ) == '.')){
	            return matchCore(input,i+1,pattern,p+1);
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
			System.out.println((new Test1()).match("aaa", "a.a"));
			System.out.println((new Test1()).match("aaa", "abaca"));
			System.out.println((new Test1()).match("aa.a", "aba"));
		}
}
