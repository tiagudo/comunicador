package br.com.tt.model;

import java.time.LocalDateTime;

public class Mensagem {
    private String texto;
//    private Usuario idUsuarioOrigem;
//    private Usuario idUsuarioDestino;
    private LocalDateTime dataHoraEnvio;

    public Mensagem (String novoTexto) {
        this.texto = novoTexto;
        dataHoraEnvio = LocalDateTime.now();
    }

    public void setDataHoraEnvio(LocalDateTime dataHoraEnvio) {
        this.dataHoraEnvio = dataHoraEnvio;
    }

    public LocalDateTime getDataHoraEnvio() {
        return dataHoraEnvio;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
