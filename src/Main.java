import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        float[] data=new float[n];
        for (int i=0;i<n;i++){
            data[i]=scn.nextFloat();
        }
        float m=scn.nextFloat(),sum=0;
        for (int j=0;j<n;j++){
            if (data[j]>=m){
                sum+=data[j];
            }
        }
        System.out.printf("%.2f",sum);
        //01

    }
}
