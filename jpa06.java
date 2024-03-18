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
        int t=1;
        while (n2!=0){
            t*=n1;
            n2--;
        }
        System.out.println(t);
        
        }
        a.close();
}
}
