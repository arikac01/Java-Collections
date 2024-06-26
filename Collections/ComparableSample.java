package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    @Override
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
public class ComparableSample {
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}

/*
->Comparator and comparable differences. -program

1)
--> Comparable provides a single sorting sequence.
In other words, we can sort the collection on the basis of a single element
such as id, name, and price.
--> The Comparator provides multiple sorting sequences.
In other words, we can sort the collection on the basis of multiple elements
such as id, name, and price etc.

2)
--> Comparable affects the original class, i.e., the actual class is modified.
--> Comparator doesn't affect the original class, i.e., the actual class is not modified.

3)
--> Comparable provides compareTo() method to sort elements.
--> Comparator provides compare() method to sort elements.

4)
--> Comparable is present in java.lang package.
--> A Comparator is present in the java.util package.

5)
--> We can sort the list elements of Comparable type by Collections.sort(List) method.
--> We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.

 */
