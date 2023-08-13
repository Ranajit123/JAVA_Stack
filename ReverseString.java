import java.util.*;
public class ReverseString {
  // Approch ->2
  public static String reString(String str){
    Stack<Character> s = new Stack<>();
    for(int i = 0; i<str.length(); i++){
      s.push(str.charAt(i));
    }
    StringBuilder resultString = new StringBuilder();
    while(!s.isEmpty()){
      resultString.append(s.pop());
    }
    
    return resultString.toString();
  }
  public static void main(String[] args) {
    // Stack<Character> s = new Stack<>();
    String str = "abc";
    // for(int i=0; i<str.length();i++){
    //   s.push(str.charAt(i));
    // }
    // while(!s.isEmpty()){
    //   System.out.print(s.pop()+" ");
    // }

    // Approch ->2
    System.out.print(reString(str)+" ");
  }
}
