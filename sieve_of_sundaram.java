
import java.util.*;

public class sieve_of_sundaram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dim=(n-1)/2;
        boolean[] prime = new boolean[dim+1];
        for(int i=1;i<=dim;i++){
            prime[i] = false;
        }
        for(int i=1;i<=n;i++){
            if(i==2){
                System.out.print(2+" ");
            }
            for(int j=i;(long)i+j+2L*i*j<=dim;j++){
                prime[i+j+2*i*j] = true;
            }
        }
        for(int i=1;i<=dim;i++){
            
            
            if(prime[i]==false){
                System.out.print(2*i+1 +" ");
            }
        }
    }
    
}