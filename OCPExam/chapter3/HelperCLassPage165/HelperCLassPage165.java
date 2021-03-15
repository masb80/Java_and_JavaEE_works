package OCPExam.chapter3.HelperCLassPage165;

import javax.print.PrintException;

public class HelperCLassPage165 {
    public static <U extends Exception> void PrintException(U u){
        System.out.println(u.getMessage());
    }
    // for no 22
    public static <T> T identity (T t){
        return t;
    }

    public static void main(String[] args){
       // HelperCLassPage165.PrintException(new FileNotFoundException("A"));
      //  HelperCLassPage165.printException(new Exception("B"));
      //  HelperCLassPage165.<Throwable>printException(new Exception("C"));
        HelperCLassPage165.<NullPointerException>PrintException(new NullPointerException("D"));
      //  HelperCLassPage165.printException(new Throwable("E"));

        

    }
    
}
