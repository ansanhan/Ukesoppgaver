public class Uke34Oppg2 {
    public static int min(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom");
        int m = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[m])
                m = i;
        }
        return m;
    }
}
