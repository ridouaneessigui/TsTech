import java.util.*;

public class NbPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saiasir un nombre");
        int n=sc.nextInt();
        System.out.println("les nombres pairs de 0 à "+n+"sont:");
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }


    }
}
