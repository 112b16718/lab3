package lab03;
import java.util.Scanner;
public class jpa04 {
    public static void main(String[] args) {
        double t=0;
        int i=0,count=0;
        Scanner n=new Scanner(System.in);
        while (i!=-1){
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            int n1=n.nextInt();
            if (n1!=-1){
                t+=n1;
                count+=1;
            }
            i=n1;
        }
        System.out.printf("餐點總費用:%.1f",t);
        System.out.printf("\n%d 到餐點平均費用為:  %.2f",count,(t/(count)));
        n.close();

    }    
}
