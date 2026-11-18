public class Main {
    public static void main(String[] args) {
        BookCopy book = new BookCopy();
        System.out.println("Udlaant ved start: " + book.isBorrowed());

        System.out.println("Foerste udlaan lykkes: " + book.borrow());
        System.out.println("Udlaant efter foerste udlaan: " + book.isBorrowed());

        System.out.println("Andet udlaan lykkes: " + book.borrow());
        System.out.println("Udlaant efter andet forsoeg: " + book.isBorrowed());

        book.returnBook();
        System.out.println("Udlaant efter aflevering: " + book.isBorrowed());

        System.out.println("Nyt udlaan lykkes: " + book.borrow());
        System.out.println("Udlaant efter nyt udlaan: " + book.isBorrowed());
    }
}
