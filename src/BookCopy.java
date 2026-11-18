public class BookCopy {
    private boolean borrowed;

    public BookCopy() {
        borrowed = false;
    }

    public boolean borrow() {
        if (borrowed) {
            return false;
        } else {
            borrowed = true;
            return true;
        }
    }

    public void returnBook() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }
}
