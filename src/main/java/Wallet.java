import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<iScan> Scan;

    public Wallet(String name) {
        this.name = name;
        this.Scan = new ArrayList<iScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.Scan.size();
    }

    public void addItem(iScan item) {
        this.Scan.add(item);
    }

}
