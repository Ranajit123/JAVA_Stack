import java.util.*;
public class MaxAreaInHistroGram {
  public static int maxArea(int height[]){
    int maxArea = 0;
    int nsr[] = new int[height.length];
    int nsl[] = new int[height.length];
    // Next Smaller in left side
    Stack<Integer> s = new Stack<>();
    for(int i =0; i<height.length; i++){
      while(!s.isEmpty() && height[s.peek()] >= height[i]){
        s.pop();
      }
      if(s.isEmpty()){
        nsl[i]=-1;
      }else{
        nsl[i]=s.peek();
      }
      s.push(i);
    }
    // Smaller in right side
    s = new Stack<>();
    for(int i =height.length-1; i>=0; i--){
      while(!s.isEmpty() && height[s.peek()] >= height[i]){
        s.pop();
      }
      if(s.isEmpty()){
        nsr[i]= height.length;
      }else{
        nsr[i]=s.peek();
      }
      s.push(i);
    }
    
    // Calculate Area -> width(w) = nsr[i]-nsl[i]-1 
    for(int i=0; i<height.length; i++){
      int h = height[i];
      int w = nsr[i]-nsl[i]-1;
      int currArea = h*w;
      maxArea = Math.max(maxArea, currArea);
    }
    return maxArea;
  }
  public static void main(String[] args) {
    int height[] = {5, 1, 5, 6, 2, 3};
    System.out.println(maxArea(height));
  }
}
