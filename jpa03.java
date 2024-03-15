package lab03;

public class jpa03 {
    public static void main(String[] args) {
        System.out.print("1~1000中的完美數有:");
        for (int i=1;i<=1000;i++){
            int t=0;
            for (int x=1;x<i;x++){
                if (i%x==0){
                    t+=x;
                }
                }
            if (t==i){
                System.out.printf(" "+i);    
            }
        }
    }
}
