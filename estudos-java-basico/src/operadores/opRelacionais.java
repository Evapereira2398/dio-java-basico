package operadores;

public class opRelacionais {

    //Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.
    // == Quando desejamos verificar se uma variável é IGUAL A outra.
    // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
    // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    // < Quando desejamos verificar se uma variável é MENOR QUE outra.
    // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
    
        public static void main(String[] args) {
            
        int n1 = 5; 
        int n2 = 10;

        // Igual 
        boolean simNao = n1 == n2; 
        System.out.println("n1 é igual a n2? " + simNao);

        // Diferente
        boolean simNao2 = n1 != n2; 
        System.out.println("n1 é diferente de n2? " + simNao2); 
        
        // Maior que 
        boolean simNao3 = n1 > n2; 
        System.out.println("n1 é maior que n2? " + simNao3);

        // Menor que 
        boolean simNao4 = n1 < n2; 
        System.out.println("n1 é menor que n2? " + simNao4);


        // Para comparar variáveis de outros tipos

        String nome1 = "Evanderson";
        String nome2 = "Evanderson";

        System.out.println(nome1 == nome2);

        // Mas caso aconça isso... 

        String nomeUm = "Evanderson";
        String nomeDois = new String("Evanderson");

        System.out.println(nomeUm.equals(nomeDois)); //utilizamos "equals", para comparar objetos
    }
}
