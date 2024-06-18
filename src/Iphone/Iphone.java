package Iphone;

import AtributosDesejaveis.aparelhoTelefonico;
import AtributosDesejaveis.navegadorInternet;
import AtributosDesejaveis.reprodutorMusical;

public class Iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet{

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
       System.out.println("Pausando a música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        musica = "Crawling";
      System.out.println("Selecionando a música " + musica);
    }

    @Override
    public void ligar(String numero) {
        numero = "991546954";
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        url = "www.google.com";
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando a nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

}


