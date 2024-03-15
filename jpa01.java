package lab03;
import java.util.Scanner;
public class jpa01 {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner n=new Scanner(System.in);
        int n1 = n.nextInt();
        int total = 0;
        for (int i=1;i <= n1;i++){
            total+=i;
        }
        System.out.println("1+2+3+...+"+n1+"="+total);
        n.close();
    }    
}
