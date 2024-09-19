package PraktikumPert3;

public class KonversiSuhuInheritance {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        double celcius = 100;
        double fahrenheit = 212;

        System.out.println(celcius + " Celcius ke Fahrenheit: " + konversi.celciusToFahrenheit(celcius));
        System.out.println(celcius + " Celcius ke Reamur: " + konversi.celciusToReamur(celcius));

        System.out.println(fahrenheit + " Fahrenheit ke Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
    }
}