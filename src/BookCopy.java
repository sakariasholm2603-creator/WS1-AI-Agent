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

    public boolean returnBook() {
        if (borrowed) {
            borrowed = false;
            return true;
        } else {
            return false;
        }
    }


    public boolean isBorrowed() {
        return borrowed;
    }
}
