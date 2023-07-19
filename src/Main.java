public class Main {

    public static void main(String[] args) {

        // создаем документ
        Document document = new Document();

        // ...

        // создаем точку входа для генерации отчетов
        ReportEntrypoint reportEntrypoint = new ReportEntrypoint();

        // генерируем XML отчет
        Report xmlReport = reportEntrypoint.create(document, "xml");

        // выводим результат
        System.out.println(new String(xmlReport.getData()));
    }

}