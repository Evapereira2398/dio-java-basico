package anatomia;

public class somandoNumeros {
    public static void main(String[] args) {
        int n1 = 700;
        int n2 = 50; 
        int resultado = resultadoSoma(n1, n2);
        System.out.print(resultado);
    }

    public static int resultadoSoma(int n1, int n2){
        return n1 + n2; 
    }
}
