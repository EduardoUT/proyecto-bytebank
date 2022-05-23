
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mcore
 */
public class TestBigDecimal {

    public static void main(String[] args) {
        /**
         * El por que no es recomendable trabajar con dinero con double en Java
         * y usilizar mejor BigDecima. Referencia:
         * https://www.alura.com.br/artigos/arredondamento-no-java-do-double-ao-bigdecimal
         *
         */

        //Usando double el resultado esperado es 0.3.
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2); // R= 0.30000000000000004

        //Usando BidDecimal con nÃºmeros double.
        BigDecimal big1 = new BigDecimal(0.1);
        BigDecimal big2 = new BigDecimal(0.2);
        System.out.println(big1.add(big2)); // R= 0.3000000000000000166533453693773481063544750213623046875
        /**
         * Si pasamos directamente nÃºmeros como double, se transportan de
         * manera incorrecta, la documentaciÃ³n dice: "Los resultados de este
         * constructor pueden ser algo impredecibles".
         *
         * SoluciÃ³n: Use el constructor que funciona con String, por lo que
         * BigDecimal analizarÃ¡ internamente estos nÃºmeros sin que se
         * almacenen en un double, evitando problemas de precisiÃ³n:
         */

        //Usando BigDecimal pasando por el constructor valores numÃ©ricos String.
        BigDecimal bigNumOne = new BigDecimal("0.1");
        BigDecimal bigNumTwo = new BigDecimal("0.2");
        System.out.println(bigNumOne.add(bigNumTwo)); // Boom! Resultado esperado: 0.3

        /**
         * Para el caso de los redondeos, BigDecimal, por defecto no los
         * realizarÃ¡, lo que lo obligarÃ¡ a dar el error:
         * java.lang.AritmeticException, tal es el caso de la siguiente
         * operaciÃ³n:
         */
        BigDecimal bign1 = new BigDecimal("1");
        BigDecimal bign2 = new BigDecimal("3");
        System.out.println(bign1.divide(bign2, 3, RoundingMode.UP)); //0.334
    }
}
