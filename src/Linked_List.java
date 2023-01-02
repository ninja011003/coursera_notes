package coursera_notes;

public class Linked_List {
    private class Node{
        int item;
        Node next;
        Node(int n){
            item= n;
        }
    }
    Node head;
    protected void insert(int n){
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
    protected int delete_head(){
        int item=-1;
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
    protected int delete_tail(){
        int item=-1;
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
