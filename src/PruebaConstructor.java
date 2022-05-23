/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class PruebaConstructor {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(4);
        System.out.println(cuenta.getAgencia());
        Cuenta cuenta1 = new Cuenta(3);
        Cuenta cuenta2 = new Cuenta(5);
        System.out.println(Cuenta.getTotalCuentas());
    }
}
