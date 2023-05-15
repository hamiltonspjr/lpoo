package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private Integer cnpj;
    private String contato;
    private String nome;

    private List<Produto> produtos = new ArrayList<>();

    public Fornecedor() {
    }

    public Fornecedor(Integer cnpj, String contato, String nome, List<Produto> produtos) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produtos = produtos;
    }

    public Fornecedor(Integer cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "\nFornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
