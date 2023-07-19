public class Main {

    public static void main(String[] args) {

        // ñîçäàåì äîêóìåíò
        Document document = new Document();

        // ...

        // ñîçäàåì òî÷êó âõîäà äëÿ ãåíåðàöèè îò÷åòîâ
        ReportEntrypoint reportEntrypoint = new ReportEntrypoint();

        // ãåíåðèðóåì XML îò÷åò
        Report xmlReport = reportEntrypoint.create(document, "xml");

        // âûâîäèì ðåçóëüòàò
        System.out.println(new String(xmlReport.getData()));
    }
   
}
