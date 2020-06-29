package OCA_Hepsi.V18.OCA223_Q120_180.q162;

public class Q162Student {
    String name;
    int age;


    static class Test {
        public static void main(String[] args) {
            Q162Student s1 = new Q162Student();
            Q162Student s2 = new Q162Student();
            Q162Student s3 = new Q162Student();
            s3 = s3;
            s3 = s2;
            s2 = null;


        }

    }
}
