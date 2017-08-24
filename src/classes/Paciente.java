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
public class Paciente {
    private String nome;
    private String dataNascimento;
    private String rg;

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", rg=" + rg + '}';
    }

    public Paciente(String nome, String dataNascimento, String rg){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public static Paciente Cadastrar(){
        return new Paciente("1", "1", "1");
    }
}

