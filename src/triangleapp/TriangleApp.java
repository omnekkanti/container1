/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleapp;

/**
 *
 * @author rachana.gurram
 */
public class TriangleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangle x = new Triangle(12, 23, 24);
       String s = x.validateTriangle();
        System.out.println(s);
       
        Triangle y = new Triangle(12, 12, 25);
       String r = y.validateTriangle();
        System.out.println(r);
        
        Triangle z = new Triangle(12, 12, 12);
       String t = z.validateTriangle();
        System.out.println(t);
        
        Triangle p = new Triangle(-1, 4, 5);
       String i = p.validateTriangle();
        System.out.println(i);
        
    }
    
}
