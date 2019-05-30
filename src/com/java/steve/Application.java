package com.java.steve;


import com.java.steve.dbservice.misc.XMLDocumentHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application {
    static public final String AUTHOR = "Lev Leibov";
    static public final String VERSION = "0.0.0";
    String ALLOWED_DOMAIN_NAMES = "^([a-zA-Z0-9]+\\.)+(com|org|de|gov)$";

    String OP_GROUP = "^(SELECT|DELETE)";
    String FLD_GROUP = "([*a-zA-z, ]+)";
    String SPACE = "([\\s]+)";
    String FROM_GROUP = "(FROM)";
    String TBL_GROUP = "([a-zA-Z]+)$";

    int PORT =6701;

    String DATA_DIR = "/data";

    public static Map<String, Enum> applications = new HashMap<>();

    public static void main(String[] args) {
        //String currentName = "version";
        //ACommand command = CommandRegistry.INSTANCE.getCommand(currentName);
        //command.execute();
        //ProfileView view = new ProfileView();
        try {
            startApplications();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void startApplications() {
        try {
            Utils.readXMLDocument("main/config.xml", new XMLDocumentHandler() {
                @Override
                public void handleDocument(Document document) {
                    try {
                        NodeList apps = document.getElementsByTagName("application");
                        for (int i = 0, len = apps.getLength(); i < len; i++) {
                            Element el = (Element) (apps.item(i));
                            Class cls = Class.forName(el.getAttribute("class"));
                            Enum appInstance = Enum.valueOf(cls, "INSTANCE");
                            applications.put(el.getAttribute("name"), appInstance);
                            int port = Integer.valueOf(el.getAttribute("port"));
                            cls.getDeclaredMethod("start", int.class).invoke(appInstance, port);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

}

