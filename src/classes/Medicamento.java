/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Roger
 */
public class Medicamento {
    private String codigo;
    private String nome;
    private String descricao;

    @Override
    public String toString() {
        return "Medicamento{" + "codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + '}';
    }

    public Medicamento(String codigo, String nome, String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
