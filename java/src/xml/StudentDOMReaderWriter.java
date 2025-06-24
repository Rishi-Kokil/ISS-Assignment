package xml;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class StudentDOMReaderWriter {

    public static void main(String[] args) throws Exception {
        // Read XML
        File xmlFile = new File("students.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);

        NodeList studentList = doc.getElementsByTagName("student");
        System.out.println("Reading existing students:");
        for (int i = 0; i < studentList.getLength(); i++) {
            Node node = studentList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element student = (Element) node;
                String id = student.getElementsByTagName("id").item(0).getTextContent();
                String name = student.getElementsByTagName("name").item(0).getTextContent();
                String department = student.getElementsByTagName("department").item(0).getTextContent();
                System.out.println(id + " | " + name + " | " + department);
            }
        }

        // Add new student
        Element root = doc.getDocumentElement();
        Element newStudent = doc.createElement("student");

        Element id = doc.createElement("id");
        id.appendChild(doc.createTextNode("3"));

        Element name = doc.createElement("name");
        name.appendChild(doc.createTextNode("Ankit Sharma"));

        Element dept = doc.createElement("department");
        dept.appendChild(doc.createTextNode("Electronics"));

        newStudent.appendChild(id);
        newStudent.appendChild(name);
        newStudent.appendChild(dept);

        root.appendChild(newStudent);

        // Write back to XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("students_updated.xml"));
        transformer.transform(source, result);

        System.out.println("\nNew student added and saved to students_updated.xml");
    }
}
