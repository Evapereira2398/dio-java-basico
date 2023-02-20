package operadores;

public class opLogicos {
    public static void main(String[] args) {
        boolean cond1 = true; 
        boolean cond2 = false; 

        // O e comercial "&&" precisa que as duas condições sejam verdadeiras para mensagem ser exibida
        // && = e 
        if(cond1 && cond2){
            System.out.println("As condições são verdadeiras");
        }

        // O simbolo de || precisa que pelo menos uma das condições sejam verdadeiras para exibir a mensagem
        // || = ou 
        if(cond1 || cond2){
            System.out.println("Uma das condições é verdadeira");
        }

        // Podemos criar uma condição interna
        if(cond1 && (7 > 4)){ 
            System.out.println("A condição e a relação entre os números são verdadeiras");
        }
        
        if(cond1 || (7 < 4)){ 
            System.out.println("Uma das condições acimas é verdadeira");
        }

    }
}
