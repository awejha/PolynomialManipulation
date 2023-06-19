/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_square_roots;

/**
 *
 * @author hp
 */
class Recursion_Example_in_Artin {
    public static void main(String[] args) {
        int N;
        N = 12;
        Polynomial[] A = new Polynomial[Math.max(2, N)];
        A[1] = new Polynomial(1,1);
        A[2] = new Polynomial(1,2).minus(new Polynomial (1,0));
        
        for (int n =3 ; n < 12; n++){
            A[n] = (A[1].times(A[n-1])).minus(A[n-2]);
        }
        for (int n = 2; n < 12; n++)
            StdOut.println(A[n]);
        // TODO code application logic here
    }
}
