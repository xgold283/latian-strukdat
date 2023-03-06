import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<makan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<makan, Minuman> lunch = new Konsumsi<>();

        makan roti = new makan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("susu sapi");
        breakfast.setKomsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        makan nasi = new makan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKomsumsi(nasi, air);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<makan, Minuman> konsumsi: listKonsumsi){
            makan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}

