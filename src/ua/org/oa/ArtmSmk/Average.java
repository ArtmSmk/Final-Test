package ua.org.oa.ArtmSmk;

// task 2.
public class Average {
    public double average(int[] array) {
        double average = 0;
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        average = sum / array.length;
        return average;
    }
}
