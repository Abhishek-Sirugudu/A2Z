import java.util.*;

class Array{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        


        s.close();
    }
}