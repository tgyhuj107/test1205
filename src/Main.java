import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n=scn.nextInt();
//        float[] data=new float[n];
//        for (int i=0;i<n;i++){
//            data[i]=scn.nextFloat();
//        }
//        float m=scn.nextFloat(),sum=0;
//        for (int j=0;j<n;j++){
//            if (data[j]>=m){
//                sum+=data[j];
//            }
//        }
//        System.out.printf("%.2f",sum);
        //01
        //i am student
//        String str =scn.nextLine();
//        String str2="";
//        char[] t=new char[str.length()];
//        for (int i=0;i<str.length();i++){
//            t[i]=str.charAt(i);
//        }
//        char a=scn.next().charAt(0);
//        int b=0;
//        for (int j=0;j<str.length();j++){
//            if (t[j]==a){
//                b++;
//            }
//            if (b<=2){
//                System.out.print(t[j]);
//            }
//        }

        //02
        int n=scn.nextInt();
        int[] data=new int[n];
        for (int i=0;i<n;i++){
            data[i]=scn.nextInt();
        }
        for (int j =0;j<n;j++){
            for (int k=j+1;k<n;k++){
                if (data[j]>data[k]){
                    int a=data[j];
                    data[j]=data[k];
                    data[k]=a;
                }
            }
        }
        for (int b =0;b<n;b++){
            System.out.print(data[b]+" ");
        }
        System.out.println();






    }
}
