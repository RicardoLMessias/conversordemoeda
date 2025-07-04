package principal;

import com.google.gson.JsonSyntaxException;
import metodos.Conversor;

import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int opcao = 9;
        String menu = """  
                ** Digite sua opção **              
                1 - Dolar para Real
                2 - Real para Dolar
                3 - Dolar para Euro
                4 - Euro para Dolar
                5 - Dolar para Peso Argentino
                6 - Peso Argentino para Dolar
                0 - Finalizar""";

        while (opcao!=0){
            System.out.println("================================");
            System.out.println(menu);
            System.out.println("================================");

            opcao = teclado.nextInt();

            if (opcao==1){
//                dolar para real
                System.out.println("Quantos DOLARES sera convertido para REAL?");
                Conversor conversor = new Conversor();
                double valor = teclado.nextDouble();
                conversor.setValorParaConverter(valor);
                conversor.valorConvertido("USD","BRL");



            } else if (opcao==2) {
//                real para dolar
                System.out.println("Quantos REAIS sera convertido para DOLAR?");
                Conversor conversor = new Conversor();
                double valor = teclado.nextDouble();
                conversor.setValorParaConverter(valor);
                conversor.valorConvertido("BRL","USD");


            } else if (opcao==3) {
//                dolar para euro
                System.out.println("Quantos DOLARES sera convertido para EURO?");
                Conversor conversor = new Conversor();
                double valor = teclado.nextDouble();
                conversor.setValorParaConverter(valor);
                conversor.valorConvertido("USD","EUR");


            } else if (opcao==4) {
//                euro para dolar
                System.out.println("Quantos EUROS sera convertido para DOLAR?");
                Conversor conversor = new Conversor();
                double valor = teclado.nextDouble();
                conversor.setValorParaConverter(valor);
                conversor.valorConvertido("EUR","USD");


            } else if (opcao==5) {
//                dolar para peso
                System.out.println("Quantos DOLARES sera convertido para PESO?");
                Conversor conversor = new Conversor();
                double valor = teclado.nextDouble();
                conversor.setValorParaConverter(valor);
                conversor.valorConvertido("USD","ARS");


            } else if (opcao==6) {
//                peso para dolar
                System.out.println("Quantos PESOS sera convertido para DOLAR?");
                Conversor conversor = new Conversor();
                double valor = teclado.nextDouble();
                conversor.setValorParaConverter(valor);
                conversor.valorConvertido("ARS","USD");


            } else if (opcao < 0 || opcao > 6) {

                System.out.println("Numero invalido, digite uma opção valida.");

            }



        }
        System.out.println("Obrigado por utilizar nossos serviços");

    }
}
