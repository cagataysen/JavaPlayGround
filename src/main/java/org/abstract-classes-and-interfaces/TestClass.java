public class TestClass {

    public static void main(String args[]){
        //Insan obje= new Insan(182,95);
        Bina obje = new Bina();
        System.out.println(obje.boyMetre());
        System.out.println(obje.boySantimetre());
        System.out.println(obje.boyKilometre());
    }
}

//java8 ile birlikte static ve default interfacelerde kullanilmaya baslandi ve interfacelerin govdeleri kodlanabiliyor. (interfacelerin esnekligi artti)
//interface deki methodlar publictir yazmaya gerek yoktur.
//interfacelerde verilen variableların degeri final value dur degistirilemez. mesela degisken = 0; bu degisken; yaparsan olmaz bir seye atamalisin.

interface Boy{
    int degisken = 0;
    static String tanim() {
        return "Bu interface implement eden class icin "
                + "boy bilgileri donulmesini garanti eder.";
    }
    int boySantimetre();
    double boyMetre();


    //default methodlari overloading ile tekrar kullanip degistirebilirsin.
    default double boyKilometre() {
        return 0;
    }
}

//abstract class tamamlanmamis class gibi dusunmelisin. canliMi() methodu dikkat edilirse kodlanmamis. abstract belirsiz, muglak demektir.

abstract class Hayvan implements Boy{
    private int boy;
    private int kilo;
    public abstract boolean canliMi();


    public int boySantimetre() {
        return this.getBoy();
    }

    public int getBoy() {
        return boy;
    }
    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
}

//asagida hayvan classi extends ediliyorsa hayvanda abstract canliMi yi asagida tamamlayacaksin. boolean dondureceksin yani.
class Insan extends Hayvan{

    public Insan(int boy, int kilo) {
        this.setBoy(boy);
        this.setKilo(kilo);
    }

    public boolean canliMi(){
        return true;
    }


    public double boyMetre() {
        return this.getBoy()/100.0;
    }
}

class Bina implements Boy{

    public int boySantimetre() {
        return 2000;
    }
    public double boyMetre() {
        return 20;
    }
    public double boyKilometre() {
        return 0.02;
    }

}