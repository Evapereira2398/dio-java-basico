package projetos;

public class SmartTv {
    boolean ligada = false; 
    int volume = 10; 
    int canal = 4; 


    // Volume 
    public void aumentarVolume(){
        volume++; 
    }

    public void diminuirVolume(){
        volume--; 
    }

    // Canal
    public void aumentarCanal(){
        canal++; 
    }

    public void diminuirCanal(){
        canal--; 
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal; 
    }

    // Liga e Desliga
    public void ligar(){
        ligada = true; 
    }

    public void desligar(){
        ligada = !false; 
    }
}
