package ua.org.oa.ArtmSmk;

// task 4.
public class Sum {
    public int sum() {
        int[] array = {1, 3, 55, 6, 7, 8, 23, 11, 55, 33, 22, 4, 5, 7, 8, 9, 12};
        int sum = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
