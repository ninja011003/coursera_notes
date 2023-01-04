//package coursera_notes.src;

public class queue {
    protected class Node{
        int item;
        Node next;
        Node(int n){
            item=n;
        }
    }
    private Node front;
    private Node rear;
    public void enqueue(int n){
        Node NewNode= new Node(n);
        rear.next=NewNode;
        rear=NewNode;
        if(front==null)
            front=rear;
    }
    public void PrintAllNodes(){
        if(front!=null){
            while(front.next!=null){
                System.out.print(front.item+"-");
            }
            System.out.println(front.item);
        }
        else{
            System.out.println("Queue is empty");
        }
    }
    public int  dequeue(){
        if(rear==null){
            System.out.println("Queue is empty");
            System.exit(-1);
            return -1;
        }
        else{
            int item=front.item;
            front=front.next;
            return item;
        }
            
    }
    
}