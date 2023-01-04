
public class GenericQueue<Item> {
    protected class Node{
        Item item;
        Node next;
        Node(Item n){
            item=n;
        }
    }
    private Node front;
    private Node rear;
    public void enqueue(Item n){
        Node NewNode= new Node(n);
        if(front==null){
            rear=NewNode;
            front=rear;
        }
        else{
            rear.next=NewNode;
            rear=NewNode;
        }
            
    }
    public void PrintAllNodes(){
        if(front!=null){
            while(front.next!=null){
                System.out.print(front.item+"-");
                front=front.next;
            }
            System.out.println(front.item);
        }
        else{
            System.out.println("Queue is empty");
        }
    }
    public Item  dequeue(){
        if(rear==null){
            System.out.println("Queue is empty");
            System.exit(-1);
            return null;
        }
        else{
            Item item=front.item;
            front=front.next;
            return item;
        }
            
    }
}
