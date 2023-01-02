public class GenericStack<Item> {
    protected class Node{
        Item item;
        Node next;
        Node(Item n){
            item=n;
        }
    }
    private Node top;
    protected void push(Item n){
        Node NewNode= new Node(n);
        if(top==null){
            top=NewNode;
        }
        else{
            NewNode.next=top;
            top=NewNode;
        }
    }
    protected Item pop(){
        if(top==null){
            System.out.println("stack is empty");
            System.exit(-1);
            return null; 
        }
        else{
            Item item=top.item;
            top=top.next;
            return item;
        }
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
