import java.util.HashMap;
import java.util.Map;

public class ReportEntrypoint {

    private Map<String, ReportStrategy> strategies = new HashMap<>();

    public ReportEntrypoint() {
        strategies.put("pdf", new PdfReport());
        strategies.put("json", new JsonReport());
        strategies.put("xml", new XmlReport());
    }

    public Report create(Document document, String reportType) {
        ReportStrategy strategy = strategies.get(reportType);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported report type: " + reportType);
        }

        byte[] data = strategy.generate(document);
        return new Report(data);
    }

}
