package lab03;
import java.util.Scanner;
public class jpa06 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        while (true){
        System.out.println("Input:");
        int n1=a.nextInt(),n2=a.nextInt();
        if (n1==999){
            break;
        }
        System.out.println(Math.pow(n2,n1));
        
        }
        a.close();
}
}
