import java.util.*;
public class fourSumm {
    
    public static List<List<Integer>>quad(int arr[],int target){
       int n= arr.length;
       List<List<Integer>>ans=new ArrayList<>();
       Arrays.sort(arr);
       if(arr==null || n<4) return ans;
       for(int i=0;i<n;i++){
         if(i>0 && arr[i]==arr[i-1]) continue;
         for(int j=i+1;j<n;j++){
            if(j>i+1 && arr[j]==arr[j-1]) continue; // duplicate elements skip
            int k= j+1;
            int l=n-1;
            while(k<l){
                long sum = arr[i]+arr[j]+arr[k]+arr[l];
                if(sum==target){
                 ans.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                 k++;
                 l--;
                
                while(k<l && arr[k]==arr[k-1]) k++;
                while(k<l && arr[l]==arr[l+1]) l--;
            }else if(sum>target){

                    l--;
                }else{
                    k++;
                }
            }
         }
       }
    
   return ans;
        }

        public static void main(String[] args) {
            int arr[]={1,0,-1,0,-2,2};
            int target= 0;
            List<List<Integer>> result = quad(arr, target);
            System.out.print("Quadruplets");
            for(List<Integer> quad : result){
                System.out.println(quad);
            }

        }
    }

