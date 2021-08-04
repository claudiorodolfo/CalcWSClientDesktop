
package wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculadora", targetNamespace = "http://calc.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculadora {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "adicao", targetNamespace = "http://calc.ws/", className = "wsclient.Adicao")
    @ResponseWrapper(localName = "adicaoResponse", targetNamespace = "http://calc.ws/", className = "wsclient.AdicaoResponse")
    @Action(input = "http://calc.ws/Calculadora/adicaoRequest", output = "http://calc.ws/Calculadora/adicaoResponse")
    public int adicao(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtracao", targetNamespace = "http://calc.ws/", className = "wsclient.Subtracao")
    @ResponseWrapper(localName = "subtracaoResponse", targetNamespace = "http://calc.ws/", className = "wsclient.SubtracaoResponse")
    @Action(input = "http://calc.ws/Calculadora/subtracaoRequest", output = "http://calc.ws/Calculadora/subtracaoResponse")
    public int subtracao(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicacao", targetNamespace = "http://calc.ws/", className = "wsclient.Multiplicacao")
    @ResponseWrapper(localName = "multiplicacaoResponse", targetNamespace = "http://calc.ws/", className = "wsclient.MultiplicacaoResponse")
    @Action(input = "http://calc.ws/Calculadora/multiplicacaoRequest", output = "http://calc.ws/Calculadora/multiplicacaoResponse")
    public int multiplicacao(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divisao", targetNamespace = "http://calc.ws/", className = "wsclient.Divisao")
    @ResponseWrapper(localName = "divisaoResponse", targetNamespace = "http://calc.ws/", className = "wsclient.DivisaoResponse")
    @Action(input = "http://calc.ws/Calculadora/divisaoRequest", output = "http://calc.ws/Calculadora/divisaoResponse")
    public float divisao(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}