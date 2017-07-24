class A{

   public static void display(int a){
    System.out.println("class method");
  }
  public  void display(){
    System.out.println("object method");
  }
}











public class StaticTest 
{
   
   public static void main(String[] args) 
   { 
 
    A.display(1);
        
   } 
} 