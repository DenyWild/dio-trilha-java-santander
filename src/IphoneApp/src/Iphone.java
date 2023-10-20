public class Iphone implements AparelhoEletronico, ReprodutorMusical, NavegadorInternet {

    public void ligarIphone() {
        System.out.println("Ligando iPhone");
        carregando();
        System.out.println("Iphone Ligado! \n");
    }

    public void desligarIphone() {
        System.out.println("Desligando iPhone");
        carregando();
        System.out.println("Iphone Desligado. \n");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
        carregando();
        System.out.println("Pagina exibida com sucesso! \n");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada! \n");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
        carregando();
        System.out.println("Pagina Atualizada! \n ");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica... \n");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada. \n");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando outra musica... \n");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para contato... \n");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida! \n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado! \n");
    }

    public void carregando() {

        System.out.println("...");
        System.out.println("...");

    }

}