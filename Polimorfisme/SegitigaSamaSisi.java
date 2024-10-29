package Polimorfisme;

public class SegitigaSamaSisi extends BangunDatar {
    private double sisi;

    public SegitigaSamaSisi(final double sisi){
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return (Math.sqrt(3) / 4) * Math.pow(sisi, 2);
    }

    @Override
    public double keliling() {
        return 3 * sisi;
    }

}
