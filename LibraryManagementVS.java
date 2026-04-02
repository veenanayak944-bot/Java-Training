package student;
import java.util.Scanner;
class Book {
    int book_Id;
    String title;
    String author;
    boolean isIssued;
    Book(int book_Id, String title, String author) {
        this.book_Id = book_Id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    void display() {
        System.out.println(book_Id + " | " + title +  " | " + author + " | " + (isIssued ? "Issued" : "Available"));
    }
}
class Library {
    Book books[] = new Book[20];
    int count = 0;
    void addBook(int id, String title, String author) {
        if (count < books.length) {
            books[count] = new Book(id, title, author);
            count++;
            System.out.println("Book added successfully");
        } else {
            System.out.println("Library is full");
        }
    }
    void displayBooks() {
        System.out.println("ID | Title | Author | Status");
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
    void issueBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].book_Id == id && !books[i].isIssued) {
                books[i].isIssued = true;
                System.out.println("Book issued");
                return;
            }
        }
        System.out.println("Book not available");
    }
    void returnBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].book_Id == id && books[i].isIssued) {
                books[i].isIssued = false;
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Invalid return");
    }
}
public class LibraryManagementVS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice;
        do {
            System.out.println("\n1.Add Book\n2.Display Books\n3.Issue Book\n4.Return Book\n5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(id, title, author);
                    break;
 
                case 2:
                    lib.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    lib.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}