package gitdemoprojectv1;
import java.util.Scanner;

public class arrayproblem {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		    Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    boolean prime[] = new boolean[n+1];
		    for(int i=0;i<n;i++) {
		    	prime[i]=true;
		    }
		    for(int i=2;i<n;i++) {
		    if(prime[i]==true) {
		    	System.out.print(i+ " ");
		    	for(int j = i*i;j<=n;j=j+i) {
		    		prime[j]=false;
		    	}
		    }
		   
			}
		    }
	}


