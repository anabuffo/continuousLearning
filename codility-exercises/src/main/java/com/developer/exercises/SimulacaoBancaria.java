package com.developer.exercises;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double saldo = 0.0;
            boolean continuar = true;

            while (continuar) {
                System.out.println("Digite a opção desejada: [1] Deposito | [2] Saque | [3] Saldo | [O] Encerrar: ");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Quanto deseja depositar?");
                        double deposito = scanner.nextDouble();
                        saldo = saldo + deposito;
                        System.out.println("Saldo atual:" + saldo);
                        break;
                    case 2:
                        System.out.println("Quanto deseja sacar?");
                        double saque = scanner.nextDouble();
                        if (saque <= saldo) {
                            saldo = saldo - saque;
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                        System.out.println("Saldo atual:" + saldo);
                        break;
                    case 3:
                        System.out.println("Seu saldo atual é de R$" + saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.print("Algo deu errado!");
        }
    }
}
