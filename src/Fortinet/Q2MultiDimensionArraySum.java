package fortinet;

import java.util.Arrays;

public class MultiDimensionArraySum {
	
public static Long getValue(int... indexOfDimension) {
    	
    	//codes below only used to print all the index for my own test, please overwrite them
    	long value = 1;
        System.out.print(Arrays.toString(indexOfDimension)); 
        return value;
    }

    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   // Time complexity:  O(n)
   // Space complexity: O(1)
	    
    	if(lengthOfDeminsion == null || lengthOfDeminsion.length == 0){
    		return (long) 0;
    	}
    	
    	long sum = 0;
    	//Initialize an array to store the indexOfDimension
    	int[] iod = new int[lengthOfDeminsion.length];
   	
    	/*It's easy to imagine that we should use a loop that has variable number of levels (not sure if it's allowed in java) 
    	But we can calculate the multiplication of the domain from each level 
    	Then map the index back using only one variable.*/
    	int mul = 1;
    	for(int i = 0; i < lengthOfDeminsion.length; i++){
    		mul = mul * lengthOfDeminsion[i];
    	}
    	for(int i = 0; i < mul; i++){
    		int temp = mul;
    		for(int j = 0; j < lengthOfDeminsion.length; j++){
    			iod[j] = i * lengthOfDeminsion[j] / temp  % lengthOfDeminsion[j];
    			temp = temp / lengthOfDeminsion[j];
    		}
    		sum = sum + getValue(iod);
    	}
    	return sum;   	
    }
	

}
