/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_square_roots;

/**
 * To print out the first N polynomials corresponding to the Nth degree nested nested square root of 2.
 * 
 * p(0)  =  1
 * p(1)  =  x    ^2 - 2
 * p(n+1)= (p(n))^2 - 2
 * @author hp
 */
public class Nested_Square_Roots {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        N = 10;
        Polynomial[] p = new Polynomial[Math.max(2, N)];
        p[0] = new Polynomial(1,0);
        p[1] = new Polynomial(1,2).minus(new Polynomial (2,0));
        
        for (int n = 2; n < 10; n++){
            p[n] = ((p[n-1]).times(p[n-1])).minus(new Polynomial (2,0));
        }
        for (int n = 0; n < 10; n++)
            StdOut.println(p[n]);
        // TODO code application logic here
    }
    
}
