public class LimitException extends Exception{

    private  static Double remainingAmount;

    public static Double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
}

