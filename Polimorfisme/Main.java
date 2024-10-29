package Polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;
        //persegi
        bangunDatar = new Persegi(4);
        System.out.println("PERSEGI: ");
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("keliling persegi: " + bangunDatar.keliling());


        // Lingkaran
        bangunDatar = new Lingkaran(5);
        System.out.println("LINGKARAN: ");
        System.out.println("Luas Lingkaran: " + bangunDatar.luas());
        System.out.println("Keliling Lingkaran: " + bangunDatar.keliling());


        // Segitiga sama sisi
        bangunDatar = new SegitigaSamaSisi(6);
        System.out.println("SEGITIGA SAMA SISI: ");
        System.out.println("Luas SegitigaSamaSisi: " + bangunDatar.luas());
        System.out.println("Keliling SegitigaSamaSisi: " + bangunDatar.keliling());
    }
}
