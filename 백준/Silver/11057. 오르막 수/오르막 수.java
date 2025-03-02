import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = 0;
        
        int[][] dp = new int[N+1][10];
        
        if(N == 1){
            System.out.println(10);
            return;
        }
        
        for(int j = 0; j<=9; j++){
            dp[1][j] = 1;
        }
        
        for(int i = 2; i <= N; i++){
            dp[i][0] = 1;
            for(int j = 1; j <= 9; j++){
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%10007;
            }
        }
        
        for(int j = 0; j<=9; j++){
            result = (result + dp[N][j]) % 10007;
        }
        System.out.println(result);
    }
}