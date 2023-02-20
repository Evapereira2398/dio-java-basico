package variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        //Exemplos dos tipos de variáveis
        byte idade = 24;
		short ano = 2023;
		int cep = 82590200; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 85489674885l; // se começar com zero, talvez tenha que ser outro tipo, tem que contem l L no final
		float pi = 3.14F; // O float sempre irá precisar do F no final, senao o IDE pode considerar como tipo double 
		double salario = 2552.75;
        
        System.out.println("Dados do usúario:"); 
        System.out.println("Idade: " + idade);
        System.out.println("Ano atual: " + ano);  
        System.out.println("CEP: " + cep); 
        System.out.println("CPF: " + cpf); 
        System.out.println("Salário do usúario: " + salario);
        System.out.println("Representação adicional de PI: " + pi); 

        // Alterando valores de uma variável
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.print(numeroCurto2);
    }
}
