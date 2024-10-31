package mastertranslator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.BindingProvider;



import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MasterTranslatorApplication {
    private static final String WS_URL = "http://fy.webxml.com.cn/webservices/EnglishChinese.asmx?wsdl";

    public static void main(String[] args) {
        try {
            // 创建服务URL
            URL url = new URL(WS_URL);
            // 创建QName对象，指定服务名称和命名空间
            QName qname = new QName("http://WebXml.com.cn/", "EnglishChinese");

            // 使用上述信息创建Service对象
            Service service = Service.create(url, qname);

            // 获取服务接口的代理实例
            EnglishChineseSoap soap = service.getPort(EnglishChineseSoap.class);

            // 设置SOAP请求的超时时间
            BindingProvider bindingProvider = (BindingProvider) soap;
            Map<String, Object> requestContext = bindingProvider.getRequestContext();
            requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

            // 获取用户输入的单词
            System.out.println("master translator为您翻译：");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("请输入要翻译的单词: ");
            String wordKey = reader.readLine();

            TranslatorResponse.TranslatorResult result = soap.translator(wordKey);

            // 输出翻译结果
            if (result != null) {
                Object any = result.getAny();
                if (any instanceof Element) {
                    Element element = (Element) any;
                    NodeList transNodes = element.getElementsByTagName("Trans");
                    if (transNodes.getLength() > 0) {
                        Element transElement = (Element) transNodes.item(0);
                        NodeList translationNodes = transElement.getElementsByTagName("Translation");
                        if (translationNodes.getLength() > 0) {
                            Element translationElement = (Element) translationNodes.item(0);
                            String translation = translationElement.getTextContent();
                            System.out.println("Translation Result: " + translation);
                        } else {
                            System.out.println("No translation found in the response.");
                        }
                    } else {
                        System.out.println("No Trans element found in the response.");
                    }
                } else {
                    System.out.println("Unexpected type of any: " + any.getClass().getName());
                }
            } else {
                System.out.println("No translation result found.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
