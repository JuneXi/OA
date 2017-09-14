package fortinet;
import java.util.List;

/**
 * Given a list of numbers, see if you can separate them in to k groups such that each group has the same sum. 
 * Assuming list is not empry and k is positive
 *
 * @param list - input list 
 * @param k - groups
 * 
 * @return true or false
 */

public class Seperate {
	public boolean separate(List<Integer> list, int k){
		   // Time complexity:  O(nlogn)
		   // Space complexity: O(n)?
		if(k == 1){
			return true;
		}
		if(list.size() < k){
			return false;
		}
		//find sum
		int sum = 0;
		for( int i = 0; i < list.size(); i++){
			sum = sum + list.get(i);
		}
		if(sum % k != 0){
			return false;
		}
		
		//if this element is in subset already
		boolean[] used = new boolean[list.size()];
		
		return seperateHelper(list, used, 0, k, 0, sum/k, 0);	
		
		}
	//recursion
	//subsetSum - currently sum of all the element in this subset
	//count - how many qualified subset has been found
	//targetSum - if can be seperated, sum of the sebset
	//cur - current location of the element in list
	private boolean seperateHelper(List<Integer> list, boolean[] used, int subsetSum, int k, int count, int targetSum, int cur){		
		if(subsetSum == targetSum){
			count++;
			//if we have found k-1 subset, which means the last subsetSum also equals to targetSum
			if(count == k - 1){
				return true;
			}else{
				//recurse to find another subset, reset subsetSum & cur to 0
				return seperateHelper(list, used, 0, k, count, targetSum, 0);
			}
		}
		for(int i = cur; i < list.size(); i++){
			if(used[i]){
				continue;
			}
			int temp = subsetSum + (int)list.get(i);
			if(temp <= targetSum){
				used[i] = true;
				subsetSum = subsetSum + (int)list.get(i);
				boolean res = seperateHelper(list, used, subsetSum, k, count, targetSum, cur + 1);
				used[i] = false;
				subsetSum = subsetSum - (int)list.get(i);
				if(res){
					return true;
				}
			}

		}
		return false;
	}

}
