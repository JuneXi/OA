package fortinet;

import java.util.Arrays;

public class MultiDimensionArraySum {
	
public static Long getValue(int... indexOfDimension) {
    	
    	//code below only used to print all the index for my own test, please overwrite it
    	long value = 1;
        System.out.print(Arrays.toString(indexOfDimension)); 
        return value;
    }

    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   // Time complexity:  O(n)
   // Space complexity: O(1)
    	long sum = 0;
    	int[] iod = new int[lengthOfDeminsion.length];
    	int mul = 1;
    	for(int i = 0; i < lengthOfDeminsion.length; i++){
    		mul = mul * lengthOfDeminsion[i];
    	}
    	
    	for(int i = 0; i < mul; i++){
    		int temp = mul;
    		for(int j = 0; j < lengthOfDeminsion.length; j++){
    			iod[j] = i * temp / lengthOfDeminsion[j] % lengthOfDeminsion[j];
    			temp = temp / lengthOfDeminsion[j];
    		}
    		sum = sum + getValue(iod);
    	}
    	return sum;   	
    }
	

}
