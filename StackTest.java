// Fig. 16.14: StackTest.java
// Stack class of package java.util.
import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest 
{
   public static void main(String[] args)
   {
      Stack<Number> stack = new Stack<>(); // create a Stack

      // use push method
      stack.push(15); // 
      printStack(stack);
      stack.push(25); //
      printStack(stack);
      stack.push(35.5); 
      printStack(stack);
      stack.push(45); 
      printStack(stack);

      stack.pop();
      printStack(stack);
   
      for (int i = 0; i < stack.size(); i++) {
          System.out.print(stack.get(i)+"  ");
      }



   } 

   // display Stack contents
   private static void printStack(Stack<Number> stack)
   {
      if (stack.isEmpty())
         System.out.printf("stack is empty%n%n"); // the stack is empty
      else // stack is not empty
         System.out.printf("stack contains: %s (top)%n", stack);      
   } 
} // end class StackTest


