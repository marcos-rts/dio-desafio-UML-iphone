// Importando as interfaces do arquivo Interfaces.java
import java.util.Scanner;

// Classe iPhone que implementa as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Discando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        // Testando funcionalidades do iPhone
        meuiPhone.selecionarMusica("Bohemian Rhapsody");
        meuiPhone.tocar();
        meuiPhone.pausar();

        meuiPhone.ligar("123456789");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        meuiPhone.exibirPagina("https://www.google.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
