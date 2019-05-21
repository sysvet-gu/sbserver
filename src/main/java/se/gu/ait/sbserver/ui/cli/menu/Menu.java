package se.gu.ait.sbserver.ui.cli.menu;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu{

  private List<MenuItem> items;
  private String title;

  public Menu(String title){
    items = new ArrayList<>();
    this.title = title;
  }

  public void addMenuItem(String prompt, MenuAction action){
    items.add(new MenuItem(prompt, action));
  }

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
  public void start(){
    while(true){
      System.out.println("\n===="+title+"====\n");
      try{
        int index=0;
        int reply=0;


        for(MenuItem m : items){
          System.out.println(index++ + " " + m.prompt);
        }

        System.out.println(index + " quit");

        reply = Integer.parseInt(askFor("Please enter a number from the menu"));

        if (reply==index) {
          System.out.println("\nBye!\n");

          return;
        }

        System.out.println("\nYou selected "+items.get(reply).prompt+"\n");
        items.get(reply).action.onItemSelected();


      }catch(NumberFormatException | IndexOutOfBoundsException e){
        System.out.println("\n\n\n>>>Invalid choice, please try again.<<<");
        System.out.println(">>>Your selection must be a number from the menu.<<<");
      }
    }
  }

  private class MenuItem{
    private String prompt;
    private MenuAction action;
    public MenuItem(String prompt, MenuAction action){
      this.prompt = prompt;
      this.action = action;
    }
  }
}
