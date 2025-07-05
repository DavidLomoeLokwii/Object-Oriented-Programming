
package david.greetings;
// when you know exactly how many times you want to loop through a block of code, use for loop instead of while loop.

public class forLoop {
    public static void main(String [] args) {
// for (sta1;is one time, sta2; defines condition of code; sta3;every time executed after code has been executed
         for (int i =0; i < 5; i++) {
             System.out.println(i);
         }
         for (int i =0; i<=10; i=i+2){ // program for even values between 0 and 10
             System.out.println(i);
         }
         int number =2;
         // print multiplication table for the number 2
         for (int i=1; i<=10; i++) {
             System.out.println(number + " x " + i + " = " + (number * i));
         }
    }
    
}
