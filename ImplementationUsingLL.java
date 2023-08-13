public class ImplementationUsingLL {
  
  static class Node{
      int data;
      Node next;
      Node(int data){
        this.data = data;
        this.next = null;
      }
  }

  public static class Stack{
    static Node head = null;

    public static boolean isempty(){
      return head == null;
    }

    // push function
    public static void push(int data){
      Node newNode = new Node(data);
      if(isempty()){
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    // pop function
    public static int pop(){
      if(isempty()){
        return -1;
      }
      int val = head.data;
      head = head.next;
      return val;
    }

    // peek function
    public static int peek(){
      if(isempty()){
        return-1;
      }
      return head.data;
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
