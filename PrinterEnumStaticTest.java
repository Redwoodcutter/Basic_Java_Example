enum Type{
 WORD,
 PDF,
 HTML

}


public class PrinterEnumStaticTest{
  public static void main(String[] args)
    {
     String path= "week7.doc";

      void print(String path, Type type){
        if (type == Type.WORD)
            System.out.println("word document is printing");
         else if (type == Type.PDF)
                System.out.println("pdf document is printing"); 
                    else  System.out.println("html document is printing"); 
        
    }
     
     print(path, Type.WORD);
    }

  
}