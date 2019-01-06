package silnia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n;
        Silnia silnia = new Silnia();
        System.out.println("Obliczanie silni dla dowolnej liczby całkowitej.");
        System.out.println("Podaj n:");
        n = Integer.parseInt(br.readLine());
        for (i = 1; i <= n; i++)
        {
            System.out.println(" " + i + "! = " + silnia.silnia(i));
        }
    }
}
