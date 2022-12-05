public class LoyaltyCard implements iScan{
    private String barCode;
    private String vendor;

    public LoyaltyCard(String barCode, String vendor) {
        this.barCode = barCode;
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }

//    @Override
    public String Scan() {
        return this.barCode;
    }
}
