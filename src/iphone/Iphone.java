package iphone;

import iphone.aparelho.AparelhoTelefonico;
import iphone.navegador.NavegadorInternet;
import iphone.reprodutor.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void atender() {
        // Implemente a lógica para atender uma chamada
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
        System.out.println("Finalizando ligação.");
    }

    @Override
    public void ativarVivaVoz() {
        // Implemente a lógica para ativar o viva-voz
    }

    @Override
    public void mutar() {
        // Implemente a lógica para ativar o mudo
    }

    @Override
    public void tocarMusica(String musica) {
        // Implemente a lógica para tocar música
    }

    @Override
    public void pausar() {
        // Implemente a lógica para pausar a música
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando Volume. Volume atual: ");
        // Adjuste
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o Volume. Volume atual: ");
        // Adjuste
    }

    @Override
    public void abrirSite(String site) {
        System.out.println("Abrindo página do navegador");
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
        System.out.println("Fechando Aba ");
    }

    public static void main(String[] args) {
        System.out.println("Testa o código!");

        Iphone iphone = new Iphone();
        // Chame o método fecharAba na instância
        iphone.fecharAba();
        iphone.atualizarPagina();

    }
}
