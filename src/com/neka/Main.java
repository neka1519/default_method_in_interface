package com.neka;

//In abstarct method we can define and declare methods
//In interface you can't define only declare
//In java 1.8 we can define methods in interface

interface Demo{
    void abc();
    //public void show(){ //throws error  -->use "default"

      public default void show(){
        System.out.println("Dude, how you doing ?");
    }
}

class demoImp implements Demo{

    public void abc() {
        System.out.println("Hello");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

        Demo obj = new demoImp();
        //refernce = new className
        obj.show();
        obj.abc();

        //Dude, how you doing ?
        //Hello
    }
}
/*
Note : therefore you can define method in interface using default.
now, you dont call a function within decalrin gthe fun.
ll ly, here we have called abc in interface and that is defined using a seprate class

you can over-ride default method
 */

/*
In functional interface you can have any default method but only one abstract method.
 */