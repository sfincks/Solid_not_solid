public class Main {

    public static void main(String[] args) {

        // ������� ��������
        Document document = new Document();

        // ...

        // ������� ����� ����� ��� ��������� �������
        ReportEntrypoint reportEntrypoint = new ReportEntrypoint();

        // ���������� XML �����
        Report xmlReport = reportEntrypoint.create(document, "xml");

        // ������� ���������
        System.out.println(new String(xmlReport.getData()));
    }

}