package Clasa_Convertoare;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.sql.DriverManager;

public class ConvertJavaToXML {
//    public static void main(String[] args) {
//        try {
//            Person person = new Person("John Doe", 30);
//
//            // Crearea contextului JAXB
//            JAXBContext context = JAXBContext.newInstance(Person.class);
//
//            // Crearea marshaller-ului
//            Marshaller marshaller = context.createMarshaller();
//
//            // Pentru formatarea output-ului
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//            // Conversia la XML
//            StringWriter writer = new StringWriter();
//            marshaller.marshal(person, writer);
//            String xmlOutput = writer.toString();
//
//            // Afișarea XML-ului
//            System.out.println(xmlOutput);
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//    }
}
