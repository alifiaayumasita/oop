package net.kxyz;

   import java.io.File;
   import java.io.IOException;
   import java.util.ArrayList;
   import java.util.List;
   import javax.xml.parsers.DocumentBuilder;
   import javax.xml.parsers.DocumentBuilderFactory;
   import javax.xml.parsers.ParserConfigurationException;
   import org.w3c.dom.Document;
   import org.w3c.dom.Element;
   import org.w3c.dom.Node;
   import org.w3c.dom.NodeList;
   import org.xml.sax.SAXException;

   /**
    *
    * @author kuman
    */
   public class ReadXMLFile {

    File fXmlFile = new File("/baza.xml");

    public ArrayList<Book> getBook() {
    return book;
    }
    ArrayList<Book> book = new ArrayList<>() ;
public void Read() {
    try {
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
Document doc = dBuilder.parse(fXmlFile);


doc.getDocumentElement().normalize();

System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

NodeList nList = doc.getElementsByTagName("book");

for (int temp = 0; temp < nList.getLength(); temp++) {

    Node nNode = nList.item(temp);

    System.out.println("\nReading node :" + nNode.getNodeName());
            Book tempBook = new Book();
    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

        Element eElement = (Element) nNode;

                tempBook.setId(eElement.getAttribute("id"));
                tempBook.setTitle(eElement.getElementsByTagName("title").item(0).getTextContent());
                tempBook.setAuthor(eElement.getElementsByTagName("author").item(0).getTextContent());
                tempBook.setYear(eElement.getElementsByTagName("year").item(0).getTextContent());
                tempBook.setState(Boolean.valueOf(eElement.getElementsByTagName("state").item(0).getTextContent()));
                System.out.println("TEMP : " + temp);
                System.out.println("id : " + tempBook.getId());
                System.out.println("title : " + tempBook.getTitle());
                System.out.println("author : " + tempBook.getAuthor());
                System.out.println("year : " + tempBook.getYear());
                System.out.println("state : " + tempBook.isState());

                book.add(temp, tempBook);

    }
}

      } catch (ParserConfigurationException | SAXException | IOException e) {
e.printStackTrace();
       }
     }
   }