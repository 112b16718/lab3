import java.util.Scanner;
public class lab3jpa07 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);  
        while (true){
            System.out.println("Input:");
            int m=a.nextInt();    
            if(m!=999){
                int n=a.nextInt(),t=0;
                for (int i=1;i<=Math.min(m,n);i++){
                    if(m%i==0&&n%i==0){
                        t=i;
                    }
                }
                System.out.println(t);
            }
            else{
                break;
            }
        }
        a.close();
    }
}