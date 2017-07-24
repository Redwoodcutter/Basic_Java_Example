class A{
  public static int count;
  public A(){ }
  public  static void print(){
      count++;
      System.out.println(count);
  }
}









public class methodStaticTest 
{
   
   public static void main(String[] args) 
   { 
    A a0=new A();
    a0.print();
    A.count=5;
    a0.print();
    A.print();
   } 
} 