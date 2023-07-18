package week1day2;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {4,3,5,9,5,2};
		Arrays.sort(num);
		for (int i = 0 ; i<num.length -1 ; i++) {
			if (num [i]==num[i+1]) {
			System.out.println("Duplicate numbers "+num [i+1]);	
			}
		}
	
	}

}
