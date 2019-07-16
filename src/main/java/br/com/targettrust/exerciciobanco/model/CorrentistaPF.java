package br.com.targettrust.exerciciobanco.model;

public class CorrentistaPF extends Correntista {

    private String tipoDocumento;

    public CorrentistaPF(String nome, Conta conta, String tipoDocumento) {
        super(nome, conta);
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String obtemDescricao() {
        String descricaoClassePai = super.obtemDescricao();
        return String.format("%s, Tipo Documento: %s",
                descricaoClassePai,
                this.tipoDocumento);
    }

}
