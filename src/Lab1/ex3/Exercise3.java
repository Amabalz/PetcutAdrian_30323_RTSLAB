package Lab1.ex3;
import java.util.Random;
public class Exercise3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, aux;
        int[] arr = new int [10];
        for(i = 0; i < 10; i++){
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(i = 0; i < 9; i++){
            for(j = 0; j < 9 - i; j++){
                if(arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        for(i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
