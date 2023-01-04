//package coursera_notes.src;
//stack using linked list
public class Stack {
    protected class Node{
        int item;
        Node next;
        Node(int n){
            item=n;
        }
    }
    private Node top;
    protected void push(int n){
        Node NewNode= new Node(n);
        if(top==null){
            top=NewNode;
        }
        else{
            NewNode.next=top;
            top=NewNode;
        }
    }
    protected int pop(){
        if(top==null){
            System.out.println("stack is empty");
            System.exit(-1);
        }
        else{
            int item=top.item;
            top=top.next;
            return item;
        }
        return 0; 
    }
    protected void PrintAllNodes(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            Node CurrNode=top;
            while(CurrNode.next!=null){
                System.out.print(CurrNode.item+"-");
                CurrNode=CurrNode.next;
            }
            System.out.println(CurrNode.item);
        }
    }
}
