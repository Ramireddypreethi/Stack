public class Stack
{  private static Object[] stackarray;
   private static int size;
   private static int top;
   public Stack(int size)
   {
         this.size=size;
         this.top=-1;
         stackarray=new Object[size];
         
   }
   public void push(Object value)
   { if(top==size-1)
       {
        System.out.println("stack overflow");
       }
       else
       {
     stackarray[++top]=value;
     
       }

   }
public Object pop()
{
    if(top==-1)
    {
        System.out.println("stack underflow");
        return -1;
    }
    // else{
    //     int oldtop=top; //storing index of top element then moving to next index below it by top--
    //     top--;
    //     stackarray[oldtop]=null; //if we dont make null then we are just moving to below index not removing the topmost element so kept as null
    //     return stackarray[oldtop];
    // }
    else{
        return stackarray[top--];
    }
}
public Object peek()
{
    return stackarray[top];
}
    public static void main(String args[])
    { 
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
       // System.out.println(s.pop());
        System.out.println(s.peek());
         for(int i=0;i<=top;i++)
         {
            System.out.println(stackarray[i]);
         }
         
     

    }
}
