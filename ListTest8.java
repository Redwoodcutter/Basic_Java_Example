// Fig. 16.3: ListTest.java
// Lists, LinkedLists and ListIterators.
import java.util.List;
import java.util.LinkedList;

public class ListTest8
{
   public static void main(String[] args)
   {
      String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
      List<String> list = new LinkedList<>(); 
      list.clear();     
         
      print(list); // print list1 elements
      for (String color : colors) // color="black yellow green blue violet silver"
         list.add(color);
  
       print(list); // print list1 elements
       list.subList(1,3).clear();




       print(list); // print list1 elements
   }                                     

   private static void print(List<String> list)
   {
        
      for (String color : list)
         System.out.printf("%s ", color);

      System.out.println();
   }

   

} 