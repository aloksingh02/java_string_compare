package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Alok";
        String s2 = "Alok";
        String s3 = new String("Alok");
        String s4 = "Ravit";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
	// write your code here
    }
}
