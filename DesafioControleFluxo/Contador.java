package DesafioControleFluxo;

import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digíte o primeiro número: ");
        num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digíte o segundo número: ");
        num2 = scanner.nextInt();
        scanner.nextLine();


        try{
            contar(num1, num2);

        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            int contagem = parametro2 - parametro1;

            for(int i=0; i<contagem; i++){
                System.out.println("Imprimindo o número "+(i+1));
            }
        }
    }
}