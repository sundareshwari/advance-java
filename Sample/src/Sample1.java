
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR1
 */
public class Sample1 {

    public static void main(String[] args) {
     //classname object=new classname();
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.next();
        System.out.println("Enter your age ");
        int age=sc.nextInt();
        System.out.println("Enter your cgpa ");
        double cgpa=sc.nextDouble();
        System.out.println("Details List");
        System.out.println("Name "+name);
        System.out.println("Age  "+age);
        System.out.println("CGPA  "+cgpa);
    }
}
