/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular.expression.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author ALWI
 */
public class RegularExpressionAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RE_for_integer_constant.integer_RE();
        RE_for_email_validation.email_RE();
        RE_for_url.url_RE();
    }
    
    public static class RE_for_integer_constant {
    static void integer_RE()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter valid integer: ");
        
        String input = sc.nextLine();
        String regex = "^[+-]?[0-9]+$";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        
        if (m.matches())
        {
            System.out.println(input + " is a valid integer.");
        }
        else
        {
            System.out.println(input + " is an invlid integer.");
        }
    }
}
    
    public static class RE_for_email_validation {
    static void email_RE()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter valid email address: ");
        
        String input = sc.nextLine();
        String regex = "^(.+)@(.+)$";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        
        if (m.matches())
        {
            System.out.println(input + " is a valid email address.");
        }
        else
        {
            System.out.println(input + " is an invlid email address.");
        }
    }
}
    
    public static class RE_for_url {
        static void url_RE()
        {
            Scanner sc = new Scanner(System.in); 
        System.out.print("Enter valid url: ");
        
        String input = sc.nextLine();
        String regex = "";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        
        if (m.matches())
        {
            System.out.println(input + " is a valid url.");
        }
        else
        {
            System.out.println(input + " is an invlid url.");
        }
        }
    }
}
