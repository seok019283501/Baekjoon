import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int T = sc.nextInt();
        
        int[] num = new int[T];
        for(int i = 0; i < T; i++){
            num[i] = sc.nextInt();
        }
        
        sc.close();  
        
        int[] dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for(int i = 4; i <= N; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        
        for(int i = 0; i < T; i++){
            System.out.println(dp[num[i]]);
        }
        
    }
}