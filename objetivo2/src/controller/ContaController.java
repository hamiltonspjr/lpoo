package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {
        // a
        ContaCorrente contaC1 = new ContaCorrente(1000, 100, 100);
        ContaCorrente contaC2 = new ContaCorrente(1500, 400,200);
        ContaCorrente contaC3 = new ContaCorrente(2000, 600, 300);
        System.out.println("Contas Corrente:\n");
        System.out.println(contaC1);
        System.out.println(contaC2);
        System.out.println(contaC3);

        ContaPoupanca contaP1 = new ContaPoupanca(2000);
        ContaPoupanca contaP2 = new ContaPoupanca(2500);
        ContaPoupanca contaP3 = new ContaPoupanca(3000);
        System.out.println("Contas Poupança:\n");
        System.out.println(contaP1);
        System.out.println(contaP2);
        System.out.println(contaP3);

        //f
        Cliente cliente1 = new Cliente("Lara", 300, 400);
        Cliente cliente2 = new Cliente("Luiz", 600,600);
        Cliente cliente3 = new Cliente("Lopes", 600,600);
        System.out.println("Clientes:\n");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        //b

        List<Conta> contas = new ArrayList<>();
        contas.add(contaC1);
        contas.add(contaC2);
        contas.add(contaC3);
        contas.add(contaP1);
        contas.add(contaP2);
        contas.add(contaP3);
        System.out.println("Contas:\n");
        System.out.println(contas);

        List<Associado> associados = new ArrayList<>();
        associados.add(cliente1);
        associados.add(cliente2);
        associados.add(cliente3);
        associados.add(contaC1);
        associados.add(contaC2);
        associados.add(contaC3);
        System.out.println("Associados:\n");
        System.out.println(associados);

        //c
        contaP1.deposita(1000);
        contaP1.atualiza(5);
        contaP1.saca(50.00);

        //d
        contaC3.deposita(500);
        contaC3.saca(400);

        // f
        associados.sort(Comparator.comparing(Associado::getQuantidadeCotas).reversed());
        System.out.println("\nassociados ordenados reverso:");
        System.out.println(associados);
        Associado maiorQuantidadeDeCotas = Collections.max(associados, Comparator.comparing(Associado::getQuantidadeCotas));
        System.out.println("\nassociados com maior número de cotas:");
        associados.forEach(a -> {
            if(a.getQuantidadeCotas() == maiorQuantidadeDeCotas.getQuantidadeCotas()) {
                System.out.print(a);
            }
        });

        //g
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\ncontas ordenadas:");
        System.out.println(contas);
        System.out.println("\nAssociados que possuem contas cadastradas no sistema:");
        associados.forEach(a -> {
            if(a instanceof ContaCorrente) {
                System.out.println(a);
            }
        });

        Conta maiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        System.out.println("\ncontas com maior saldo bancário:");
        contas.forEach(c -> {
            if(c.getSaldo() == maiorSaldo.getSaldo()) {
                System.out.println(c);
            }
        });

    }
}
