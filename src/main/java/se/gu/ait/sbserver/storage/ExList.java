package se.gu.ait.sbserver.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import se.gu.ait.sbserver.textutils.TextUtils;

public class ExList{

public String a;


public List <String> testStrings() {
  ArrayList<String> list = new ArrayList<String>();


  list.add("one");
  list.add("two");
  list.add("three");

  boolean answer = list.contains(System.in);

  if(answer)

    System.out.println("yey");
  else
    System.out.println("nay");
return (list);
  }
}
