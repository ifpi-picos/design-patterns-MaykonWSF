abstract class DispositivoInteligente {

    // Método principal que será chamado pelo cliente
    public final void ligar() {
        saudacoes();
        inicializarDispositivo();
        notificarUsuario();
    }

    // Métodos que serão implementados pelas subclasses
    protected void saudacoes() {
        System.out.println("Olá, seja bem vindo!\n");
    }
    protected void notificarUsuario() {
        System.out.println("*** Dispositivo ligado! ***");
    }

    // Método abstrato que será implementado de maneira específica pelas subclasses
    protected abstract void inicializarDispositivo();
}