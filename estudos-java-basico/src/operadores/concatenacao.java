package operadores;

public class concatenacao {
    
    public static void main(String[] args) {
        
        //Obs: O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
        // No exemplo abaixo o operador de adiçãp irá unir as duas Strings. 
        
        //String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.print(nomeCompleto); 
        
        //qual o resultado das expressoes abaixo? Resultado apresentado utilizando o "debug"
        String concatenacao = "?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
