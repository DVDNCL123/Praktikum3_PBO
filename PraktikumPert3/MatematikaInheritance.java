/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPert3;

/**
 *
 * @author ASUS
 */
class MatematikaInheritance {
    public static void main(String[] args) {
        // Membuat objek dari class Matematika2
        Matematika2 matematika = new Matematika2();

        // Memanggil method-method dari class Matematika
        System.out.println("Penjumlahan dari 10+5 : " + matematika.pertambahan(10, 5));
        System.out.println("Pengurangan dari 10+5 : " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian dari 10+5 : " + matematika.perkalian(10, 5));
        System.out.println("Pembagian dari 10+5 : " + matematika.pembagian(10, 5));

        // Memanggil method modulus dari class Matematika2
        System.out.println("Modulus dari 10:3 : " + matematika.modulus(10, 3));
    }
}
