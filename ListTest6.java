// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;


public class ListTest6{
   public static void main(String[] args){
   
         List<String> list = new ArrayList<String>();
        
     
         for(int i = 0; i <=9; i++)
          {
            list.add(String.valueOf(i));
          }

        
           for (String string : list) {
              System.out.print(string+" ");
           }
           System.out.println();



           ListIterator it = list.listIterator();
             it.next();    
             it.next();
             it.previous();


           while (it.hasNext()) 
           {
           System.out.print(it.next()+" ");
           } 

   }
}
