import java.util.*;
public class DuplicateParenthesesProblem {
  public static boolean duplicateParenthese(String str){
    // Step 1 -> Create Stack
    Stack<Character> s = new Stack<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      // Closing parentheses
      if(ch == ')'){
        int count = 0;
        while(s.peek() != '('){
          s.pop();
          count++;
        }
        if(count<1){
          return true;
        }else{
          s.pop();
        }
      }
      else{ // openning parentheses and other elements
        s.push(ch);
      }
    }
    return false;
  }
  public static void main(String[] args) {
    String str = "((a+b)+(c+d))";
    System.out.println(duplicateParenthese(str));
  }
}
