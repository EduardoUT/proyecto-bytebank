/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class TestReferenciaObjetoCliente {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("45444332");
        diego.setTelefono("55232323");

        Cuenta cuentaDiego = new Cuenta(1);
        cuentaDiego.setTitular(diego); //<- Referencia a la cuenta del cliente.
        System.out.println(cuentaDiego.getTitular().getDocumento());
        /*
        * Cliente@1b6d3586 Ambas instancias cuentaDiego y diego apuntan al mismo objeto Cliente
        * Por lo que los cambios que se realizen de uno u otro se verÃ¡n
        * reflejados en ambas instancias.
        * */
        System.out.println(cuentaDiego.getTitular());
        System.out.println(diego);
    }
}
