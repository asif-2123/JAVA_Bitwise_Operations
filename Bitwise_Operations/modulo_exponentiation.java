import java.util.*;

public class modulo_exponentiation {
    public static int moduloExpo ( int a , int n , int m ) { // a = base ; n = power ; m = modulo
        int ans = 1 ;
        while (n>0) {                      // Loop until the bitwise of n become zero
            if (( n & 1 ) != 0 ) {         // check LSB
                ans = (a * ans) % m ;      // if its setbit then ans is assigned to multiplication of a
            }
            a = a*a ;                      // a is squared
            n = n>>1;                       // left shifting to get LSB so that if its 0 then n ans will be same
        }

        return ans ;
    }
    public static void main(String[] args) {
        System.out.println(moduloExpo( 2 , 5 , 7));
    }
}
