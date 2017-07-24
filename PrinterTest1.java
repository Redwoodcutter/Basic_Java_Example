class Printer1 {
    public   int WORD=0;
    public   int PDF=1;
    public   int HTML=2;

    public void print(String path, int type){
        if (type == WORD)
            System.out.println("word document is printing");
         else if (type == PDF)
                System.out.println("pdf document is printing"); 
                    else  System.out.println("html document is printing"); 
        
    }
}



public class PrinterTest1{
  public static void main(String[] args){
    {
     String path= "week7.doc";
     Printer1 p1=new Printer1();
     p1.print(path, p1.WORD);
    }

  }
}