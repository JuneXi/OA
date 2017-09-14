package fortinet;

import java.util.Arrays;

public class MultiDimensionArraySum {
    // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
    	
    	//code below only used to print all the index in test
    	long value = 1;
        System.out.print(Arrays.toString(indexOfDimension)); 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   // Your resolution 
   // Time complexity:  
   // Space complexity: 
    	
    	//indexOfDimension
    	int[] iod = new int[lengthOfDeminsion.length];
    	long sum = sumHelper(lengthOfDeminsion, 0, 0, iod);
    	return sum;
    }
    
    private static long sumHelper(int[] lod, long sum, int cur, int[] iod){
    	//when we get a complete indexOfDimension, use provided method getValue
    	if(cur == lod.length){
    		return sum + getValue(iod);
    	}
    	//
    	for(int i = 0; i < lod[cur]; i++){
    		iod[cur] = i;
    		sum = sumHelper(lod, sum, ++cur, iod);  
    		cur--;
    	}
    	return sum;   	
    }
}
