package main;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.inputStudent();
        student.getStudent();
        student.classification();
    }
}
