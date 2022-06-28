import core.data.*;

public class EuroForex {
    public static void main(String[] args) {
        DataSource ds = DataSource.connectAs("csv", "http://www.ecb.europa.eu/stats/eurofxref/eurofxref.zip?8020793e8e76c164724bd267c730ad4c");
        ds.load();

        double euro_usd = ds.fetchDouble("USD");
        System.out.println("Euro-to-Dollar rate: " + euro_usd);

        String[] keys = ds.fieldNames();  // includes "Date"
        for (String k : keys) {
            if (k.length() == 3) {
                System.out.println(k + ": " + ds.fetchDouble(k));
            }
        }
    }
}