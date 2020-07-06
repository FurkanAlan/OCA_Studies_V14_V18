package OCA_Hepsi.V18.OCA223_Q181_203.Q181;

import java.util.ArrayList;
import java.util.List;

public class BB {
    List list = new ArrayList<>();

    private int doStuff() {
        int x = 100; //(basinda private olmaz)//local variable da access modfier kullanamayiz
        return x++;
    }
}
//
