import java.util.ArrayList;
public class Solution {
    public static int noOfStudentsAllowed(ArrayList<Integer> arr,int m){
        int n = arr.size();
        int student = 1;
        int pages = 0;
        for(int i = 0;i<n;i++){
            if(pages + arr.get(i) <= m){
                pages += arr.get(i);
            }
            else{
                student++;
                pages = arr.get(i);
            }
        }
        return student;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.

        // Edge case
        if(m > n){
            return -1;
        }

        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i = 0;i<arr.size();i++){
            low = Math.max(low, arr.get(i));
            high += arr.get(i);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            int student = noOfStudentsAllowed(arr, mid);
            if(student > m){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}