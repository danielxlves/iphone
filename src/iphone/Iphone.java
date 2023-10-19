package iphone;

import iphone.aparelhotelefonico.AparelhoTelefonico;
import iphone.aparelhotelefonico.MetodosTelefonicos;
import iphone.navegadorinternet.MetodosNavegar;
import iphone.navegadorinternet.NavegadorInternet;
import iphone.reprodutormusical.MetodosReproducaoMusical;
import iphone.reprodutormusical.ReprodutorMusical;

import java.math.BigInteger;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String user;
    private BigInteger num;


    public static void main(String[] args) {

        Iphone iphone = new Iphone("Daniel", "84987511010");

        System.out.println("Usúario do iphone: " + iphone.getUser());
        System.out.println("Número do iphone: " + iphone.getNum());

        iphone.atender();
        iphone.ligar();
        iphone.IniciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();


        AparelhoTelefonico telefone = new MetodosTelefonicos();

        //telefone.atender();
        //telefone.ligar();
        //telefone.IniciarCorreioVoz();

        ReprodutorMusical reprodutor = new MetodosReproducaoMusical();

        //reprodutor.pausar();
        //reprodutor.tocar();
        //reprodutor.selecionarMusica();

        NavegadorInternet navegador = new MetodosNavegar();

        //navegador.adicionarNovaAba();
        //navegador.atualizarPagina();
        //navegador.adicionarNovaAba();

    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public BigInteger getNum() {
        return num;
    }

    public void setNum(BigInteger num) {
        this.num = num;
    }

    public Iphone(String user, String num) {
        this.user = user;
        this.num = new BigInteger(num);
    }


    @Override
    public void ligar() {
        System.out.println("Usando iphone para ligar");
    }

    @Override
    public void atender() {
        System.out.println("Usando iphone para atender");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Usando iphone para iniciar correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Usando iphone para exibir pagina web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Usando iphone para adicionar uma nova aba em uma pagina web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Usando iphone para atualizar uma pagina web");
    }

    @Override
    public void tocar() {
        System.out.println("Usando iphone para tocar uma musica");
    }

    @Override
    public void pausar() {
        System.out.println("Usando iphone para pausar uma musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Usando iphone para selecionar uma musica");
    }




}
