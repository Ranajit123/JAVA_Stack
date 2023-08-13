import java.util.*;
public class leetCode496_NextGreaterElement_I{
  public static void nextGreter(int nums1[], int nums2[]){
    Stack<Integer> s = new Stack<>();
      int ans[] = new int[nums1.length];
      for(int i =0; i<nums1.length; i++){
        for(int j=nums2.length-1; j>=0; j--){
          if(nums1[i] == nums2[j]){
            while(!s.isEmpty() && nums2[j]>=nums2[s.peek()]){
              s.pop();
            }
            if(s.isEmpty()){
              ans[i]=-1;
            }else{
              ans[i]=nums2[s.peek()];
            }
          }
          s.push(j);    
        }
        while(!s.isEmpty()){
          s.pop();
        } 
      }
      for(int i=0; i<ans.length; i++){
        System.out.print(ans[i]+" ");
      }
  }
  public static void main(String[] args) {
    int nums1[] = {4, 1, 2};
    int nums2[] = {1, 3, 4, 2};
    nextGreter(nums1, nums2);
  }
}