package ua.org.oa.ArtmSmk;

// task 8.
abstract class Book {
    String title;

    abstract void setTitle(String s);

    public String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    public void setTitle(String title) {
        this.title = "The title is: " + title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
