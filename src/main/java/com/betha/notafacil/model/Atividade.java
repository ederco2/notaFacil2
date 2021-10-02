package com.betha.notafacil.model;

public class Atividade {

    private Integer id;
    private String descricao;
    private Integer CNAE;
    private Double aliquota;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCNAE() {
        return CNAE;
    }

    public void setCNAE(Integer CNAE) {
        this.CNAE = CNAE;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }
}
