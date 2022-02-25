import java.util.*;

public class N2 {
    public static void main(String[] args) {
        int r,h;//r=rayon             h=hauteur
        double v,pi=3.14; //v=volume
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez le rayon d'un cône");
        r=sc.nextInt();
        System.out.println("Entrez le hauteur d'un cône");
        h=sc.nextInt();
        v=(pi*r*r*h)/3;
        System.out.println("le Volume du cône est:"+v);
    }
}
