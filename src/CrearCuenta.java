/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.depositar(1000);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(1);
        segundaCuenta.depositar(500);
        System.out.println(segundaCuenta.getSaldo());

        System.out.println(primeraCuenta); //Cuenta@1b6d3586 <--Referencian a un diferente lugar en memoria.
        System.out.println(segundaCuenta); //Cuenta@4554617c <--Referencian a un diferente lugar en memoria.

        if (primeraCuenta == segundaCuenta) {
            System.out.println("Son el mismo objeto");
        } else {
            System.out.println("Son objetos diferentes");
        }
    }
}
