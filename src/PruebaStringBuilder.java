/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcore
 */
public class PruebaStringBuilder {

    public static void main(String[] args) {
        /**
         * *
         * Cuando usar concatenaciÃ³n Referencia:
         * https://www.alura.com.br/artigos/revisitando-a-concatenacao-de-strings-stringbuilder-e-stringbuffer
         *
         */
        /*String numeros = "";
        for (int i = 0; i < 30000; i++) {
            numeros += i;
            System.out.println(numeros.length());
        }
        El Bytecide geberado serÃ­a:
        String numeros = ""; for (int i = 0; i<30000; i++) { numeros = new StringBuilder() .append(numeros).append(i).toString(); } System.out.println(numeros.length());
        En cada iteraciÃ³n generÃ¡ una nueva instancia lo que hace que se generÃ© mÃ¡s tiempo.


        Algunos incluso dicen que no debemos usar el operador +,
        ni siquiera en operaciones simples como estas:
         */

        //Forma mÃ¡s eficiente usando StringBuilder directamente.
        //En este caso solo definimos el StringBuilder una sola vez
        StringBuilder nums = new StringBuilder();
        for (int i = 0; i < 30000; i++) {
            //Luego se invoca para las partes nuevas del String, sin copiar lo que ya se ha procesado.
            nums.append(i);
        }
        System.out.println(nums.toString().length());
    }
}
