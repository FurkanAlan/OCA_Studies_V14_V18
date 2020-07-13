package OCA_Hepsi.V18.OCA223_Q204_223.Q215;

class LogFileException extends Exception {
}

class AccessViolationException extends RuntimeException {
}

public class App {
    public static void main(String[] args) throws LogFileException {
        App obj = new App();
        try {
            obj.open();
            obj.process();
            //insert code here
        }
//        catch (RuntimeException re){
//            System.out.println("runtime");
//        }
        catch (Exception e) { // eger 30. satirdaki, throw new AccessViolationException(); silersem bana catch
            // dekini de yaziracak
            System.out.println("completed.");
        }
    }

    public void process() throws LogFileException { //Exception ciktigi yerde giderilmeli yani metodda da throw
        // yapilmali yada try-catch diger turlu Unhandled exception: OCA_Hepsi.V18.OCA223_Q204_223.Q215
        // .LogFileException hatasi veriyor Complie hatasi ,add exception method signature yapilmasi geriyor
        System.out.println("Processed");
        throw new LogFileException();
    }

    public void open() { //ancak Runtime daha farkli ,add exception method signature yapilmasi gerekmiyor (emin degilim)
        System.out.println("Opened.");
        throw new AccessViolationException(); //yukarida try catch oldugu icin Runtime bu sekilde giderilebiliyor
    }
}
//    Which action fixes the compiler error?
//        A. At line 17, add throws AccessViolationException
//        B. At line 13, add throws LogFileException
//        C. At line 2, replace throws LogFileException with throws AccessViolationException
//        D. At line 7, insert throw new LogFileException ();
//Answer: B
