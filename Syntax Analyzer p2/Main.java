import java.io.*; 

public class Main {
  public static void main(String args[]) {    
    /* Start the parser */
    try {
        parser parser_obj = new parser( new Yylex(new FileReader(args[0]))); 
        parser_obj.parse();
        
    } catch (Exception e) {
      System.out.print("Error");
      e.printStackTrace();
    }
  }
}