import java.util.Scanner;

public class Atv1{
    
    public static void main(String[] args){

      int[] primos, onze, pares, impares;
      primos = new int[2501];  
      onze = new int[2501];
      pares = new int[2501];
      impares = new int[2501];

      int div=0;
      Scanner scan; 
      
      for(int i=1; i<=2500; i++){
          if(i%11 == 5){
              onze[i] = i;
          }
      }
      for(int i=1; i<=2500; i++){
          if(i%2 == 0){
              pares[i] = i;
          }
          else{
              impares[i] = i;
          }
      }
        
       
            for(int i=2; i<=2500; i++){
                for(int j=1; j <= 2500; j++){
                    if(i%j == 0){
                        div++;
                    }
                }
                if(div == 2){
                        primos[i] = i;
                            
                } 
                div = 0;     
            }

        System.out.printf("divididos por 11 com resto 5: ");
        for(int i=1; i<=2500; i++){
            if(onze[i] > 0 ){
                System.out.printf("%d ", onze[i]);
            }   
        }
            System.out.printf("\n"); 

        System.out.printf("pares: ");
        for(int i=1; i<=2500; i++){
            if(pares[i] > 0 ){
                System.out.printf("%d ", pares[i]);
            }   
        }
            System.out.printf("\n"); 
            System.out.printf("impares: ");
        for(int i=1; i<=2500; i++){
            if(impares[i] > 0 ){
                System.out.printf("%d ", impares[i]);
            }   
        }
            System.out.printf("\n");
            System.out.printf("Primos: ");
        for(int i=1; i<2500; i++){
            if(primos[i] > 0 ){
                System.out.printf("%d ", primos[i]);
            }   
        }
            System.out.printf("\n");

    }
}