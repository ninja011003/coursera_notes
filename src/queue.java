package coursera_notes.src;

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