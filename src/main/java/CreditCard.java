public class CreditCard extends BankingCards implements iScan{


    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

//    public String getCardNumber() {
//        return this.cardNumber;
//    }
//
//    public String getExpiryDate() {
//        return this.expiryDate;
//    }
//
//    public int getSecurityNumber() {
//        return this.securityNumber;
//    }

//    @Override
    public String Scan() {
        return "Payment Successful";
    }
}
