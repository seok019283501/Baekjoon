import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = 1;
        int B = 1;
        while(true){
            A = sc.nextInt();
            B = sc.nextInt();
            if(A == 0 && B == 0){
                sc.close();
                break;
            }
            System.out.println(A+B);
        }
    }
}