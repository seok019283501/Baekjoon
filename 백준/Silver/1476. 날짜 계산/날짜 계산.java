import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int answer = 0;
        int E = 0;
        int S = 0;
        int M = 0;
        Scanner sc = new Scanner(System.in);
        String[] q = sc.nextLine().split(" ");
        int e = Integer.parseInt(q[0]);
        int s = Integer.parseInt(q[1]);
        int m = Integer.parseInt(q[2]);
        
        while(true){
            answer++;
            E++;
            S++;
            M++;
            if(E > 15) E = 1;
            if(S > 28) S = 1;
            if(M > 19) M = 1;
            if(E == e && S == s && M == m) break;
        }
        System.out.println(answer);
    }
}