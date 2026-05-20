import java.util.ArrayList;
import java.util.Scanner;

abstract class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    abstract void borrowBook(String book);

    void calculateFee() {
        System.out.println("Fee = 2000");
    }

    void calculateGrade() {

        if (marks >= 80)
            System.out.println("Grade = A");

        else if (marks >= 60)
            System.out.println("Grade = B");

        else
            System.out.println("Grade = C");
    }
}

interface Library {
    void showBorrowedBooks();
}

class LibraryStudent extends Student implements Library {

    ArrayList<String> borrowedBooks = new ArrayList<>();

    LibraryStudent(String name, int marks) {
        super(name, marks);
    }

    @Override
    void borrowBook(String book) {
        borrowedBooks.add(book);
    }

    @Override
    public void showBorrowedBooks() {
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}

class lab {

    static ArrayList<String> getLibraryBooks() {

        ArrayList<String> books = new ArrayList<>();

        books.add("Java");
        books.add("C");
        books.add("Python");

        return books;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> libraryBooks = getLibraryBooks();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        LibraryStudent s1 = new LibraryStudent(name, marks);

        System.out.println("Library Books: " + libraryBooks);

        System.out.print("Enter book to borrow: ");
        String book = sc.nextLine();

        if (libraryBooks.contains(book)) {

            libraryBooks.remove(book);

            s1.borrowBook(book);

            System.out.println("Book borrowed successfully.");
        }

        else {
            System.out.println("Book not available.");
        }

        System.out.println("\nStudent Name: " + name);

        s1.calculateFee();
        s1.calculateGrade();
        s1.showBorrowedBooks();

        sc.close();
    }
}