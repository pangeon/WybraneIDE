
package wybraneide;

public class Mathematic {
    double dodaj(double d, double e) {
        double wynik = d + e;
        return wynik;
    }
    double odejmij(double d, double e) {
        double wynik = d - e;
        return wynik;
    }
    double pomnoz(double d, double e) {
        double wynik = d * e;
        return wynik;
    }
    double podziel(double d, double e) {
        if (e != 0) {
            double wynik = d / e;
            return wynik;
        } else {
            System.out.println("Niedozwolona operacja !");
        }
        return 0;      
    }
    
}
