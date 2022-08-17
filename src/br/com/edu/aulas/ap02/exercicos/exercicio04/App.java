package br.com.edu.aulas.ap02.exercicos.exercicio04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorFinalCompra = 0;
        System.out.print("Peso total da compra em gramas: ");
        int pesoDaCompra = sc.nextInt();

        if(pesoDaCompra >= 0 && pesoDaCompra < 1000){
            valorFinalCompra = pesoDaCompra * 3.5f / 100;
        }else if(pesoDaCompra > 0 && pesoDaCompra >= 1000){
            valorFinalCompra = pesoDaCompra * 3.0f / 100;
        }else{
            throw new ArithmeticException("O valor final da compra não pode ser negativo");
        }

        System.out.print("O Valor total a pagar é: " + valorFinalCompra);


    }
}
