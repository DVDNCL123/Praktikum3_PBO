package PraktikumPert3;

public class KonversiSuhu2 extends KonversiSuhu {
    // Method untuk mengubah suhu dari Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4/9;
    }
}
