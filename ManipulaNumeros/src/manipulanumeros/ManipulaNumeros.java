
package manipulanumeros;

import java.util.Scanner;


public class ManipulaNumeros {

    public static Scanner ler = new Scanner(System.in);
    public static int x, y;
    public static void main(String[] args) {
        
        int op;
        do{
            System.out.println("Menu de Operação com números");
            System.out.println("1 - Maior de 2 números");
            System.out.println("2 - Ordenar valores em decrescente");
            
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida");
            op = ler.nextInt();
            switch(op){
                case 0: break;
                case 1: 
                    leValores("Insira um valor","Insira outro valor");
                    MaiorNumero.maior2(x,y); 
                    break;
                case 2:
                    do{
                        le1Valor("Insira um valor");
                    }while(x<=0);
                    NumeroDecrescente.ordenaDecrescente(x);
                    
                    break;
                
                   
                default: System.out.println("Insira opção válida");
            }
        }while(op!=0);
    }
    private static void leValores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
    }

    private static void le1Valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();
    }
    
}
