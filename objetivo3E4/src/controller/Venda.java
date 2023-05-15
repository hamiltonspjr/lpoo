package controller;

import model.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Venda {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor(124, "53999999999", "Guanabara");
        Vendedor vendedor1 = new Vendedor(1, "Geraldo", "Rua teste, número 8", "Centro", "99999478", "Pelotas", "RS", "Supermercado");

        Produto produto1 = new Produto(1, "Monster", 10, 8.65, fornecedor1);
        Produto produto2 = new Produto(2, "Refrigerante", 20, 7.50, fornecedor1);

        Item item1 = new Item(1, 3.125, 5, produto1);
        Item item2 = new Item(2, 1.125, 10, produto2);
        Item item3 = new Item(1, 3.125, 5, produto1);
        Item item4 = new Item(2, 1.125, 10, produto2);

        List<Item> itens1 = new ArrayList<>();
        itens1.add(item1);
        itens1.add(item2);

        List<Item> itens2 = new ArrayList<>();
        itens2.add(item3);
        itens2.add(item4);

        if (produto1.getQuantidade() >= item1.getQuantidade() + item3.getQuantidade() && produto2.getQuantidade() >= item2.getQuantidade() + item4.getQuantidade()) {
            Pedido pedido1 = new Pedido(1, new GregorianCalendar(2024, 5, 14, 22, 01), ((itens1.get(0).getQuantidade() * itens1.get(0).getProduto().getPreco()) - itens1.get(0).getDesconto()) + ((itens1.get(1).getQuantidade() * itens1.get(1).getProduto().getPreco()) - itens1.get(1).getDesconto()), vendedor1, itens1);
            Pedido pedido2 = new Pedido(2, new GregorianCalendar(2024, 5, 14, 22, 8), ((itens2.get(0).getQuantidade() * itens2.get(0).getProduto().getPreco()) - itens2.get(0).getDesconto()) + ((itens2.get(1).getQuantidade() * itens2.get(1).getProduto().getPreco()) - itens2.get(1).getDesconto()), vendedor1, itens2);

            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(pedido1);
            pedidos.add(pedido2);
            System.out.println("Vendas:\n");
            System.out.println(pedidos);

            // baixando o estoque com base na quantidade de produtos vendida
            pedido1.getItens().get(0).getProduto().setQuantidade(pedido1.getItens().get(0).getProduto().getQuantidade() - pedido1.getItens().get(0).getQuantidade());
            pedido1.getItens().get(1).getProduto().setQuantidade(pedido1.getItens().get(1).getProduto().getQuantidade() - pedido1.getItens().get(1).getQuantidade());

            pedido2.getItens().get(0).getProduto().setQuantidade(pedido2.getItens().get(0).getProduto().getQuantidade() - pedido2.getItens().get(0).getQuantidade());
            pedido2.getItens().get(1).getProduto().setQuantidade(pedido2.getItens().get(1).getProduto().getQuantidade() - pedido2.getItens().get(1).getQuantidade());

            List<Produto> produtos = new ArrayList<>();
            produtos.add(produto1);
            produtos.add(produto2);

            System.out.println("\nEstoque de cada produto:\n");
            produtos.forEach(produto -> {
                System.out.println(produto.getNome() + " tem no estoque um total de: " + produto.getQuantidade() + " unidades!");
            });

            produto1.setQuantidade(produto1.getQuantidade() + 10);
            Fornecimento fornecimento1 = new Fornecimento(new GregorianCalendar(2024, 5, 15, 14, 34), produto1.getPreco() * 10, fornecedor1, produto1);

            produto2.setQuantidade(produto2.getQuantidade() + 20);
            Fornecimento fornecimento2 = new Fornecimento(new GregorianCalendar(2024, 5, 15, 14, 39), produto2.getPreco() * 20, fornecedor1, produto2);

            List<Fornecimento> fornecimentos = new ArrayList<>();
            fornecimentos.add(fornecimento1);
            fornecimentos.add(fornecimento2);
            System.out.println("Fornecimentos:\n");
            System.out.println(fornecimentos);
            double totalFornecido = 0.0;
            for (Fornecimento fornecimento : fornecimentos) {
                totalFornecido += fornecimento.getValorTotal();
            }
            System.out.println("\nTotal gasto no fornecimento:");
            System.out.println(totalFornecido);
        } else getError();
    }

    private static void getError() {
        myThrowException();
    }
    private static void myThrowException () {
        try {
            System.out.println("\nOperação inválida, estoque insuficiente.\n");
            throw new EstoqueException();
        } catch (EstoqueException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Executou...\n");
        }
    }

    static class EstoqueException extends Exception {
        public EstoqueException() {
            super("\nOperação inválida, estoque insuficiente.\n");
        }
    }
}

