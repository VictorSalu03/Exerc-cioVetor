package Programa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        for(int i=0; i< 5; i++){
            System.out.println("Digite um número a variável A:" + (i+1));
            A[i] = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite um número a variável B:" + (i+1));
            B[i] = ler.nextInt();
            ler.nextLine();
        }
        int[] C = new int[5];
        System.out.println("***********");
        
        for(int i=0; i < 5; i++){
         System.out.println("Soma dos vetores:");
         C[i] = A[i] + B[i];
         System.out.println("-->" + C[i]);
        }

        ler.close();


    }
    
    
}
