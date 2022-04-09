import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int conta1;
        int conta2;
        double [] notas = new double[4];


        Scanner insira = new Scanner(System.in);

        System.out.println("\nBem vindo a calculadora em Java.\n");
        System.out.println("-----------------------------------------------------\n");


        System.out.println("Deseja fazer qual operação? \nadição.\nsubtração.\nmultiplicação.\nmédia de notas.\nraiz quadrada.");
        String conta = insira.next();


        if (conta.equalsIgnoreCase("raiz")) {
            System.out.println("Digite o número para saber a raiz quadrada: ");
            conta1 = insira.nextInt();

            double raiz = (Math.sqrt(conta1));

            System.out.println("A raiz do número " + conta1 + " é igual a " + raiz);
        }

        if (conta.equalsIgnoreCase("Média")){
            for (int i = 0; i < notas.length ; i++) {
                System.out.println("Digite a nota "+ (i + 1));
                notas[i]= insira.nextDouble();

            }
            double media = 0;

            for (int i = 0; i < notas.length ; i++) {
                media = media + notas [i];
                System.out.println("Nota " + (i + 1) + ": "+notas[i]);
            }
            media = media / notas.length;
            System.out.println("Media das notas: "+media);
        }

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


        while (!conta.equalsIgnoreCase("adição") & !conta.equalsIgnoreCase("subtração") & !conta.equalsIgnoreCase("divisão") & !conta.equalsIgnoreCase("multiplicação") &!conta.equalsIgnoreCase("Média") &!conta.equalsIgnoreCase("raiz") ){
            System.out.println("\nInsira novamente qual operação você deseja fazer.");
            System.out.println("Lembre-se de usar palavras chaves como: adição,subtração,divisão,raiz,média:");
            System.out.println("-----------------------------------------------------");
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

            if (conta.equalsIgnoreCase("Média")){
                for (int i = 0; i < notas.length ; i++) {
                    System.out.println("Digite a nota "+ (i + 1));
                    notas[i]= insira.nextDouble();

                }
                double media = 0;

                for (int i = 0; i < notas.length ; i++) {
                    media = media + notas [i];
                    System.out.println("Nota " + (i + 1) + ": "+notas[i]);
                }
                media = media / notas.length;
                System.out.println("Media das notas: "+media);
            }

            if (conta.equalsIgnoreCase("raiz")) {
                System.out.println("Digite o número para saber a raiz quadrada: ");
                conta1 = insira.nextInt();

                double raiz = (Math.sqrt(conta1));

                System.out.println("A raiz do número " + conta1 + " é igual a " + raiz);
            }


        }
        System.out.println("-----------------------------------------------------");
        System.out.println("O programa foi executado com sucesso! ");


    }}