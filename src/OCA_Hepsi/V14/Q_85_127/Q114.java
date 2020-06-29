package OCA_Hepsi.V14.Q_85_127;

import java.util.Arrays;

public class Q114 {
}
class Test4 {

    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers [0]=10;
        numbers [1]=20;
        System.out.println(numbers); // bunun verdigi deger I@61bbe9ba

        numbers=new int[4];
        numbers [2]=30;
        numbers [3]=40;
        System.out.println(numbers); //I@610455d6, yukaridakinden farkli
        for (int x:numbers){
            System.out.print(" "+x);
        }


        String[] string = new String[4]; // eger biz bunu kullanirsak sonuc olarak  null Veli Hakan null yazdirir
//        String[] string = new String[2]; // lakin bunu kullanirsak ArrayIndexOutOfBoundsException sonucu verir
        string[1] = "Ali";
        string[1] = "Veli";
        string[2] = "Hakan";
        System.out.println(string);  //[Ljava.lang.String;@61bbe9ba

        System.out.println(Arrays.toString(string));  // [null, Veli, Hakan, null]

        // null Veli Hakan null
        for (String y:string){
            System.out.print(" "+y);
        }

    }
}
/*
* What is the result?
A. 10 20 30 40
B. 0 0 30 40
C. Compilation fails.
D. An exception is thrown at runtime.
Answer: B
* *Aynisi cikmis sinavda
* */