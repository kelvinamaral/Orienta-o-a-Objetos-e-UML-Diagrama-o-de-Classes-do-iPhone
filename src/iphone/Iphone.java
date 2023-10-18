package iphone;

import iphone.aparelho.AparelhoTelefonico;
import iphone.navegador.NavegadorInternet;
import iphone.reprodutor.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private int volume = 50; // Volume padrão, 50 no meio

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no telefone");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação.");
    }

    @Override
    public void correioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Finalizando ligação");
    }

    @Override
    public void ativarVivaVoz() {
        System.out.println("Ativando Viva Voz");
    }

    @Override
    public void mutar() {
        System.out.println("A chamada foi mutada");
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando nova música: " + musica);
    }

    @Override
    public void aumentarVolume() {
        if (volume < 100) { // Verifica o volume máximo (normalmente 100)
            volume++;
            System.out.println("Aumentando volume para " + volume);
        } else {
            System.out.println("O volume já está no máximo.");
        }
    }

    @Override
    public void diminuirVolume() {
        if (volume > 0) { // Verifica o volume mínimo (normalmente 0)
            volume--;
            System.out.println("Diminuindo volume para " + volume);
        } else {
            System.out.println("O volume já está no mínimo.");
        }
    }

    @Override
    public void abrirSite(String site) {
        System.out.println("Abrindo página do navegador: " + site);
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página da Web...");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando Aba");
    }

    public static void main(String[] args) {
        System.out.println("Testando o código!");

        Iphone iphone = new Iphone();

        // Chama os métodos na instância
        iphone.fecharAba();
        iphone.atualizarPagina();

        // Chama outros métodos de AparelhoTelefonico
        iphone.atender();
        iphone.ligar();
        iphone.correioVoz();
        iphone.finalizarChamada();
        iphone.ativarVivaVoz();
        iphone.mutar();

        // Chama outros métodos de ReprodutorMusical

        iphone.tocarMusica("Música - nome!");
        iphone.pausar();
        iphone.aumentarVolume();
        iphone.diminuirVolume();


        // Chama outros métodos de NavegadorInternet
        iphone.abrirSite("#");
        iphone.novaAba();
        iphone.atualizarPagina();
        iphone.fecharAba();
    }

}
