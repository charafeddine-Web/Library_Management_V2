import java.util.ArrayList;
import java.util.List;

public class Library {

   private List<Book> books= new ArrayList<>();
   private  List<User> users= new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }
    public void addUser(User user) {
        users.add(user);
    }

    public void borrowBook(User user, String isbn) {
        boolean found = false;

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                found = true;

                if (book.isBorrowed()) {
                    System.out.println("Le livre est déjà emprunté.");
                    return;
                }

                book.setBorrowed(true);
                System.out.println("Le livre \"" + book.getTitle() + "\" a été emprunté par " + user.getName());
                return;
            }
        }

        if (!found) {
            System.out.println("Livre introuvable avec ISBN: " + isbn);
        }
    }

    public void returnBook(User user, String isbn) {

    }

}
