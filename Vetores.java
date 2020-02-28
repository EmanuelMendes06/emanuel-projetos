public class Vetores{

   public static void main(String args[]){
       
       //isso é a declaração de um vetor de inteiros
       int[] vetor;
       //isso é a criação do espaço para armazenar 10 inteiros
       vetor = new int[10];
       //código para percorrer um vetor
       for(int i=0;i<10;i++){
           vetor[i] = i+1;
       }
       for(int i=0;i<10;i++){
           //aqui estamos utilizando concatenação de Strings e variável
           System.out.println("vetor["+i+"]="+vetor[i]);
       }
   }
}
