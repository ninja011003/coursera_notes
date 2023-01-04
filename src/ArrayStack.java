//package coursera_notes.src;

public class ArrayStack {
    private int top=0;
    private int Stack[];
        ArrayStack(int size){
            Stack= new int[size];
    }
    private void resize(int new_size){
        int NewArray[]=new int[new_size];
        for(int i=0;i<top;i++)
            NewArray[i]=Stack[i];
        Stack=NewArray;
    }
    public void push(int item){
        if(top==Stack.length)
            resize(2*top);
        Stack[top++]=item;
    }
    public int pop(){
        if(top>0){
            int item=Stack[--top];
            if(top==Stack.length/4)
                resize(Stack.length/2);
            return item;
        }
        else{
            System.exit(-1);
            return -1;
        }
    }
    public void popall(){
        int n= top-1;
        while(n>0){
            System.out.print(pop()+"-");
            n--;
        }
        System.out.println(pop());
    }
}
