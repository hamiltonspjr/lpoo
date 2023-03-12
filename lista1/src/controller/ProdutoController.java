package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto(2,"Iphone 14", "Novo iphone da apple", 7800, 100);
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());

        produto1.setId(1);
        produto1.setNome("Macbook Pro M1");
        produto1.setDescricao("Novo notebook apple");
        produto1.setValor(20.000);
        produto1.setEstoque(100);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());

        produto2.setNome("Iphone 14 Pro Max");
        produto2.setDescricao("Novo iphone 14 pro max com 1tb");
        produto2.setValor(10.000);
        produto2.setEstoque(50);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        Produto produto3 = new Produto(3, "Apple watch", "Apple watch ultra", 5000, 100);
        Produto produto4 = new Produto(4, "Ipad", "Ipad Pro M2", 8000, 100);
        Produto produto5 = new Produto(5, "PS5", "Novo console da playstation", 5000, 100);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        System.out.println(produtos);
        Produto produtoFind = produtos.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(produtoFind);
        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);

        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);
        System.out.println(produtosMap);
        System.out.println(produtosMap.get(3));
    }
}
