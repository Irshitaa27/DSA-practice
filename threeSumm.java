import java.util.*;

public class threeSumm {

    public static List<List<Integer>>threeSum(int nums[]){
        List<List<Integer>>ans=new ArrayList<>();
        if(nums==null || nums.length<3) return ans;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j < k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>>res= threeSum(nums);
        for(List<Integer>trip:res){
            System.out.print(trip);
        }

    }
    
}
