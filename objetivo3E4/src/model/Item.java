package model;

public class Item {
    private Integer codItem;
    private Double desconto;
    private Integer quantidade;
    private Produto produto;

    public Item() {
    }

    public Item(Integer codItem, Double desconto, Integer quantidade, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
