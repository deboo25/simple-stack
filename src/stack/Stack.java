
package stack;


public class Stack {

   
    public static void main(String[] args) {
       imp i=new imp(10);
     System.out.println(i.isEmpty());
     i.push(0);
      i.push(1);
       i.push(2);
        i.push(3);
         i.push(4);
          i.push(5);
           i.push(6);
            i.push(7);
             i.push(8);
              i.push(9);
                System.out.println(i.isEmpty());
                 System.out.println(i.isFull());
                 i.pop();
                 i.pop();
                 i.pop();
                 System.out.println(i.peek());
                 while(!i.isEmpty()){
                 System.out.print(i.pop());
                 System.out.print(" ");}
                 
                 
              
    }
    
}
