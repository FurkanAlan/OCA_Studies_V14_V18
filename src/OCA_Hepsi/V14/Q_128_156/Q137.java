public class Q137 {
    /*

    Which three statements are true about exception handling? (Choose three.)


A. Only unchecked exceptions can be rethrown.
B. All subclasses of the RuntimeException class are not recoverable.
C. The parameter in a catch block is of Throwable type.
D. All subclasses of the RuntimeException class must be caught or declared to be thrown.
E. All subclasses of the RuntimeException class are unchecked exceptions.
F. All subclasses of the Error class are not recoverable.


Answer: BCD

Second version

Which three statements are true about exception handling? (Choose three.)


A. Only unchecked exceptions can be rethrown.
B. All subclasses of the RuntimeException class are not recoverable.
C. The parameter in a catch block is of Throwable type.
D. All subclasses of the RuntimeException class must be caught or declared to be thrown.
E. All subclasses of the RuntimeException class are unchecked exceptions.
F.  All subclasses of the Error class are checked exceptions and recoverable.

Answer: BCE

Third version

 Which three statements are true about exception handling? (Choose three.)


A. Only unchecked exceptions can be rethrown.
B. All subclasses of the RuntimeException class are  recoverable.
C. The parameter in a catch block is of Throwable type.
D. All subclasses of the RuntimeException class must be caught or declared to be thrown.
E. All subclasses of the Exception class except the RunTimeException class are checked exceptions.
F. All subclasses of the Error class are  checked exceptions and are recoverable.

Answer?


     */
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
            a = 12;
            c = a / b;

            //eger catch icerisinde icerisinde birdefa daha throw yapilip buna rethrow deniliyorsa o zaman A dogru olur
        } catch (ArithmeticException e) {
            //buradaki ornek rethrown a a ornek olabilir cunku birisi java.lang.ArithmeticException: / by zero
            // istisnasi veriyor
            System.out.println("Log " + e);
            e.printStackTrace();
            //bu ise Exception in thread "main" java.lang.ArithmeticException: / by zero seklinde sonuc veriyor
            throw e;
        }

    }

}
