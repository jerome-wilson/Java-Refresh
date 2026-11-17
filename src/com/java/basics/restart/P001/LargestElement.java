package com.java.basics.restart.P001;

public class LargestElement {
    public int largestElementInArray(int[] array){		
        int largest = array[0];
		for (int j = 1; j < array.length; j++) {			
            if(array[j] > largest) {				
                largest = array[j];
			}
		}
		return largest;
	}
}

