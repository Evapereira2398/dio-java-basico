package anatomia;

public class boletimEscolar {
    
    public static void main(String[] args) {
        int media = 4; 

        if(media < 6){
            System.out.print("REPROVADO!");
        }

        else if (media == 6){ 
            System.out.print("RECUPERAÇÃO!");
        }

        else{
            System.out.print("APOVADO");
        }
    }
}
