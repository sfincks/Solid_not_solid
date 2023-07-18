public class Main {
    public class ReportEntrypoint {

        public Report create(Document document, String reportType) {
            throw new UnsupportedOperationException();
        }

    }
    /**
     *  1. Создаётся документ
     *  2. Пользователь принимает решение о выборе расширения
     *  3. Файл конвертируется в нужное расширение
     *  3.1. Выбранное расширение подставляется в конвертер
     *  4. Файл передаётся в отчёт
     */
    public static void main(String[] args) {
        Document document = new Document("123");
        ReportEntrypoint reportEntrypoint = new ReportEntrypoint();

    }
}