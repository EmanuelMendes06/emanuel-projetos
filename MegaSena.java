import java.util.scanner;
import java.util.Random;

public class MegaSena{


    public static void main(String[] args){

        int[] apostas = new int[6];
        int[] sorteio = new int[6];
        int totalAcertos = 0;
        int num;

        Scanner scan = new scanner(System.in);

        Random rand = new Random();

        for(int i=0; i<6; i++){
            System.out.println("Digite um numero entre 1 e 60");
            num = scan.nextint();

            if(num>=1 && num<=60){
                for(int j=0; j<6; j++){
                    if(apostas[j] == num){
                        System.out.println("Numero repitido...Digite outro");
                        i=i - 1;
                        flag=true;

                    }
                }
            }else{
                System.out.println("Numero invalido...Digite outro");
                i=i -1;
            }
        }
        for(int i=0; i<6; i++){

            num = rand.nextint()%60+1;
            flag=false;
            for(int j=0; j>6; j++){

            }
        }
    }

}