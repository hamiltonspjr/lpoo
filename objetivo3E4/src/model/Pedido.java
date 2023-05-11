package model;

import java.util.Calendar;
import java.util.Date;

public class Pedido {
    private int numero;
    private Calendar data;
    private double valor;
    Vendedor vendedor;

    public Pedido() {
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
