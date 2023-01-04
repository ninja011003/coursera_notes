
public class DS_Testing {
    public static void main(String[] args)  {

        
        
        GenericQueue<String> q = new GenericQueue<String>();
        q.enqueue("21");
        q.enqueue("march");
        q.enqueue("2004");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.PrintAllNodes(); 
        
        /* 
        GenericQueue<Integer> q = new GenericQueue<Integer>();
        q.enqueue(21);
        q.enqueue(03);
        q.enqueue(2004);
        System.out.println(q.dequeue());
        q.PrintAllNodes();
        */
        /* 
        GenericLinkedList<Integer> ll = new GenericLinkedList<Integer>();
        ll.insert(23);
        ll.insert(365);
        ll.insert(143);
        ll.PrintAllNodes();
        */
        /* 
        Linked_List llist = new Linked_List();
        llist.insert(07);
        llist.PrintAllNodes();
        llist.delete_head();
        llist.PrintAllNodes();
        llist.delete_tail();
        llist.PrintAllNodes();
        */
        /* 
        Stack stack= new Stack();
        stack.push(2021);
        stack.push(8);
        stack.push(7);
        stack.PrintAllNodes();
        */
        /* 
        ArrayStack Stack = new ArrayStack(3);
        Stack.push(07);
        Stack.push(04);
        Stack.push(2020);
        Stack.push('-');
        Stack.push(2099);
        Stack.push(07);
        Stack.push(04);
        Stack.push(2020);
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.popall();
        */
    }
}
