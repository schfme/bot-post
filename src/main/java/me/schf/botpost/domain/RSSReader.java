package me.schf.botpost.domain;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@Component
public class RssReader {

	public List<RssEntry> read(String urlString) throws ParserConfigurationException, SAXException, IOException {

		URL url = new URL(urlString);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document doc = builder.parse(url.openStream());
		doc.getDocumentElement().normalize();

		NodeList itemList = doc.getElementsByTagName("item");

		return IntStream.range(0, itemList.getLength()).mapToObj(itemList::item)
				.filter(item -> Node.ELEMENT_NODE == item.getNodeType()).map(this::toRssEntry).toList();

	}
    
    private RssEntry toRssEntry(Node itemNode) {
    	return new RssEntry.Builder()
    			.author(null)
    			.description(null)
    			.pubDate(null)
    			.title(null)
    			.link(null)
    			.build();
    			
    }

    private static String getElementValue(Element parent, String tagName) {
        NodeList nodeList = parent.getElementsByTagName(tagName);
        if (nodeList.getLength() == 0) {
            return "";
        }
        Node node = nodeList.item(0);
        if (node == null) {
            return "";
        }
        return node.getTextContent();
    }
}
