import java.util.Scanner;

public class Ex3{
    
    public static void main(String[] args){

      int maior, menor, soma=0;  
      int[] vetor;
      vetor = new int[100];
      Scanner scan; 
      scan = new Scanner(System.in); 
      System.out.println("Digite os lados: ");

        for(int i = 0; i < 100; i++){
            vetor[i] = scan.nextInt();
        }
        maior = vetor[0];
        menor = vetor[0];

        for(int i=0; i<100; i++){
            if(vetor[i]>maior){
                maior = vetor[i];
            }
            if(vetor[i]<menor){
                menor = vetor[i];
            }
        }
        for(int i=0; i<100; i++){
            soma = soma + vetor[i];
        }

        for (int i = 0; i < 100; i++){
            if (vetor[i] > vetor[i+1]){
                int temp = Numeros[i];
                Numeros[i] = Numeros[i+1];
                Numeros[i+1] = temp;
            }
        }    









        if(cont == 0){
             System.out.printf("equilatero");
        }
        else if(cont == 3){
            System.out.printf("isoceles");
        }
        else if(cont > 3){
            System.out.printf("escaleno");
        }
    }         
}