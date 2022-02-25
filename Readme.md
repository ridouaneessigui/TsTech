# Question 1
``` JAVA
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

```
# Question 2 
``` JAVA
        int r,h;//r=rayon             h=hauteur
        double v,pi=3.14; //v=volume
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez le rayon d'un cône");
        r=sc.nextInt();
        System.out.println("Entrez le hauteur d'un cône");
        h=sc.nextInt();
        v=(pi*r*r*h)/3;
        System.out.println("le Volume du cône est:"+v);
```

# Question 3
``` HTML
<div style="text-align: center;">
         <h1>Test Technique question N°3</h1>
         <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quo iusto nisi amet quos iure fugiat! Fugit, ducimus dolorum earum animi id eveniet itaque, facere non beatae tempore quis labore neque!</p>
    </div>
```

# Question 4

### Quelles sont les causes possibles du problème ? 

Cette adresse IP commençant par 169.254 c'est en fait la classe des lier des adresses locales qui sont utilisés pour faire communiquer le PC au sein d'un réseau local et non pour communiquer avec le routeur et le monde extérieur.

### Comment réagissez-vous à ces différents cas ?

Reconfigurez l'adresse IP
netsh int ip reset reset.log
ipconfig / release
ipconfig / renouveler
Réinitialiser l'adresse IP et le masque de sous-réseau
configurer manuellement le réseau 192.168.21.35/16