package anatomia;

public class nomeCompleto {
    public static void main(String[] args) {
        String nome = "Evanderson"; 
        String sobrenome = "Pereira";
        String nomeCompleto = completar(nome, sobrenome);
        System.out.print(nomeCompleto);    
    }

    public static String completar(String nome, String sobrenome){
        return "Seu nome completo é: " + nome + " " + sobrenome; 
    }
}
