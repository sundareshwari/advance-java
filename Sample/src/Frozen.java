
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
public class Frozen {
    public static void main(String[] args) {
        //classname object=new classname();
        Scanner dino=new Scanner(System.in);
        System.out.println("breed type name");
        String name=dino.next();
        System.out.println("breed orgin");
        String orgin=dino.next();
        System.out.println("breed taste");
        double taste=dino.nextDouble();
        System.out.println("Details list");
        System.out.println("Name "+name);
        System.out.println("origin "+orgin);
        System.out.println("taste "+taste);
    }
    
}
