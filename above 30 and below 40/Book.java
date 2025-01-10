/*
34. Create a class named Book with instance variables title and price. 
Add a method named setVar to pass parameters for title and price. 
Add another method named showVar to display values of these variables. 
Now in main(), declare 4 objects of Book and display the records of books that start with “Java”.
*/

class Book {
    private String title;
    private double price;

    // Method to set the values of title and price
    public void setVar(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Method to display the values of title and price
    public void showVar() {
        System.out.println("Book[title=" + title + ", price=" + price + "]");
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        // Array of 4 Book objects
        Book[] books = new Book[4];

        // Initializing the books
        books[0] = new Book();
        books[0].setVar("Java Programming", 450.0);

        books[1] = new Book();
        books[1].setVar("Python Essentials", 550.0);

        books[2] = new Book();
        books[2].setVar("Java in Depth", 650.0);

        books[3] = new Book();
        books[3].setVar("C++ Basics", 300.0);

        // Displaying books that start with "Java"
        System.out.println("\nBooks that start with 'Java':");
        for (Book book : books) {
            if (book.getTitle().startsWith("Java")) {
                book.showVar();
            }
        }
    }
}
