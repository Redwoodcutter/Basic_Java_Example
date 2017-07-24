// super keyword  example
//Superclass A
class A {
  int i,j;
  public void print(){ System.out.println(i); }
  public void print(int i){ System.out.println(++i); }
}
//Subclass B
class B extends A {
  int i;       
                             
  B(int a, int b) {
    super.i = a;     
    i = b;
    j=super.i;            
  }
  public void print() {
    System.out.println(super.i);
    super.print(j);
    System.out.println(i);  
    System.out.println(super.j);
    super.print();
    System.out.println(i);
  }
}
 
class SuperTest2 {
    public static void main(String args[]) {
    B b = new B(5, 25);
    b.print();
  }
}