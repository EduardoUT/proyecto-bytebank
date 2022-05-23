/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente(); //<- Al crearse una nueva cuenta, creamos tambiÃ©n un cliente.
    private static int totalCuentas = 0;

    public Cuenta(int agencia) {
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        totalCuentas++;
        System.out.println("Cuentas Creadas: " + totalCuentas);
    }

    // MÃ©todo sin retorno, para especÃ­ficar se usa void.
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // MÃ©todo con retorno. Cuando indicamos el tipo boolean, int, double
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    //Getter
    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalCuentas() {
        return Cuenta.totalCuentas;
    }
}
