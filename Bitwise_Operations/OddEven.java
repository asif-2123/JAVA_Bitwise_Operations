import java.util.* ;

public class OddEven {

    public static void isOddEven ( int n) {

        int bitMask = 1 ;                                   //initialising with which we will check

        if ( ( n & bitMask) == 0) {                        // check if the least significant bit is 0
            System.out.println("Even");                    // LSB = 0 ----> even
        }
        else {
            System.out.println("Odd");                     // LSB = 1 ----> odd
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        isOddEven ( n ) ;
    } 
}
