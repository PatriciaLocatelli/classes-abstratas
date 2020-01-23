package teste;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Teste1 {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<>();

        lista.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
        lista.add(new ContaEmpresarial(1002, "Maria", 1000.00, 400.0));
        lista.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
        lista.add(new ContaEmpresarial(1005, "Ana", 500.00, 500.00));

        double sum = 0.0;

        for(Conta c : lista){
            sum+= c.getSaldo();
        }
        System.out.printf("Total Conta: %.2f%n", sum);

        for(Conta c : lista){
            c.deposito(10.0);
        }
        for(Conta c : lista){
            System.out.printf("Total Conta: %d : %.2f%n", c.getNumero(), c.getSaldo());
        }

    }
}
