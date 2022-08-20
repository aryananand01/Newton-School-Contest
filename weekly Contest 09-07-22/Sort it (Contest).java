/*
Sort it (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers containing only 0 or 1. You can do following operations on the array:

swap elements at two indices
choose one index and change its value from 0 to 1 or vice- versa.

You have to do minimum number of above operations such that the final array is non-decreasing.
Input
First line of input contains a single integer N.
Second line of input contains N space separated integers denoting the array.

Constraints:
1 <= N <= 100000
elements of the array are 0 or 1.
Output
Minimum number of moves required such that the final array is non- decreasing.
Example
Sample Input 1
5
1 1 0 0 1

Sample Output 1
2

Explanation:
Swap indices (1, 3)
Swap indices (2, 4)

Sample Input 2
5
0 0 1 1 1

Sample Output 2
0

Sample Input 3
5
0 1 0 1 1

Sample Output 3
1
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int zero=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0){
               zero++;
           }
       }
       int res=0;
       for(int i=0;i<zero;i++){
           if(arr[i]==1){
               res++;
           }
       }
       System.out.println(res);
    }
}
