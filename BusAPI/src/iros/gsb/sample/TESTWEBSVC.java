package iros.gsb.sample;

import iros.gsb.constant.UserType;
import iros.gsb.constant.WebSvcType;
import iros.gsb.sbe.api.IntegrationClientAPI;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;

/**
 * ?Ή?λΉμ€(SOAP, REST) ?ΈμΆ? Example
 * @author Administrator
 *
 */
public class TESTWEBSVC {

	public static void main(String[] args) throws Exception{
		IntegrationClientAPI api = new IntegrationClientAPI("C:\\workspace\\Java_Practice\\BusAPI\\src\\esbclient.properties");
		String filename = "";
	
		// ?Ή ?λΉμ€ ??©? ?Έμ¦μ²λ¦¬λ?? ??€.
		System.out.println("---------------------------------------------");
		api.auth(UserType.USER);

		// ?Ή ?λΉμ€ ??©?λ₯? ?? ?λΉμ€ ?Έμ¦ν€κ°? ??±??€.		
		String madesskey = api.makeSessionKey();

		// ?Ή ?λΉμ€ ??©?λ₯? ?? ?λΉμ€ ?Έμ¦ν€(session key)λ₯? λ°ν? ? ?Έμ¦? ?λ²μ ?±λ‘ν?€.
		api.sendSessionKey(madesskey);
		
		System.out.println("===========================[Session Key Result]===========================");
		System.out.println("[INFO] made SessionKey : " + madesskey);	
		System.out.println();
		

		/*--------------------------------------------------------------------*/
		// REST ?Ή?λΉμ€ ?ΈμΆ? POST		
		/*--------------------------------------------------------------------*/
		WebSvcType wstype = WebSvcType.REST; // REST Type
		String URI = "http://localhost:21/iros_eaptl_websvc/customerservice/customerservice/customers"; // URI? ?€? ??€.
		String reqStr = "<Customer><name>567</name></Customer>";	// Request Messageλ₯? ?€? ??€.

		// REST ?Ό κ²½μ°?? Message Headerλ₯? ?€? ??€.
		// SOAP ?Ό κ²½μ°?? SOAP λ©μμ§?? Message Headerλ₯? ??±??€.
		Map headerCnt = api.setHeaderCnt("serviceKey", "requestTime", "callbackURI", "reqMsgID");

		// REST ?Ή ?λΉμ€λ₯? ?ΈμΆν?€.
		String retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// λ°νκ°μ μΆλ ₯??€.
		System.out.println("===========================[REST POST Request Result]===========================");
		System.out.println(retval);
		
		/*---------------------------------------------------------------------*/
		// REST ?Ή?λΉμ€ ?ΈμΆ? GET		
		/*---------------------------------------------------------------------*/
		wstype = WebSvcType.REST; // REST Type
		URI = "http://localhost:8080/iros_eaptl_websvc/customerservice/customerservice/customers/123"; // URI? ?€? ??€.
		reqStr = null;	// GET λ©μ?? Request Messageκ°? ????€.

		// REST ?Ό κ²½μ°?? Message Headerλ₯? ?€? ??€.
		// SOAP ?Ό κ²½μ°?? SOAP λ©μμ§?? Message Headerλ₯? ??±??€.
		headerCnt = api.setHeaderCnt("serviceKey", "requestTime", "callbackURI", "reqMsgID");

		// REST ?Ή ?λΉμ€λ₯? ?ΈμΆν?€.
		retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// λ°νκ°μ μΆλ ₯??€.
		System.out.println("===========================[REST GET Request Result]===========================");
		System.out.println(retval);
		System.out.println();
		
		

		/*---------------------------------------------------------------------*/
		// SOAP ?Ή?λΉμ€ ?ΈμΆ? 		
		/*---------------------------------------------------------------------*/
		wstype = WebSvcType.SOAP; // SOAP Type
		URI = "http://192.168.0.50:8092/PersonService/"; // URI? ?€? ??€.
		filename = "request.xml"; // SOAP λ©μμ§?? μ§μ  SOAP ?μ²? λ©μμ§?λ₯? ??±?΄?Ό ?¨.
		reqStr = FileUtils.readFileToString(new File(filename)); // xml ??Ό? String?Όλ‘? λ³????€.

		// SOAP ?Ό κ²½μ°?? SOAP λ©μμ§?? Message Headerλ₯? ??±?λ―?λ‘? headerCnt λ₯? null λ‘? ?€? ??€.
		headerCnt = null;

		// REST ?Ή ?λΉμ€λ₯? ?ΈμΆν?€.
		retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// λ°νκ°μ μΆλ ₯??€.
		System.out.println("===========================[SOAP Request Result]===========================");
		System.out.println(retval);	
		
	}
}


