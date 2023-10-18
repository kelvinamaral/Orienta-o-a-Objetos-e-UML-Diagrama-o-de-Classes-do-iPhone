package iphone.navegador;

public interface NavegadorInternet {
    void abrirSite(String site);
    void novaAba();
    void atualizarPagina();
    void fecharAba();
    void scroll();
    void aplicarZoom(int nivel);

}
