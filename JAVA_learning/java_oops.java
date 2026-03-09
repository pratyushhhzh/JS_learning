// // Introduction
// problem statement - create a data type application
// that stores 5 roll number. also crete a data structures 
// that stores 5 names . Now create some sort of data types
// that stores their data like roll number marks and name 
// --------------------

// int[] roll = new int[5];
//  String[] names = new String[5];
// float[] marks = new float[5];

// --------------------
// dont create separate data structuer but store it all in one !

// Class = class is a named group of proporties and functions
//  combining all the  three above separate data structures 
//  = creating a class. By convention the class name 
//  ususally starts with Capital letter.

// creating a class
/* class Student{
    int[] roll = new int[5];
    String[] names = new String[5];
    float[] marks = new float[5];
    } 
    
    calling a class example: 
    // Student wifeyyy; */

/*In Java:
A class is a blueprint or template.
An object is a runtime instance of that class.
  // More Accurate Definition : 
An object is an instance of a class that contains its own copy of the class’s variables (data) and can access the class’s methods (behavior). */

// class is a logical construct
// object is the physical reality !

import java.util.*;
class Rectangle{
    private double length;
    void setdata(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        System.out.println(this.length);
    }
    
}


public class java_oops{

    // public int name(int i , int j){
    //         return i+j;
    //     }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.setdata();

       
        
    }
}