package br.com.tt.model;

public class Usuario {
    private final byte TAMANHO_MINIMO_NOME = 3;
    private Long id;
    private String nome;

    public void setNome(String novoNome) {
        if (novoNome.length() < TAMANHO_MINIMO_NOME) {
            System.out.println("Não foi possível alterar o nome");
            System.exit(1);  // so usar em CONSOLE!
        } else
            this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }
}
