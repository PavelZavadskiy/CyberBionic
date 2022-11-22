public class WrongYearOfEmploymentException extends Exception {
    private String message;
    public WrongYearOfEmploymentException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
