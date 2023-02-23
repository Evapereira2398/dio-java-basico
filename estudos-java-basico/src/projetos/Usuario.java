package projetos;

// Projeto da SmartTv

// 1 - Ela tenha as características: ligada (boolean), canal (int) e volume (int);
// 2 - Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
// 3 - Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
// 4 - Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente; 

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        
        // Configurações iniciais da TV
        System.out.println("---------------------- Configurações Iniciais ---------------------");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("Canal inicial: " + smartTv.canal);
        System.out.println("-------------------------------------------------------------------");

        // Ligando TV
        smartTv.ligar();
        System.out.println("A TV foi ligada? " + smartTv.ligada);
        
        // Aumentando Volume
        System.out.println("O volume da TV está muito baixo, vamos aumentar...");
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume agora está em: " + smartTv.volume);
        
        // Diminuindo o volume da TV
        System.out.println("O volume da TV ficou muito alto, vamos diminuir um pouco...");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume agora está em: " + smartTv.volume);
        
        // Trocando o Canal
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        
        // Escolhendo Canal
        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " + smartTv.canal);
        
        // Desligando TV
        System.out.println("Cansei de ver tv, vamos desligar");
        smartTv.desligar();
        System.out.println("A TV foi desligada? " + smartTv.ligada);
    }

}
        
