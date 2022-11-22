public class NoneProductsInTheShopException extends Throwable {
    private String message;
    public NoneProductsInTheShopException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
