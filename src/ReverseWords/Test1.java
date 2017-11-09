package ReverseWords;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {
	
	public Test1(){}
	
	public String reversrWords(String s)
	{
		 String[] words = s.trim().split(" +");
	     Collections.reverse(Arrays.asList(words));
	     return String.join(" ", words);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Test1()).reversrWords("the sky is blue"));
	}

}
