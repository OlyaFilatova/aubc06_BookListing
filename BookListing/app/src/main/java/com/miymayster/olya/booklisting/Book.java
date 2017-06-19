package com.miymayster.olya.booklisting;

        import java.util.ArrayList;

/**
 * Created by Olga on 19.06.2017.
 */

public class Book {
    // list of authors that worked on the book
    private ArrayList<String> mAuthors;
    // title of the book
    private String mTitle;

    public Book(ArrayList<String> author, String title) {
        mAuthors = author;
        mTitle = title;
    }

    public ArrayList<String> getAuthors() {
        return (ArrayList<String>) mAuthors.clone();
    }

    public String getTitle() {
        return mTitle;
    }
}
