import java.util.*;
public class ValidBrakects {
  public static boolean checkValidBrakets(String str){
    // Step 1 -> Create a Stack
    Stack<Character> s = new Stack<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      // Step 2 -> Push Open braket in Stack
      if(ch == '(' || ch == '{' ||ch == '['){
        s.push(ch);
      }else{
        if(s.isEmpty()){
          return false;
        }
        if(s.peek()=='('&& ch == ')'
            || s.peek()=='{'&& ch == '}'
            || s.peek()=='['&& ch == ']'){
              s.pop();
        }else{
          return false;
        }
      }
    }
    
    return (s.isEmpty());
  }
  public static void main(String[] args) {
    String str = "({[]})";
    System.out.println(checkValidBrakets(str));
  }
}
