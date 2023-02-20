package operadores;

public class opAtribuicao {
    
    public static void main(String[] args) {
        //Operadores de atribuição
        // Cada tipo de dado tem a maneira correta de declarar o conteudo da variável. 

        // Tipo "String" temos que utilizar "" (Aspas Duplas)
        String nome = "Evanderson";
        
        // Tipo "inteiro" temos que utilizar o valor literal numérico
        int idade = 22;

        // Tipo "double" temos que utilizar o . (ponto)  para representar a parte decimal do valor
        double peso = 68.5;

        // Tipo "char", variavel do tipo "caracter", é representado com apenas um caracter dentro de '' (Aspas Simples) 
        char sexo = 'M';

        // Tipo "boolean" que representa um valor lógico, ou seja, Sim ou Não... Representamos pelo "True" ou "False"
        boolean doadorOrgao = false;

        //  
        //Date dataNascimento = new Date();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Doador de orgãos? " + doadorOrgao);

    }
}
