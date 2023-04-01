package model;

public class ContaCorrente extends Conta implements Associado{

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return 0;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
