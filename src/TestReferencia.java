/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class TestReferencia {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.depositar(200);
        Cuenta segundaCuenta = primeraCuenta;

        segundaCuenta.depositar(100);
        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo()); //100.0
        System.out.println("Saldo segunda cuenta: " + segundaCuenta.getSaldo()); //100.0

        segundaCuenta.depositar(400);
        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo()); //500.00

        System.out.println(primeraCuenta); //Cuenta@1b6d3586 <--Referencian al mismo lugar en memoria.
        System.out.println(segundaCuenta); //Cuenta@1b6d3586 <--Referencian al mismo lugar en memoria.

        if (primeraCuenta == segundaCuenta) {
            System.out.println("Son el mismo objeto");
        }
    }
}
