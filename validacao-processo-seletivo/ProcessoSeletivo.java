import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception{
        System.out.println("Processo Seletivo");
        contato();
    }

    public static void contato(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA"};
        int tentativa = 0;
        boolean atendeu = false;

        for(int i=0; i<5; i++){
            while(tentativa<3 && atendeu == false){
                atendeu = atender();
                if(atendeu == false){
                    tentativa++;
                }else{
                    System.out.println("CONTATO REALIZADO COM SUCESSO!");
                }
            }

            if (atendeu){
                System.out.println("CONSEGUIMOS CONTATO COM "+candidatos[i]+" NA "+(tentativa+1)+"ª TENTATIVA.");
            }else{
                System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidatos[i]+", NÚMERO MÁXIMO DE TENTATIVAS "+tentativa+" REALIZADAS.");
            }
            tentativa=0;
            atendeu=false;
        }
    }

    //Metodo auxiliar do contato
    public static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    //Mostrando candidatos selecionados em uma lista
    public static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA"};

        System.out.println("Lista dos candidatos selecionados!");
        for(int i=1; i<6; i++){
            System.out.println("Candidato N°"+i+" é "+candidatos[i-1]);
        }

    }

    //Selecionando candidatos através do salário pretendido - Se for menor que o salário base - Candidato selecionado
    public static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};

        int candSelecionados = 0;
        int candAtual = 0;
        double salarioBase = 2000.00;
        while(candSelecionados < 5){
            double salarioPretendido = valorPretendido();
            
            if(salarioPretendido <= salarioBase){
                System.out.println("Canditado "+candidatos[candAtual]+" selecionado para a vaga.");
                System.out.println("Valor solicitado: R$ "+formataDecimal(salarioPretendido));
                System.out.println("");
                candSelecionados++;
            }
            candAtual++;
        }
    }

    //Formatando valor com 2 casas decimais
    public static String formataDecimal(double valor){
        return String.format("%.2f", valor);
    }

    //Pegando valor pretendido pelo candidato
    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //Analisando se o salario pretendido é menor que o salário base
    public static void analisaCandidato(double salarioPretendido){
        double salarioBase = 2000;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}