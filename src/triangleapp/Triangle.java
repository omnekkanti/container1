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
public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int s1, int s2, int s3) {
        setA(s1);
        setB(s2);
        setC(s3);
    }

    public void setA(int s1) {
        if ((s1 >= 1) && (s1 <= 200)) {
            a = s1;
        } else {
            a = 0;
            System.err.println("invalid A");
        }
    }

    public void setB(int s2) {
        if ((s2 >= 1) && (s2 <= 200)) {
            b = s2;
        } else {
            b = 0;
            System.err.println("invalid B");
        }
    }

    public void setC(int s3) {
        if ((s3 >= 1) && (s3 <= 200)) {
            c = s3;
        } else {
            c = 0;
            System.err.println("invalid C");
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    //validation
    public String validateTriangle() {
        boolean flagc4 = false;
        boolean flagc5 = false;
        boolean flagc6 = false;

        if (a > 0 && b > 0 && c > 0 && a < 201 && b < 201 && c < 201) {
            if (a < (b + c)) {
                flagc4 = true;
            }
            if (b < (a + c)) {
                flagc5 = true;
            }
            if (c < (a + b)) {
                flagc6 = true;
            }
        } else {
            if (a < 0 && a > 200) {
                System.out.println(a + " is not in range");
            }

            if (b < 0 && b > 200) {
                System.out.println(b + " is not in range");
            }

            if (c < 0 && c > 200) {
                System.out.println(c + " is not in range");
            }

        }
        //validate type

        String result = "";

        if (flagc4 == true && flagc5 == true && flagc6 == true) {
            if (a == b && b == c) {
                result = "Equilateral";
            } else if (a == b || a == c || b == c) {
                result = "iscoceles";
            } else if ((a*a == b*b + c*c)||(b*b == a*a + c*c)||(c*c == b*b + a*a)) {
                result = "rightangled";
            } else if (a != b && b != c && c != a) {
                result = "scalene";
            }

        } else {
            result = "NotATriangle";
        }

        return result;
    }
    
    private void thisIsCool(){
      System.out.println("Wow!");
    }
}
