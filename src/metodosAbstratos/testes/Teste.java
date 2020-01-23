package metodosAbstratos.testes;

import metodosAbstratos.entities.Circulo;
import metodosAbstratos.entities.Cores;
import metodosAbstratos.entities.Forma;
import metodosAbstratos.entities.Retangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Forma> lista = new ArrayList<>();

        System.out.println("Entre o numero de formas ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Formula " + i + " dados:");
            System.out.println("Retangulo ou Circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Cores (Preto, azul, vermelho)");
            Cores cores = Cores.valueOf(sc.next());

            if (ch == 'r') {
                System.out.println("Altura: ");
                double altura = sc.nextDouble();

                System.out.println("Largura: ");
                double largura = sc.nextDouble();
                lista.add(new Retangulo(cores, largura, altura));
            } else if (ch == 'c') {
                System.out.println("Raio: ");
                Double raio = sc.nextDouble();
                lista.add(new Circulo(cores, raio));

            } else {
                System.out.println("Código inválido");
            }
        }
        System.out.println();
        System.out.println("Forma areas");
        for (Forma f : lista){
            System.out.println(String.format("%.2f", f.area()));
        }

            sc.close();
    }
}
