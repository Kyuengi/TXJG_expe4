
package mastertranslator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnglishChineseHttpPost", targetNamespace = "http://WebXml.com.cn/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnglishChineseHttpPost {


    /**
     * <br /><h3>中英文双向翻译 DataSet</h3><p>输入参数：wordKey = 单词； 返回数据：DataSet。（包括全部数据三个DataTable）</p><br />
     * 
     * @param wordKey
     * @return
     *     returns mastertranslator.DataSet
     */
    @WebMethod(operationName = "Translator")
    @WebResult(name = "DataSet", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public DataSet translator(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "wordKey")
        String wordKey);

    /**
     * <br /><h3>中英文双向翻译（基本）String()</h3><p>输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。</p><br />
     * 
     * @param wordKey
     * @return
     *     returns mastertranslator.ArrayOfString
     */
    @WebMethod(operationName = "TranslatorString")
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString translatorString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "wordKey")
        String wordKey);

    /**
     * <br /><h3>中英文双向翻译（相关词条）String()</h3><p>输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。</p><br />
     * 
     * @param wordKey
     * @return
     *     returns mastertranslator.ArrayOfString
     */
    @WebMethod(operationName = "TranslatorReferString")
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString translatorReferString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "wordKey")
        String wordKey);

    /**
     * <br /><h3>中英文双向翻译（例句）String()</h3><p>输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。</p><br />
     * 
     * @param wordKey
     * @return
     *     returns mastertranslator.ArrayOfString
     */
    @WebMethod(operationName = "TranslatorSentenceString")
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString translatorSentenceString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "wordKey")
        String wordKey);

    /**
     * <br /><h3>获得候选词</h3><p>输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。</p><br />
     * 
     * @param wordKey
     * @return
     *     returns mastertranslator.ArrayOfString
     */
    @WebMethod(operationName = "SuggestWord")
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString suggestWord(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "wordKey")
        String wordKey);

    /**
     * <br /><h3>获得朗读MP3字节流</h3><p>输入参数：Mp3 = Mp3名称； 返回数据：字节数组 Byte[]。</p><br />
     * 
     * @param mp3
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "GetMp3")
    @WebResult(name = "base64Binary", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public byte[] getMp3(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Mp3")
        String mp3);

}
