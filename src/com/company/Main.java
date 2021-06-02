package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	int[]  myNums = {4, 3, 5, 6};
        for (int n: myNums) {
            System.out.println(n);
        }



        myNums = Arrays.copyOf(myNums, 10);

        System.out.println("New Array");
        for (int n: myNums) {
            System.out.println(n);
        }

        List studentList = new ArrayList();
        studentList.add(new Student("John"));
        studentList.add(new Student("Jane"));
        studentList.add(new Student("Paul"));
        studentList.add(new Student("Sam"));

        for (Object o: studentList) {
            System.out.println(((Student)o).getName()); // Unboxing
        }

        System.out.println("Generic List");
        List<Student> genericStudentList = new ArrayList<Student>(studentList);
        genericStudentList.add(new Student("John"));
        genericStudentList.add(new Student("Jane"));
        genericStudentList.add(new Student("Paul"));
        genericStudentList.add(new Student("Sam"));

        for (Student s: genericStudentList) {
            System.out.println(s.getName());
        }

        System.out.println(genericStudentList);

    }
}
