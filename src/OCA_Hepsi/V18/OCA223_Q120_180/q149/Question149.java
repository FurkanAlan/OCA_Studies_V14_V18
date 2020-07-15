package OCA_Hepsi.V18.OCA223_Q120_180.q149;

public class Question149 {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];
        bool[0] = Boolean.parseBoolean("true"); //.parseBoolean ozelligi eger buraya TRUE yazilsada ayni sonucu
        // vereckti cunku metodunda .equalsIgnoreCase() var, lakin string olmak kaydiyla sadece string kabul ediyor
        // public static boolean parseBoolean(String s) {
        //        return ((s != null) && s.equalsIgnoreCase("true"));
        //    }
        bool[1] = new Boolean(null);

        System.out.println(bool[0]+ "  " + bool[1]);
    }

}
