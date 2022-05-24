class Book{
    private String title;
    private int pages;

    // get method for title
    public String getTitle() {
        return title;
    }

    // set method for title
    public void setTitle(String title) {
        this.title = title;
    }
}

class TextBook extends Book {
    private String author;

    // get method for author
    public String getAuthor() {
        return author;
    }

    // set method for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

public class DemoBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("Head First JAVA");
        System.out.println("Title of the book is " + b1.getTitle());

        TextBook t1 = new TextBook();
        t1.setTitle("Refrence book java");
        t1.setAuthor("A B C");
        System.out.println("Title of the book is " + t1.getTitle());
        System.out.println("Author of the book is " + t1.getAuthor());
    }
}
