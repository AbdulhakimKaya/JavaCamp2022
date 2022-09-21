package intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("deneme");

        // değişken isimleri camelCase yazılır
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.74;
        double dolarBugun = 18.93;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
        }
        else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
        }
        else {
            okYonu = "equal.svg";
        }

        System.out.println(okYonu);

        //array
        String[] krediler = {"Hızlı Kredi", "Maaşını HalkBank'tan Alan", "Mutlu Emekli"};

        for (int i= 0; i< krediler.length; i++){
            System.out.println(krediler[i]);
        }
    }
}