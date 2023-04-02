package model;

public abstract class Conta {
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }
    public void saca(double valor) {
        double newSaldo = this.saldo - valor;
        if(newSaldo >= 0) {
            this.saldo -= valor;
        } else {
            System.out.println("Não foi possível fazer esse saque!");
        }
    }
    public void atualiza(double taxa) {
        if(taxa > 0) {
            this.saldo += this.saldo * (taxa/100);
        } else {
            System.out.println("A taxa deve ser maior que zero\n");
        }
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                '}';
    }
}
