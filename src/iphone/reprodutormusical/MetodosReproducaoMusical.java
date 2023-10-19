package iphone.reprodutormusical;

public class MetodosReproducaoMusical implements ReprodutorMusical{


    @Override
    public void tocar(){
        System.out.println("Tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar musica");
    }
}
