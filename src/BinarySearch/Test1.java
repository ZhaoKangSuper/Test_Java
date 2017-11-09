package BinarySearch;

public class Test1 {
	public class test {
		
		public int Solution(int [] A,int [] B)
		{
			int sum = 0 ;
			for (int i = 0; i < B.length; i++) {
				if(binarySearch(A,B[i],0,A.length)!=-1)
					sum++;
			}
			return sum;
		}
		
		public int binarySearch(int[] dataset,int data,int beginIndex,int endIndex)
		{  
			int midIndex = (beginIndex+endIndex)/2;  
			if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
				return -1;  
				}
			if(data <dataset[midIndex]){  
				return binarySearch(dataset,data,beginIndex,midIndex-1);  
			   }
			else if(data>dataset[midIndex]){  
			    return binarySearch(dataset,data,midIndex+1,endIndex);  
			   }
			else{  
				return midIndex;  
			   }  
		   } 
	}


}
