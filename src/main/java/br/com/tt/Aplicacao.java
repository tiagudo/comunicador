package br.com.tt;

import br.com.tt.model.Mensagem;
import br.com.tt.model.Usuario;

import java.util.Scanner;

public class Aplicacao {
    private static Usuario usuarioLogado;
//    private static int indiceUsuario = 0;

    private static Mensagem[] mensagens = new Mensagem[100];
    private static int indiceMensagens = 0;

    public static void main(String[] args) {
        perguntarUserName();

        while (true) {
            menu();

        }
    }

    private static void perguntarUserName() {
        System.out.println("Bem vindo!");
        System.out.println("Entre seu nome: ");
        String nome = new Scanner(System.in).nextLine();
//        novoUsuario.setNome(nome);
        usuarioLogado = new Usuario(nome);
    }

    private static int menu() {

        System.out.println("===== Digite uma opcao =====\n1 - nova mensagem || 2 - listar mensagens || 3 - sair\n");

        char opcao = new Scanner(System.in).nextLine().charAt(0);

        switch (opcao) {
            case '1':
                perguntarMensagem();
                break;
            case '2':
                listarMensagem();
                break;
            case '3':
                System.out.println("===== FINAL =====");
                System.exit(0);

            default:
                System.out.println("Opção inválida!\n");
        }
        return opcao;
    }

    private static void perguntarMensagem() {
        System.out.println("Entre sua mensagem: ");
        String texto = new Scanner(System.in).nextLine();
//        Mensagem novaMensagem = new Mensagem();
//        novaMensagem.setTexto(msg);
//        novaMensagem.setDataHoraEnvio(LocalDateTime.now());
        mensagens[indiceMensagens++] = new Mensagem(texto, usuarioLogado);
//        indiceMensagens++;
//
    }

    private static void listarMensagem() {
        System.out.println("\n===== MENSAGENS USUARIO =====\n");
        int i = 0;
        while (mensagens[i] != null) {
            System.out.print(mensagens[i].getDescricao());
            System.out.println();
            i++;
        }
    }
}
