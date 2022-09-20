

package manipulanumeros;



class ComparaNumero {

    static void comparar2Valores(int x, int y) {
        if(x==y)
            System.out.println("Os valores são iguais");
        else if(x>y)
            System.out.println(x+" > "+y);
        else
            System.out.println(y+" > "+x);
    }    
}
