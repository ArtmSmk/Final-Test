package ua.org.oa.ArtmSmk;

// task 1.
public class MaxNumber {
    public int maxNumber(int[] array) {
        int result = array [0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > result)
                result = array[i];

        return result;
    }
}
