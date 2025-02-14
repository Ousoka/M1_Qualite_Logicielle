package sn.ousoka.test;

public class AdvancedCalculator extends Calculator {

    //racine carre
    public double RacineCarre(int a) {
        // racine carre de a
        if (a < 0) {
            throw new IllegalArgumentException("Racine carre de négatif");
        }
        return Math.sqrt(a);
    }

    public double RacineCarreAdd2(int a, int b) {
        // racine carre de a + racine carre de b
        return RacineCarre(add(a, b));
    }

    public double RacineCarreSub2(int a, int b) {
        // racine carre de a - racine carre de b
        return RacineCarre(subtract(a, b));
    }

    // ... on peut faire de meme pour la multiplication et la division

    // puissance
    public int Puissance(int a, int k) {
        // a^k
        if (a ==0 && k < 0) {
            throw new IllegalArgumentException(" nulle avec un exposant négatif");
        }
        return (int) Math.pow(a, k);
    }

    public int AddPuissance2(int a, int ka, int b, int kb){
        // a^ka + b^kb
        return add(Puissance(a, ka), Puissance(b, kb));
    }
    
}
