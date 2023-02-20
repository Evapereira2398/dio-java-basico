package operadores;

public class opAritmeticos {
    
    public static void main(String[] args) {
        
        // Operados Aritméticos
        // Podemos definir um valor em uma variavel e utilizar o mesmo valor em todas as operações
        int n1 = 10; 
        int n2 = 5; 
        int soma = n1 + n2;
        int subtração = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;
        int modulo = n1 % n2;
        double resultado = (10 * 7) + (20/4);
        
        System.out.println("Soma entre os números: " + soma);
        System.out.println("Subtração entre os números: " + subtração);
        System.out.println("Multiplicação entre os números: " + multiplicacao);
        System.out.println("Divisão entre os números: " + divisao);
        System.out.println("Resto da divisão entre os números: " + modulo);
        System.out.println("Resultado entre os números: " + resultado);

        //Tambem podemos usar os operadores diretamente nas variáveis

        double somar = 10.5 + 15.7;
        int subtritair = 113 - 25;
        int multiplicar = 20 * 7;
        int dividir = 15 / 3;
        int resto = 18 % 3;
        double result = (10 * 7) + (20/4);

        System.out.println("Soma entre os números: " + somar);
        System.out.println("Subtração entre os números: " + subtritair);
        System.out.println("Multiplicação entre os números: " + multiplicar);
        System.out.println("Divisão entre os números: " + dividir);
        System.out.println("Resto da divisão entre os números: " + resto);
        System.out.println("Resultado entre os números: " + result);
    }
}
