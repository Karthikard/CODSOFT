/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random_number;

/**
 *
 * @author karthika.R D
 */
import java.util.*;
public class Random_number {

    public static void main(String[] args) {
        check1();
    }
    public static void check1() {
        Scanner sc = new Scanner(System.in);
        int c = 1, score = 100;
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        System.out.println("Enter number between 1 to 100\n Your 1 attempt :");
        int n = sc.nextInt();

        while (c < 10) {
            if (n == rand_int) {
                System.out.println("Congratulations !! you found the number in " + c + " attempt with " + score + " points");
                break;
            } else if (n > rand_int) {
                System.out.println("Opps !! your value is greater than my value");
                c++;
                score = score - 5;
            } else {
                System.out.println("Opps !! your value is lesser than my value");
                c++;
                score = score - 5;
            }
            System.out.println("Your " + c + " attempt : ");
            n = sc.nextInt();
        }
        if(c==10){
        System.out.println("Sorry you lost the game\n\n");
        }
        System.out.println("Enter 1 to Restart your game or Enter 0 to exit");
        int p=sc.nextInt();
        if(p==1)
        {
            check1();
        }
        else
        {
            System.out.println("!!!ThankYou!!!");
        }
    }

}


