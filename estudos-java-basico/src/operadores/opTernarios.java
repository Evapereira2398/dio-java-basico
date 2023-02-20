package operadores;

public class opTernarios {
    
    public static void main(String[] args) {
        //Operador ternário 
        int a, b;
        a = 5;
        b = 6;

       //UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";
        System.out.println(resultado);

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        
        String resultado = ""; 
        if (a == b){
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");
        } */
    }
}


