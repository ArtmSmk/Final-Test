package ua.org.oa.ArtmSmk;
// task 9
public class MyException extends Exception {
    public MyException(int n, int p){
        if (n==0 || p == 0){
            System.out.println("n and p should not be equal to zero");
        } else if (n<0 || p<0){
            System.out.println("n and p should not be negative");
        }
    }
}

