package com.driver;

public class Main {
  public static void main(String [] args){
      B b=new B();
      b.meth();
  }
}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{

}