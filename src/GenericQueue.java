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
        rear.next=NewNode;
        rear=NewNode;
        if(front==null)
            front=rear;
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
