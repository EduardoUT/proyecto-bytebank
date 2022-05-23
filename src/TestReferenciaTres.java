/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class TestReferenciaTres {

    public static void main(String[] args) {
        Cuenta cuentaDiego = new Cuenta(1);
        /*
        * En lugar de crear un nuevo cliente y hacer
        * la referencia a la cuenta correspondiente:
        * Cliente cliente = new Cliente();
        *
        * Es mÃ¡s optimo:
        * cuentaDiego.titular = new Cliente(); // <- Se almacena la referencia al objeto Cliente.
        *
        * Sin embargo puede mejorar, en la clase Cuenta podemos definir:
        *
        * Cliente titular = new Cliente(); <- Como un atributo mÃ¡s
        *
        * De tal forma que al crear un nuevo objeto Cuenta(); crearemos tambiÃ©n
        * un objeto cliente.
        * */
        System.out.println(cuentaDiego.getTitular().getNombre());
    }
}
