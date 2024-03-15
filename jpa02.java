package lab03;

public class jpa02 {
    public static void main(String[] args) {
        int c=0;
        for (int i=0;i<9;i++){
            c+=1;
            for (int x=1; x<=2;x++){
                c+=1;
            }
        }
        System.out.println("count = "+c);
    }
}
