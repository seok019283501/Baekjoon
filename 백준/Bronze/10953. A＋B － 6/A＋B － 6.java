import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            String[] S = sc.next().split(",");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            System.out.println(A+B);
        }
        sc.close();
        
    }
}