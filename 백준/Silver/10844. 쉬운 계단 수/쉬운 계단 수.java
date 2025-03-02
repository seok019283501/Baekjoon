import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N+1][10];
        dp[1][0] = 0;
        int result = 0;
        
        if(N == 1){
            System.out.println(9);
            return;
        }
        
        for(int i = 1; i <= 9; i++){
            dp[1][i] = 1;
        }
        
        for(int i = 2; i <= N; i++){
            dp[i][0] = dp[i-1][1]%1000000000;
            dp[i][9] = dp[i-1][8]%1000000000;
            for(int j = 1; j <=8; j++){
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
            }
        }
        
        for(int j = 0; j <= 9; j++){
            result = (result + dp[N][j]) % 1000000000;
        }
        
        System.out.println(result);
    }
}