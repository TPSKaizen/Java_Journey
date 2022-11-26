package OOPS.SessionOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] studentArray = new Student[5];

        Student student1;

        student1 = new Student(); // new keyword dynamically allocates memory



        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        student1.changeName("Piper");

        System.out.println(student1.name);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    //calling a constructor from another constructor
    Student(){
        this(13, "Default  name", 5.5f);
    }

   /* Student(){
        this.rno = 5;
        this.name = "Student";
        this.marks = 5.5f;
    }*/

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }
}