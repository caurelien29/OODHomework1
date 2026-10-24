/**
 * Holds raw string data received from an external CSV file row.
 *
 * @author Cooper Aurelien
 */
public class ExternalCSVRow {
    private String rawData;

    /**
     * Constructs ExternalCSVRow with a raw string line.
     *
     * @param rawData raw comma-separated line
     */
    public ExternalCSVRow(String rawData) {
        this.rawData = rawData;
    }

    /**
     * Retrieves the raw string data of the CSV row.
     *
     * @return raw string line
     */
    public String getRawData() {
        return rawData;
    }
}