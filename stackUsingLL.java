public class stackUsingLL {
  static class node{
    int data;
    node next;

    node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static class stack{
    static node head = null;

    // isEmpty()
    public static boolean isEmpty(){
      return head == null;
    }

    // push()
    public static void push(int data){
      node newNode = new node(data);
      if(isEmpty()){
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    // pop()
    public static int pop(){
      if(isEmpty()){
        return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    // peek()
    public static int peek(){
      return head.data;
    }
  }
  public static void main(String[] args) {
    stack s = new stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();
    }
  }
}
