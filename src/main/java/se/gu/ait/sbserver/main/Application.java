package se.gu.ait.sbserver.main;


import java.util.Iterator;
import java.util.Scanner;
import java.io.Console;

import se.gu.ait.sbserver.ui.cli.menu.Menu;
import se.gu.ait.sbserver.ui.cli.menu.MenuAction;
import se.gu.ait.sbserver.storage.ExList;
import static se.gu.ait.sbserver.textutils.TextUtils.askFor;
//import static se.gu.ait.sbserver.textutils.TextUtils.store;

public class Application{
  private Menu menu = new Menu("Systembolaget");

  ExList l = new ExList();

  public static Scanner in = new Scanner(System.in);

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

  private void createMenu(){

  /*  menu.addMenuItem("Artiklar", new MenuAction(){
      public void onItemSelected(){
        MENUOPTION -
      }
    });*/
    menu.addMenuItem("Search for a product ", new MenuAction(){
      public void onItemSelected(){
        String name = askFor("Artikelnamn");
      //  System.out.println(result.store());
        System.out.println(l.testStrings());
      }
    });

    menu.addMenuItem("Search for new products ", new MenuAction(){
      public void onItemSelected(){
        String name = askFor("Date, yyyymmdd ");
      }
    });
  }
  public void start(){
    createMenu();
    menu.start();
  }
}
