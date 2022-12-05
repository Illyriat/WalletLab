public class DebitCard extends BankingCards{

    private int sortCode;
    private int accountNumber;


    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;

    }

//    public String getCardNumber() {
//        return this.cardNumber;
//    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

//    public String getExpiryDate() {
//        return this.expiryDate;
//    }
//
//    public int getSecurityNumber() {
//        return this.securityNumber;
//    }

//    @Override
    public String Scan() {
        return "Payment Complete";
    }
}
