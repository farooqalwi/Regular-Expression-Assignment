/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular.expression.assignment;

/**
 *
 * @author ALWI
 */
public class RegularExpressionAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input = "2342342344";
        String regex = "[0-9]+";
        
        boolean isValid = input.matches(regex);
        
        System.out.println(isValid);
    }
    
}
