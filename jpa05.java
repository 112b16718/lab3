package lab03;
import java.util.Scanner;
public class jpa05 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.print("Please enter one value:");
            int n1=n.nextInt();
            if (1<=n1&&n1<=10){
                int t=1;
                for (int x=1;x<=n1;x++){
                    t*=x;
                }
                System.out.println(n1+"!:"+t);
            }
            else{
                System.out.println("Error enter value is out of range.");
            }
        }
        n.close();
    }
    
}
