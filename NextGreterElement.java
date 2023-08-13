 import java.util.*;
public class NextGreterElement {
  public static void main(String[] args) {
    int arr[] = {6,8,0,1,3};
    int nextGreter[] = new int[arr.length];
    Stack<Integer> s = new Stack<>();
    
    for(int i = arr.length-1; i>=0;i--){
      // Step 1-> using while loop pop out the smaller element
      while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        s.pop();
      }
      // Step 2-> check the stack is empty or not if empty then add -1, not then add idx value
      if(s.isEmpty()){
        nextGreter[i] = -1;
      }else{
        nextGreter[i] = arr[s.peek()]; 
      }

      // Step 3 -> push the idx in stack
      s.push(i);
    }

    for(int i=0; i<nextGreter.length; i++){
      System.out.print(nextGreter[i]+" ");
    }
  }
}
