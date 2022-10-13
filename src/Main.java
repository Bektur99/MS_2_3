public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);


        while (true){
            if (bankAccount.getAmount() == LimitException.getRemainingAmount()){
                try {
                    bankAccount.withDraw(LimitException.getRemainingAmount());
                } catch (LimitException e) {
                    throw new RuntimeException(e);
                }
                break;
            }

            try {
                bankAccount.withDraw(6000.0);
                bankAccount.getAmount();
            } catch (LimitException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}