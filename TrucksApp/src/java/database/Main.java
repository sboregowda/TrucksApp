package database;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws Exception {
        
        customerToMySQL();
//        locationToMySQL();
//        employeeToMySQL();
//        truckToMySQL();
//        expenseToMySQL();
//        orderToMySQL();
//        paymentToMySQL();
//        priceToMySQL();
//        transactionToMySQL();
//        itemToMySQL();
//        invoiceToMySQL();
//        commentToMySQL();
        
        
    }


    
    public static void commentToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/comment.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/comment",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO comments(commentID, commentDateTime, comment, locationID, customerID, transactionID, truckID) VALUES(?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("comment");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "commentDateTime"),
                                getTextContent(node, "comment"),
                                getTextContent(node, "locationID"),
                                getTextContent(node, "customerID"),
                                getTextContent(node, "transactionID"),
                                getTextContent(node, "truckID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
            }
            System.out.println("Data Inserted for Comments");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    
    public static void customerToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/customer.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/customer",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO customers(customerID, customerName, state, billingAddress, city, postalCode, country, "
                            + "phoneNumber, faxNumber, emailAddress, companyName, contactName, date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("customer");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "state"),
                                getTextContent(node, "customerName"),
                                getTextContent(node, "billingAddress"),
                                getTextContent(node, "city"),
                                getTextContent(node, "postalCode"),
                                getTextContent(node, "country"),
                                getTextContent(node, "phoneNumber"),
                                getTextContent(node, "faxNumber"),
                                getTextContent(node, "emailAddress"),
                                getTextContent(node, "companyName"),
                                getTextContent(node, "contactName"),
                                getTextContent(node, "date"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
            }
            System.out.println("Data Inserted for Customers");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void employeeToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/employee.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/employee",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO employees(employeeID, firstName, lastName, email, extension, homePhone, cellPhone, "
                            + "jobTitle, SSN, dirverLicenseNo, address, city, state,"
                            + " postalCode, birthDate, dateHired, salary, notes) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "firstName"),
                                getTextContent(node, "lastName"),
                                getTextContent(node, "email"),
                                getTextContent(node, "extension"),
                                getTextContent(node, "homePhone"),
                                getTextContent(node, "cellPhone"),
                                getTextContent(node, "jobTitle"),
                                getTextContent(node, "SSN"),
                                getTextContent(node, "dirverLicenseNo"),
                                getTextContent(node, "address"),
                                getTextContent(node, "city"),
                                getTextContent(node, "state"),
                                getTextContent(node, "postalCode"),
                                getTextContent(node, "birthDate"),
                                getTextContent(node, "dateHired"),
                                getTextContent(node, "salary"),
                                getTextContent(node, "notes"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
            }System.out.println("Data Inserted for Employees");
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void expenseToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/expense.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/expense",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO expenses(expenseID, expenseType, expenseCategory, amount, description, "
                            + "datePurchased, dateSubmitted, advanceAmount, paymentMethod, employeeID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("expense");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "expenseType"),
                                getTextContent(node, "expenseCategory"),
                                getTextContent(node, "amount"),
                                getTextContent(node, "description"),
                                getTextContent(node, "datePurchased"),
                                getTextContent(node, "dateSubmitted"),
                                getTextContent(node, "advanceAmount"),
                                getTextContent(node, "paymentMethod"),
                                getTextContent(node, "employeeID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
            }
            System.out.println("Data Inserted for Expenses");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void invoiceToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/invoice.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/invoice",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO invoices(invoiceID, orderID, itemID, priceID) VALUES(?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("invoice");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "invoiceID"),
                                getTextContent(node, "orderID"),
                                getTextContent(node, "itemID"),
                                getTextContent(node, "priceID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
                
            }
            System.out.println("Data Inserted for Prices");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void itemToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/item.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/item",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO item(itemID, itemName, itemDescription, quantity, price, "
                            + "transactionID) VALUES(?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("item");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "itemName"),
                                getTextContent(node, "itemDescription"),
                                getTextContent(node, "quantity"),
                                getTextContent(node, "price"),
                                getTextContent(node, "transactionID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
                
            }
            System.out.println("Data Inserted for Prices");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void locationToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/location.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/location",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO locations(locationID, locationName, locationCode, addressStreet1, addressStreet2, city, state, "
                            + "postalCode, locationPhone, locationFaxNumber, locationEmailAddress, customerID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("location");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "locationName"),
                                getTextContent(node, "locationCode"),
                                getTextContent(node, "addressStreet1"),
                                getTextContent(node, "addressStreet2"),
                                getTextContent(node, "city"),
                                getTextContent(node, "state"),
                                getTextContent(node, "postalCode"),
                                getTextContent(node, "locationPhone"),
                                getTextContent(node, "locationFaxNumber"),
                                getTextContent(node, "locationEmailAddress"),
                                getTextContent(node, "customerID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
                
            }
            System.out.println("Data Inserted for Locations");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void orderToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/order.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/order",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO orders(orderID, orderDate, isSpecial, PONumber, orderTotalAmount, "
                            + "truckID, employeeID, customerID) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("order");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "orderDate"),
                                getTextContent(node, "isSpecial"),
                                getTextContent(node, "PONumber"),
                                getTextContent(node, "orderTotalAmount"),
                                getTextContent(node, "truckID"),
                                getTextContent(node, "employeeID"),
                                getTextContent(node, "customerID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
                
            }
            System.out.println("Data Inserted for Orders");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void paymentToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/payment.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/payment",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO payments(paymentID, paymentAmount, paymentDate, checkNumber, creditCardID, "
                            + "creditCardNumber, cardholderName, creditCardExpDate, creditCardAuthNumber, orderID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("payment");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "paymentAmount"),
                                getTextContent(node, "paymentDate"),
                                getTextContent(node, "checkNumber"),
                                getTextContent(node, "creditCardID"),
                                getTextContent(node, "creditCardNumber"),
                                getTextContent(node, "cardholderName"),
                                getTextContent(node, "creditCardExpDate"),
                                getTextContent(node, "creditCardAuthNumber"),
                                getTextContent(node, "orderID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
                
            }
            System.out.println("Data Inserted for Payments");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void priceToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/price.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/price",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO prices(priceID, locationIDFrom, locationIDTo, price, locationCodeFrom, "
                            + "locationCodeTo, locationID, customerID) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("price");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "locationIDFrom"),
                                getTextContent(node, "locationIDTo"),
                                getTextContent(node, "price1"),
                                getTextContent(node, "locationCodeFrom"),
                                getTextContent(node, "locationCodeTo"),
                                getTextContent(node, "locationID"),
                                getTextContent(node, "customerID"));
                for (int n = 0; n < columns.size(); n++) {
                     System.out.println(columns.get(0));
                     stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
           }
            System.out.println("Data Inserted for Prices");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void transactionToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/transaction.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/transaction",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO transactions(transactionID, transactionDate, transactionDescription, transactionAmount, discount, "
                            + "unitPrice, quantity, orderID, priceID, truckID, employeeID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("transaction");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "transactionDate"),
                                getTextContent(node, "transactionDescription"),
                                getTextContent(node, "transactionAmount"),
                                getTextContent(node, "discount"),
                                getTextContent(node, "unitPrice"),
                                getTextContent(node, "quantity"),
                                getTextContent(node, "orderID"),
                                getTextContent(node, "priceID"),
                                getTextContent(node, "truckID"),
                                getTextContent(node, "employeeID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
                
            }
            System.out.println("Data Inserted for Prices");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    public static void truckToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {
        File fXmlFile = new File("xml/truck.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/truck",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO trucks(truckID, VIN, makeYear, model, licensePlateNumber, "
                            + "color, cost, employeeID) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("truck");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "VIN"),
                                getTextContent(node, "makeYear"),
                                getTextContent(node, "model"),
                                getTextContent(node, "licensePlateNumber"),
                                getTextContent(node, "color"),
                                getTextContent(node, "cost"),
                                getTextContent(node, "employeeID"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
            }
                    System.out.println("Data Inserted for Trucks");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }

    static private String getAttrValue(Node node, String attrName) {
        if (!node.hasAttributes()) {
            return "";
        }
        NamedNodeMap nmap = node.getAttributes();
        if (nmap == null) {
            return "";
        }
        Node n = nmap.getNamedItem(attrName);
        if (n == null) {
            return "";
        }
        return n.getNodeValue();
    }

    static private String getTextContent(Node parentNode, String childName) {
        NodeList nlist = parentNode.getChildNodes();
        for (int i = 0; i < nlist.getLength(); i++) {
            Node n = nlist.item(i);
            String name = n.getNodeName();
            if (name != null && name.equals(childName)) {
                return n.getTextContent();
            }
        }
        return "";
    }

    public static Connection getConnection() throws Exception {

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/trucks_database";
            String username = "root";
            String password = "shabby123";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            //System.out.println("Connection Established");

            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
    /*    public static void createTable() {
        try {

            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS testtable(id int NOT NULL AUTO_INCREMENT,"
                    + "first varchar(255), last varchar(255), PRIMARY KEY(id))");
            create.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Table Created");
        }
    }
    
    

    public static void insertIntoDB(){
        
        try{
            Connection con = getConnection();
            PreparedStatement stmt = con
    .prepareStatement("INSERT INTO testtable(\n" +
              "id, firstname, lastname\n" +
                  "VALUES(?, ?, ?)");
            
        }catch(Exception e){
            
        }finally{
            System.out.println("Data inserted");
        }
    }
    
    
    
    static void selectRecordsFromTable() throws SQLException, Exception {

        Connection con = getConnection();
        PreparedStatement select = con.prepareStatement("SELECT id, first, last FROM testtable");

        try {

            ResultSet rs = select.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String firstName = rs.getString("first");
                String lastName = rs.getString("last");

                System.out.println("userid : " + id);
                System.out.println("firstname : " + firstName);
                System.out.println("lastname : " + lastName);
                System.out.println("------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            if (select != null) {
                select.close();
            }

            if (con != null) {
                con.close();
            }

        }
    }
    

    public static void testToMySQL() throws SAXException, ParserConfigurationException, IOException, Exception {

        File fXmlFile = new File("xml/test.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        Connection con = getConnection();

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            Object res = xpath.evaluate("xml/test",
                    doc,
                    XPathConstants.NODESET);

            PreparedStatement stmt = con
                    .prepareStatement("INSERT INTO testtable(id, first, last) VALUES(?, ?, ?)");

            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("user");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                List<String> columns = Arrays
                        .asList(getAttrValue(node, "id"),
                                getTextContent(node, "firstname"),
                                getTextContent(node, "lastname"));
                for (int n = 0; n < columns.size(); n++) {
                    stmt.setString(n + 1, columns.get(n));
                }
                stmt.execute();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    
    */
    
}
