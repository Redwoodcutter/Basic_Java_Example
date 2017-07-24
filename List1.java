// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;


public class List1{
   public static void main(String[] args){
   
      List<String> li1 = new ArrayList<String>();
      List<String> li2 = new ArrayList<String>();
      
      li1.add("ahmet"); //0   1
      li1.add("mehmet"); //1  2
      li1.add("ali");    //2  3
      li1.add(0,"veli"); //   0






      System.out.println("List 1 :" +li1);
      System.out.println("List 2 :" +li2);
      li2.addAll(li1);
      System.out.println("List 2 :" +li2);  
      li1.remove("ali");
      System.out.println("List 1 :" + li1);
      li1.remove(0);
      System.out.println("List 1 :" + li1);
      li2.remove(0);
      System.out.println("List 2 :" + li2);
      li2.removeAll(li1);  
      System.out.println("List 1 :" + li1);
      System.out.println("List 2 :" + li2);
      
   }
}
