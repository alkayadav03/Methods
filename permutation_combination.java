import java.util.Scanner;
public class permutation_combination{
    public static int fact(int x){
        int xfact=1;
        for(int i=1;i<=x;i++){
            xfact=xfact*i;
        }
        return xfact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ncr=fact(n)/(fact(r)*fact(n-r));
        int npr=fact(n)/(fact(n-r));
        System.out.println("permutation:"+npr);
         System.out.print("combination:"+ncr);
    }
}






















    }
}