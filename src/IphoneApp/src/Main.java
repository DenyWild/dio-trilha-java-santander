import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Você deseja ligar seu iphone:\n1 - Sim | 2 - Não");
        int opcaoLigar = scan.nextInt();
        Iphone iphone = new Iphone();
        boolean ligar;
        if (opcaoLigar == 1) {
            ligar = true;
            iphone.ligarIphone();
            while (ligar == true) {
                System.out.println("Escolha uma das opcões para continuar sua experiência ");
                System.out.println("1 - Aparelho Telefonico");
                System.out.println("2 - Navegador Internet");
                System.out.println("3 - Reprodutor Musical");
                System.out.println("4 - Desligar Iphone");
                System.out.println("------------------------------------------------------\n");
                int opcaoMenu = scan.nextInt();
                switch (opcaoMenu) {
                    case 1:
                        System.out.println("Bem-Vindo ao Aparelho Telefonico! Digite a opção que deseja utilizar:  ");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Atender");
                        System.out.println("3 - Iniciar Correio de Voz");
                        System.out.println("4 - Desligar Iphone");
                        System.out.println("------------------------------------------------------\n");
                        opcaoMenu = scan.nextInt();
                        switch (opcaoMenu) {

                            case 1:
                                iphone.ligar();
                                break;
                            case 2:
                                iphone.atender();
                                break;
                            case 3:
                                iphone.iniciarCorreioVoz();
                                break;
                            case 4:
                                ligar = false;
                                iphone.desligarIphone();
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("Bem-Vindo ao Navegador de Internet! Digite a opção que deseja utilizar:  ");
                        System.out.println("1 - Exibir Pagina");
                        System.out.println("2 - Adicionar Nova Aba");
                        System.out.println("3 - Atualizar Pagina");
                        System.out.println("4 - Desligar Iphone");
                        System.out.println("------------------------------------------------------\n");
                        opcaoMenu = scan.nextInt();
                        switch (opcaoMenu) {

                            case 1:
                                iphone.exibirPagina();
                                break;
                            case 2:
                                iphone.adicionarNovaAba();
                                break;
                            case 3:
                                iphone.atualizarPagina();
                                break;
                            case 4:
                                ligar = false;
                                iphone.desligarIphone();
                                break;

                        }
                        break;
                    case 3:
                        System.out.println("Bem-Vindo ao Reprodutor Nusical! Digite a opção que deseja utilizar:  ");
                        System.out.println("1 - Tocar");
                        System.out.println("2 - Pausar");
                        System.out.println("3 - Selecionar Musica");
                        System.out.println("4 - Desligar Iphone");
                        System.out.println("------------------------------------------------------\n");
                        opcaoMenu = scan.nextInt();
                        switch (opcaoMenu) {

                            case 1:
                                iphone.tocar();
                                break;
                            case 2:
                                iphone.pausar();
                                break;
                            case 3:
                                iphone.selecionarMusica();
                                break;
                            case 4:
                                ligar = false;
                                iphone.desligarIphone();
                                break;

                        }
                        break;
                    case 4:
                        ligar = false;
                        iphone.desligarIphone();
                        break;
                }

            }
        } else {
            iphone.desligarIphone();
        }
        scan.close();
    }
}
