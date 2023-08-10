import java.util.*;
public class Solution {
    public static boolean isPossible(int[] stalls, int min, int k){
        int cows = 1;               
        int lastCowPosition = stalls[0];
        for(int i = 1;i<stalls.length;i++){
            if(stalls[i] - lastCowPosition >= min){
                cows++;
                lastCowPosition = stalls[i];
                if(cows >= k){
                    return true;
                }
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        //    Write your code here.
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1] - stalls[0]; 
        int res = 0;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(isPossible(stalls,mid,k)){
                res = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return res;
    }
}