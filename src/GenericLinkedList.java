
public class GenericLinkedList<Item> {
    private class Node{
        Item item;
        Node next;
        Node(Item n){
            item= n;
        }
    }
    Node head;
    protected void insert(Item n){
        Node NewNode = new Node(n);
        if(head==null){
            head=NewNode;
        }
        else{
            Node LastNode=head;
            while(LastNode.next!=null)
                LastNode=LastNode.next;
            LastNode.next=NewNode;
        }
    }
    protected Item delete_head(){
        Item item=null;
        if(head==null){
            System.out.println("Data Structure empty");
            System.exit(-1);
        }
        else{
            item=head.item;
            head=head.next;  
        }
        return item;
    }
    protected Item delete_tail(){
        Item item=null;
        Node CurrNode=head;
        if(CurrNode==null){
            System.out.println("Data Structure empty");
            System.exit(-1);
        }
        else{
            
            while(CurrNode.next.next!=null)
                CurrNode=CurrNode.next;
            item= CurrNode.next.item;
            CurrNode.next=null;
        }
        return item;
    }
    protected void PrintAllNodes(){
        Node CurrNode=head;
        if(CurrNode==null){
            System.out.println("Data Structure empty");
        }
        else{
            while(CurrNode.next!=null){
                System.out.print(CurrNode.item+"-");
                CurrNode=CurrNode.next;
            }
            System.out.println(CurrNode.item);
        }
    }
}
