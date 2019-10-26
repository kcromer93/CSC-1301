package csc1301;

public class MedianFind {
	public static void main(String[] args) {
		int int1 = 19;
		int int2 = 7;
		int int3 = -75;
		if((int1<int2 && int2<int3) || (int3 < int2 && int2 < int1)){ 
			System.out.println("The median is: "+int2);
		}else if((int3<int1 && int1<int2) || (int2 < int1 && int1 < int3)){ 
			System.out.println("The median is: "+int1);
			
		}else if((int2<int3 && int3<int1) || (int1 < int3 && int3 < int2)){ 
			System.out.println("The median is: "+int3);
		}
	}
	
	
}
