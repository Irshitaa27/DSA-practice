import java.util.HashMap;

public class CntSubArrXOR {
    public static int countSubarrayXOR(int arr[],int k){
     int n= arr.length;
     int cnt=0;
     int xor=0;
     HashMap<Integer,Integer>map=new HashMap<>();
     map.put(0,1);
     for(int num: arr){
         xor ^= num;
         int needed= xor^k;
         if(map.containsKey(needed)){
            cnt += map.get(needed);
         }
         if(map.containsKey(xor)){
            map.put(xor, map.get(xor)+1);
         }else{
            map.put(xor,1);
         }

     }
     return cnt;
    }

    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int k=6;
        System.out.println(countSubarrayXOR(arr, k));
    }
}
