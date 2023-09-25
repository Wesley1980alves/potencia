/*
 Desenvolva um algoritmo que leia dois números inteiros e faça a potenciação do
primeiro pelo segundo.
 */

/**
 *
 * @author Wesley
 */
public class CalcularPotencia {

    public static void main(String[] args) {

        Potencia calc = new Potencia();

        int potencia = calc.potencia(5, 3);
        if (potencia == 125) {
            System.out.println("Resultado Esperado");
        } else {
            System.out.println("Resultado Inesperado");

        }

    }

}
