package silnia;

public class Silnia {
    public long silnia(int liczba) {
        long silnia = 1;
        for (int i = liczba; i > 1; i--) {
            silnia *= i;
        }
        return silnia;
    }
}


