public class LigarDispositivo{
    
    public static void main(String[] args) {
        DispositivoInteligente arCondicionado = new ArCondicionadoInteligente();
        DispositivoInteligente lampada = new LampadaInteligente();
        
        arCondicionado.ligar();
        lampada.ligar();
    }
}