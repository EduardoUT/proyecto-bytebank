/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class PruebaAcceso {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        System.out.println(cuenta.getAgencia());
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());
    }
}
