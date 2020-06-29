package LambdaStreamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyUniqu {
    public static void main(String[] args) {
        Map<String, String>adiSoyadi = new HashMap<>();
        adiSoyadi.put("Mevlut","Bilim");
        adiSoyadi.put("Cihan","Kaya");
        System.out.println(adiSoyadi);

        Map<String, Integer>adiNumara = new HashMap<>();
        adiNumara.put("Mevlut",11111222);
        adiNumara.put("Cihan",1245553);
        System.out.println(adiNumara);





        String str = "AAaaaaabbbbcccddefg";
//        System.out.println(removeDup(str));
//        System.out.println(filtrelmeProg(str));

//        System.out.println(uniQator(str));

        System.out.println(frequencyCounterMetodu(str));

    }




    public static String removeDup(String string){
        return Arrays.stream(string.split(""))
                .distinct()  //distinct sql de var tek olanlari aliyor, burada  => .filter(x->x.equals("A"))
                // kullanilabilirdi, bu ifadeyi dedigimde
                // sadece A olanlari bana bulacak, yada => .equalsIgnoreCase("a") yapilabilir
                .reduce("",
                        (String x, String y) ->x+y); //lamda interface uzerinde calsiyor
        //bol parcala tek olanlari topla bana ver
    }



    //stream Array yada Listede kullaniliyor ve mapde dahil
    public static String filtrelmeProg(String string){


        String [] strArr = string.split(""); // string parcalama islemi, array,  string arrayi ne donusturuldu
        //bir stringi parcalayip string arrayine
        // donusturmus olduk
        System.out.println(strArr);


        List<String> list = new ArrayList<>(Arrays.asList(strArr));  //sonra da bir string listesine donusturmus olduk
        System.out.println(list);

        //stream parcalara ayrilmis bir stringi burada lamda kullanilmasini sagliyor
        return Arrays.stream(string.split(""))
                .filter((String x) -> !x.equalsIgnoreCase("a")) // a disinda olanlari bana getir, eger
                .reduce("",                                         // ! isaritini kaldirisak bana sadece a lari
                        (String x, String y) ->x+y);                        // getirir
    }




    //unique olanlari bulacagimiz icin maplari kullnaiyoruz
    public static String uniQator(String string){
        //mesela verilen string ifadesinde A ve a beraber bulunabilir bunlar farkli karakterlerdir ondan dolayi ikisi
        // beraber cikti da olabilir bunu istemiyorsak su yapilabilir
//         String [] strArr = string.toLowerCase().split("");
//         String [] strArr = string.toUpperCase().split("");
        String [] strArr = string.split("");

        //bu bize harf ve sayisi seklinde cikti verecek
        //yani burada key olanlar String oluyor
        //Value olanlar da Integer yani toplam kactene oldugu
        Map<String, Integer> mapping = new HashMap<>();
        //burada ilk basta map in icerisi bos oldugundan dolayi bize {} sonucu veriyor
        //burada for dongusuyle strArr dizisini tarayarak map in icerisine yerlestiriyor
        System.out.println(mapping);

        //simdi ben bunlari parlacalagim stringi
        //map in icerisinde iterate edecegim
        //buradaki for dongusu diyor ki,
        //map in icerisne bak, icerinde varmi yokmu
        //eger yoksa map in icerine koy anlaminda
        for (String str : strArr){
            if (!mapping.containsKey(str)){

                //buraya koydugumuz str ve yoktu bu zaten onun icin bunu da 1 yap
                mapping.put(str,1);
            }

            // eger varsa
            else {

                //onu yaz diyorum
                //ve str nin eski degeri ne ise onu bir arttir
                mapping.put(str,mapping.get(str)+1);
            }
        }

        System.out.println(mapping);

        //burada mapp a iterate ettikten sonra
        //bu return ifadesi bana String dondurecek

        //en son islemde map entryset ve streamledik sonra da filtrele dedik, peki neye gore filtreliyecek
        //dedim ki ben ona x dedim, map in icerisinde Value degeri 1 olanlari getir diyroum daha sonra onlari map le
        // diyorum, peki neyi map le diyorum, Value su 1 olanlarin Key ini al diyorum   ve bunlari adresliyor
        //sonra bu bulduklarini bana bagla diyorum yani algetir => joining
        return mapping.entrySet().stream()
                .filter(x->x.getValue()==1)  //filtrele ve degeri bir olanlari topla
                .map(x->x.getKey())
                .collect(Collectors.joining());
    }

    public static String frequencyCounterMetodu(String string){
        String [] strArr = string.split("");
        Map<String, Integer> mapping = new HashMap<>();
        System.out.println(mapping);
        for (String str : strArr){
            if (!mapping.containsKey(str)){
                mapping.put(str,1);
            }
            else {
                mapping.put(str,mapping.get(str)+1);
            }
        }
        System.out.println(mapping);

        return mapping.entrySet().stream()
                .map(x->x.getKey() + x.getValue())
                .collect(Collectors.joining());
    }

}
