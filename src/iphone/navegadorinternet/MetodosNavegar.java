package iphone.navegadorinternet;

public class MetodosNavegar implements  NavegadorInternet {


    @Override
    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina");
    }
}
