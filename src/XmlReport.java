public class XmlReport implements ReportStrategy {

    @Override
    public byte[] generate(Document document){

        // ��������� xml
        String xml ="<document>" + document + "</document>";

        return xml.getBytes();

    }

}

