import java.util.Scanner;

public class Ex2{
    
    public static void main(String[] args){

      int cont=0;  
      int[] vetor;
      vetor = new int[3];
      Scanner scan; 
      scan = new Scanner(System.in); 
      System.out.println("Digite os lados: ");

        for(int i = 0; i < 3; i++){
            vetor[i] = scan.nextInt();
        }
        for(int i=0; i<3; i++){
            for(int j = 1; j < 3; j++){
                if(vetor[i] != vetor[j]){
                    cont++;
                }
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