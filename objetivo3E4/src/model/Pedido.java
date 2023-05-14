package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer numero;
    private Calendar data;
    private Double valor;
    private Vendedor vendedor;
    private List<Item> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Integer numero, Calendar data, Double valor, Vendedor vendedor, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", itens=" + itens +
                '}';
    }
}
