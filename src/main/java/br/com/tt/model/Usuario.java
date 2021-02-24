package br.com.tt.model;

public class Usuario {
    private final byte TAMANHO_MINIMO_NOME = 3;
    private Long id;
    private String nome;

    public Usuario(String novoNome) {
        alteraNome(novoNome);
    }

    private void alteraNome(String novoNome) {

        if (novoNome.length() < TAMANHO_MINIMO_NOME) {
            System.err.println("Não foi possível alterar o nome");
            System.exit(1);  // so usar em CONSOLE!
        }

        this.nome = novoNome;

    }

    public String getNome() {
        return nome;
    }
}
