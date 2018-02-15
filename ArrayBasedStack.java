import java.util.Arrays;

public class ArrayBasedStack <T> implements StackInterface <T>{
   int length;
   private T[] data = (T[]) new Object[length];
   private int topOfStack; 
   final int INITIAL_CAPACITY = 5;
   boolean initialized = false;
   
   
   public ArrayBasedStack(int length) {
      topOfStack = -1; 
      if (length < 0) {
         throw new IllegalArgumentException ("Too small");
      }
      
   }
   
   public ArrayBasedStack() {
      length = INITIAL_CAPACITY;
   } 
   
   @SuppressWarnings("unchecked")
   private T[] expandArray() {
      length = length * 2;
      T[] temp = Arrays.copyOf(data, length);
      return temp;
   }
   
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry){
      topOfStack++; 
      if (topOfStack > length) {
         //Arrays.expandArray();
      }   
   
   }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop() {
      return null;
   }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek(){
      return null;
   }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty() {
      return false;
   }
  
   /** Removes all entries from this stack. */
   public void clear() {
   
   }


}