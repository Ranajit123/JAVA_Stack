import java.util.ArrayList;
public class ImplementationUsingArrayList {
  public static class Stack{
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isempty(){
      return list.size()==0;
    }

    // push function
    public static void push(int data){
      list.add(data);
    }

    // pop funtion
    public static int pop(){
      if(isempty()){
        return -1;
      }
      int top = list.get(list.size()-1);
      list.remove(list.size()-1);
      return top;
    }

    // peek funtion
    public static int peek(){
      if(isempty()){
        return -1;
      }
      return list.get(list.size()-1);
    }
  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isempty()){
      System.out.print(s.peek()+" ");
      s.pop();
    }
  }
}
