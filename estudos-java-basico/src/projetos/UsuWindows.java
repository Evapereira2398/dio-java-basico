package projetos;

public class UsuWindows {
    public static void main(String[] args) {
        Windows windows = new Windows(); 

        System.out.println("Configurações iniciais do computador: ");
        System.out.println("Computador ligado? " + windows.computador);
        System.out.println("Monitor ligado? " + windows.monitor);

        System.out.println("Ligando computador");
        windows.ligarComputador();
        System.out.println("Novo Status -> Computador ligado " + windows.computador);

        System.out.println("Ligando monitor");
        windows.ligarMonitor();
        System.out.println("Novo Status -> Monitor ligado " + windows.monitor);

        System.out.println("Desligando computador");
        windows.desligarComputador();
        System.out.println("Novo Status -> Computador desligado " + windows.computador);

        System.out.println("Desligando monitor");
        windows.desligarMonitor();
        System.out.println("Novo Status -> Monitor desligado " + windows.monitor);
    }
}
