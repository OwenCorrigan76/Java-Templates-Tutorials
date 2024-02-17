package interfaces;

// any class that implements an interface must inherit its methods
// or must declare itself an abstract class.
// ***NB*** A class can only extend one other class; but it can implement
// multiple interfaces. This is how to achieve multiple inheritance ***NB***.

public class Book implements Product, /*and*/ DigitalFile {

    // create the field name
    private String name;
    private String author;
    private int pages;
    private String isbn;
    private String id;

    // fix inherited getter and setter so it uses name
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // from DigitalFile interface
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
