package com.dio;


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{

            Scanner myObj = new Scanner(System.in);

            System.out.print("Insira o nome do usuário: ");
            String userName = myObj.nextLine();

            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = myObj.nextLine();

            System.out.print("Por favor, digite o número da conta!: ");
            Integer account = myObj.nextInt();

            System.out.print("Saldo da conta: ");
            BigDecimal saldo = myObj.nextBigDecimal();

            System.out.printf("Olá "+ userName +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ account +" e seu saldo " + saldo + " já está disponível para saque\".");
        } catch (Exception e) {
            System.out.print("Algo deu errado!");
        }
    }
}
