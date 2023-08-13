import java.util.*;
public class ReverseStack {

  public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }

    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }

  public static void reStack(Stack<Integer> s){
    if(s.isEmpty()){
      return;
    }
    int top = s.pop();
    reStack(s);
    pushAtBottom(s, top);

  }

  public static void printStack(Stack<Integer> s){
    while(!s.isEmpty()){
      System.out.print(s.pop()+" ");
    }
  }
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(3);
    s.push(2);
    s.push(1);

    // printStack(s);
    reStack(s);
    printStack(s);
    
    
  }
}
