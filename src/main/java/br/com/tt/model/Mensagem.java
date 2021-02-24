package br.com.tt.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/YYYY - HH:mm");
    private String texto;
    private Usuario origem;
//    private Usuario idUsuarioDestino;
    private LocalDateTime dataHoraEnvio;

    public Mensagem (String novoTexto, Usuario usuarioQueEscreveu) {
        if (novoTexto.length() < 5){
            System.err.println("Mensagem não deve ser menor que 5 caracteres.");
            System.exit(1);
        }

        this.texto = novoTexto;
        this.origem = usuarioQueEscreveu;
        dataHoraEnvio = LocalDateTime.now();

    }

//    public Usuario getOrigem() {
//        return origem;
//    }
//
//    public String getDataHoraEnvio() {
//        return dataHoraEnvio.format(FORMATTER);
//    }
//
//    public String getTexto() {
//        return texto;
//    }

    public String getDescricao() {
        return String.format("Mensagem: %s\nData: %s\nAutor: %s\n\n",
                texto, dataHoraEnvio.format(FORMATTER), origem.getNome());

    }
}
