package ua.org.oa.ArtmSmk;
// task 3.

import java.util.ArrayList;

public class MakeCapitalLetters {
    public ArrayList<String> makeCapitalLetters(ArrayList<String> list) {
        ArrayList<String> changedList = new ArrayList<>();
        String string = list.toString().toUpperCase();
        changedList.add(string);
        return changedList;
    }
}

