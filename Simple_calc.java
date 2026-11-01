/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjava;
import java.util.Scanner;
/**
 *
 * @author eltab
 */
public class Simple_calc {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        float fnum;
        float snum;
        int operation;
        float answer;
        
        
        
        
        System.out.println("Enter the first number");
        fnum = sc.nextFloat();
        System.out.println("Enter the second number");
        snum = sc.nextFloat();
        System.out.println("Enter the operation\n1- (*)\n2- (/)\n3- (-)\n4- (+)");
        operation = sc.nextInt();
        
        
        
        
        switch (operation) {
            case 1:
            answer = fnum * snum;
            System.out.println(fnum + " * " + snum + "= " + answer );
            break;
            case 2:
            answer = fnum / snum;
            System.out.println(fnum + " / " + snum + "= " + answer );
            break;
            case 3:
            answer = fnum - snum;
            System.out.println(fnum + " - " + snum + "= " + answer );
            break;
            case 4:
            answer = fnum + snum;
            System.out.println(fnum + " + " + snum + "= " + answer );
            break;
            
            default:
            System.out.print("choose by the index!!");
            
        }
        
        
    
    }
}
