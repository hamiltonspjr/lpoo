package model;

import java.util.Calendar;
import java.util.Date;

public class Pedido {
    private Integer numero;
    private Calendar data;
    private Double valor;
    Vendedor vendedor;

    public Pedido() {
    }

    public Pedido(Integer numero, Calendar data, Double valor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }

    public Pedido(Integer numero, Calendar data, Double valor, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
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

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
