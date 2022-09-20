

package manipulanumeros;


class Carro {

    static void calculaValorFinal() {
        double custoFabrica,custoFinal;
       System.out.println("Insira o custo de fábrica do veiculo");
       custoFabrica = ManipulaNumeros.ler.nextDouble();
       custoFinal = custoFabrica + 
               (custoFabrica*0.28) + (custoFabrica*0.45);
       System.out.println("Custo final do veiculo: "+custoFinal);
    }
}
