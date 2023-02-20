package operadores;

public class opUnarios {

// Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

//(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
//(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
//(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
//(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
//(!) Operador unário lógico de negação – nega o valor de uma expressão booleana.

//Operadores Unários
    public static void main(String[] args) {
        //Mudando um valor para negativo
        int numeropos = 5; 
        numeropos = - numeropos; //N° Sempre negativo
        System.out.println(- numeropos); // N° negativo apenas nessa immpressão

        // Caso o N° precise voltsar a ser positivo
        numeropos = numeropos * -1; 
    }
}
