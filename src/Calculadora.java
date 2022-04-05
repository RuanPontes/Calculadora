import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int conta1;
        int conta2;


        Scanner insira = new Scanner(System.in);

        System.out.println("\nBem vindo a calculadora em Java.");


        System.out.println("Deseja fazer uma adição,subtração ou multiplicação?");
        String conta = insira.next();

        if (conta.equalsIgnoreCase("adição")){
            System.out.println("\nDigite o primeiro número para adição ");
            conta1 = insira.nextInt();
            System.out.println("Digite segundo número para adição ");
            conta2 = insira.nextInt();

            System.out.println("\nO resultado foi = " + (conta1 + conta2));

        }

        if (conta.equalsIgnoreCase("subtração")) {
            System.out.println("Digite o primeiro número para subtração ");
            conta1 = insira.nextInt();
            System.out.println("Digite segundo número para subtração ");
            conta2 = insira.nextInt();

            System.out.println("O resultado foi = " + (conta1 - conta2));
        }

        if (conta.equalsIgnoreCase("multiplicação")) {
            System.out.println("Digite o primeiro número para multiplicação ");
            conta1 = insira.nextInt();
            System.out.println("Digite segundo número para multiplicação ");
            conta2 = insira.nextInt();

            System.out.println("O resultado foi = " + (conta1 * conta2));
        }

        if (conta.equalsIgnoreCase("divisão")) {
            System.out.println("Digite o primeiro número para divisão ");
            conta1 = insira.nextInt();
            System.out.println("Digite segundo número para divisão ");
            conta2 = insira.nextInt();

            System.out.println("O resultado foi = " + (conta1 / conta2));
        }


        while (!conta.equalsIgnoreCase("adição") & !conta.equalsIgnoreCase("subtração") & !conta.equalsIgnoreCase("divisão") & !conta.equalsIgnoreCase("multiplicação") ){
            System.out.println("Insira novamente qual operação você deseja fazer:");
            conta = insira.next();


            if (conta.equalsIgnoreCase("adição")){
                System.out.println("Digite o primeiro número para adição ");
                conta1 = insira.nextInt();
                System.out.println("Digite segundo número para adição ");
                conta2 = insira.nextInt();

                System.out.println("O resultado foi = " + (conta1 + conta2));
            }

            if (conta.equalsIgnoreCase("subtração")){
                System.out.println("Digite o primeiro número para subtração ");
                conta1 = insira.nextInt();
                System.out.println("Digite segundo número para subtração ");
                conta2 = insira.nextInt();

                System.out.println("O resultado foi = " + (conta1 - conta2));
            }

            if (conta.equalsIgnoreCase("multiplicação")) {
                System.out.println("Digite o primeiro número para multiplicação ");
                conta1 = insira.nextInt();
                System.out.println("Digite segundo número para multiplicação ");
                conta2 = insira.nextInt();

                System.out.println("O resultado foi = " + (conta1 * conta2));
            }

            if (conta.equalsIgnoreCase("divisão")) {
                System.out.println("Digite o primeiro número para divisão ");
                conta1 = insira.nextInt();
                System.out.println("Digite segundo número para divisão ");
                conta2 = insira.nextInt();

                System.out.println("O resultado foi = " + (conta1 / conta2));
            }


        }

        System.out.println("\nO programa foi executado com sucesso! ");


    }}
