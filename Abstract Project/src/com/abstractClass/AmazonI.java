package com.abstractClass;

public interface AmazonI {
String pname = "Amazon Project";

boolean login(String un, String pwd);
boolean logout(String un, String pwd);
int cart(Object obj);
boolean paynow(Object obj, int amt);
}
