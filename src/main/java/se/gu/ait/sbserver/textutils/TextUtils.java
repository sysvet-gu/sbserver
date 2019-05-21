package se.gu.ait.sbserver.textutils;

import java.util.Scanner;

public class TextUtils{

    private static Scanner in = new Scanner(System.in);
    public Scanner rec = new Scanner(System.in);

    //  private TextUtils(){}

        public static String askFor(String prompt){
  String result=null;
  System.out.print(prompt + ": ");
  if(System.console() == null){
    result = in.nextLine();
  }else{
    result = System.console().readLine();
  }
  return result;
}

      public static String store(String prompt){
        String result=null;
        result = System.console().readLine();
        return result;
      }


}
