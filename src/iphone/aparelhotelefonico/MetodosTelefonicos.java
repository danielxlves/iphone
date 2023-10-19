package iphone.aparelhotelefonico;

public class MetodosTelefonicos implements AparelhoTelefonico {


    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }
}
