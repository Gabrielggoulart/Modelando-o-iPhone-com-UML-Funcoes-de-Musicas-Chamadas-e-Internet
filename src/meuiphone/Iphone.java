package meuiphone;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

    //ReprodutorMusical
     public void tocar() {
         System.out.println("Reproduzindo música...");
     }
 
     public void pausar() {
         System.out.println("Música pausada.");
     }
 
     public void selecionarMusica(String musica) {
         System.out.println("Música selecionada: " + musica);
     }
 
     // AparelhoTelefonico
     
     public void ligar(String numero) {
         System.out.println("Ligando para: " + numero);
     }
 
     public void atender() {
         System.out.println("Atendendo a chamada.");
     }

     public void iniciarCorreioVoz() {
         System.out.println("Iniciando correio de voz.");
     }
 
     //NavegadorInternet
     public void exibirPagina(String url) {
         System.out.println("Exibindo página: " + url);
     }

     public void adicionarNovaAba() {
         System.out.println("Nova aba adicionada.");
     }
 
     public void atualizarPagina() {
         System.out.println("Página atualizada.");
     }
 
}
