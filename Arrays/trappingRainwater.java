import java.util.*;
public class trappingRainwater {

public static int trappedRainwater(int height[]){
    //calculate max left boundary
   int leftMax[]= new int[height.length];
   leftMax[0]=height[0];
   for(int i=1;i<height.length;i++){
    leftMax[i]=Math.max(height[i],leftMax[i-1]);
   }
    //calculate max right boundary
   int rightMax[]=new int[height.length];
   rightMax[height.length-1] = height[height.length-1];
   for(int i=height.length-2;i>=0;i--){
    rightMax[i]=Math.max(height[i],rightMax[i+1]);
   }
    //loop
int trappedWater = 0;
for(int i=0;i<height.length;i++){
    int waterlevel = Math.min(leftMax[i],rightMax[i]);  //waterlevel
     //trappedWater= waterlevel-height[i]*width(here width=1)
    trappedWater += waterlevel - height[i];
}
   return trappedWater;
}
 public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int result = trappedRainwater(height);
        System.out.println(result);
    }
}
