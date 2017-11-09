package ReverseWords;

public class Test2 {
	
	public Test2(){}
	
	public String reverseWords(String s)
	{
		String result = "";
		String [] words = s.trim().split("\\s+");
		for (int i = words.length - 1 ; i > 0; i--) {
			result += words[i] + " " ;
		}
		return result + words[0] ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Test2()).reverseWords("the sky is blue"));
	}

}
