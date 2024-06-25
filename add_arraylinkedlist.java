/*
 Question:
 Program to add the Array and Linked list. 
 */

import java.util.*;
public class add_arraylinkedlist {
    public static void main(String[] args) {
        LinkedList<String> subject = new LinkedList<>();
        subject.add("English");
        subject.add("Tamil");
        subject.add("Maths");
        System.out.println("Subject list: " + subject);

        ArrayList<String> courses = new ArrayList<>();
        courses.add("ECE");
        courses.add("CSE");
        System.out.println("Courses list: " + courses);

        subject.addAll(courses);
        System.out.println("Combined list: " + subject);
    }
}

/*
Output:
Subject list: [English, Tamil, Maths]
Courses list: [ECE, CSE]
Combined list: [English, Tamil, Maths, ECE, CSE]
 */