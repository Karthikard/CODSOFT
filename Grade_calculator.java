/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade_calculator;
import java.util.*;
public class Grade_calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int sub_count=sc.nextInt();
        char grade;
        int mark[]=new int[sub_count];
        int i,total_mark=0,avg_mark=0,s=1;
        for(i=0;i<sub_count;i++)
        {
            System.out.print("Subject "+s+"\n");
            mark[i]=sc.nextInt();
            s++;
                    
        }
        for(i=0;i<sub_count;i++)
        {
            total_mark+=mark[i];
        }
        avg_mark=total_mark/sub_count;
        if(avg_mark>=90)
        {
            grade='A';
        }
        else if(avg_mark<90 && avg_mark>=80)
        {
            grade='B';
        }
        else if(avg_mark<80 && avg_mark>=70)
        {
            grade='C';
        }
        else if(avg_mark<70 && avg_mark>=60)
        {
            grade='D';
        }
        else if(avg_mark<60 && avg_mark>=50)
        {
            grade='E';
        }
        else 
        {
            grade='\0';
        }
        System.out.println("\n\nRESULT\nYour Total mark = "+total_mark+"\nYour Average mark = "+avg_mark);
        if(grade=='\0')
        {
            System.out.println("Fail(Grade not available)");
        }
        else
        {
            System.out.println("Grade = "+grade);
        }
    }
    
}
