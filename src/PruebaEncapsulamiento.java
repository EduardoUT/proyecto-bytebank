/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class PruebaEncapsulamiento {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        Cliente cliente = new Cliente();
        cliente.setNombre("Diego");
        cliente.setDocumento("ewrerknek3");
        cuenta.setTitular(cliente); // <- Referenciando por medio de setter en lugar de =
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
