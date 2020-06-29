package OCA_Hepsi.V14.Q_1_60;

public class Q8 {
    public static void main(String[] args) {
        int ii = 0;
        int jj = 7;
        for (ii = 0; ii < jj; ii = ii + 2) {
            System.out.print(ii + " ");
        }
    }
}

// What is the result?
// A. 2 4
// B. 0 2 4 6
// C. 0 2 4
// D. Compilation fails.

// B = 0 2 4 6

//2. versiyon

class testX{
    public static void main(String[] args) {
        int aa = 0;
        int bb = 7;
        for (aa = 0; aa < bb-1; aa = aa + 2) {
            System.out.print(aa + " ");
        }
    }
}

