package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		System.out.println("The missing number is:");
				
		for (int i = 0; i < arr.length; i++) {
			
		//	for( int j = i + 1; j < arr.length; ++j) {
				
				if(i+1!=arr[i]) {
					
					System.out.println(i+1);
					
					break;
				}
			}
		}
}
