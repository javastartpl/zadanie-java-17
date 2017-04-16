import java.util.Random;

public class MultiArray {
    private int[][] tab;

    public MultiArray(int n, int m) {
        tab = new int[n][m];
        randomize();
    }

    public void randomize() {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(100); //liczby od 0-100
            }
        }
    }

    public int findMin() {
        int min = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if(tab[i][j] < min)
                    min = tab[i][j];
            }
        }
        return min;
    }

    public int findMax() {
        int max = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if(tab[i][j] > max)
                    max = tab[i][j];
            }
        }
        return max;
    }

    public void print() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " "); //elementy obok siebie
            }
            System.out.println(); //kolejny wiersz
        }
    }
}
