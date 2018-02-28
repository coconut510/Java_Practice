package iros.gsb.sample;

import iros.gsb.constant.UserType;
import iros.gsb.constant.WebSvcType;
import iros.gsb.sbe.api.IntegrationClientAPI;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;

/**
 * ?��?��비스(SOAP, REST) ?���? Example
 * @author Administrator
 *
 */
public class TESTWEBSVC {

	public static void main(String[] args) throws Exception{
		IntegrationClientAPI api = new IntegrationClientAPI("C:\\workspace\\Java_Practice\\BusAPI\\src\\esbclient.properties");
		String filename = "";
	
		// ?�� ?��비스 ?��?��?�� ?��증처리�?? ?��?��.
		System.out.println("---------------------------------------------");
		api.auth(UserType.USER);

		// ?�� ?��비스 ?��?��?���? ?��?�� ?��비스 ?��증키�? ?��?��?��?��.		
		String madesskey = api.makeSessionKey();

		// ?�� ?��비스 ?��?��?���? ?��?�� ?��비스 ?��증키(session key)�? 발행?�� ?�� ?���? ?��버에 ?��록한?��.
		api.sendSessionKey(madesskey);
		
		System.out.println("===========================[Session Key Result]===========================");
		System.out.println("[INFO] made SessionKey : " + madesskey);	
		System.out.println();
		

		/*--------------------------------------------------------------------*/
		// REST ?��?��비스 ?���? POST		
		/*--------------------------------------------------------------------*/
		WebSvcType wstype = WebSvcType.REST; // REST Type
		String URI = "http://localhost:21/iros_eaptl_websvc/customerservice/customerservice/customers"; // URI?�� ?��?��?��?��.
		String reqStr = "<Customer><name>567</name></Customer>";	// Request Message�? ?��?��?��?��.

		// REST ?�� 경우?��?�� Message Header�? ?��?��?��?��.
		// SOAP ?�� 경우?��?�� SOAP 메시�??�� Message Header�? ?��?��?��?��.
		Map headerCnt = api.setHeaderCnt("serviceKey", "requestTime", "callbackURI", "reqMsgID");

		// REST ?�� ?��비스�? ?��출한?��.
		String retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// 반환값을 출력?��?��.
		System.out.println("===========================[REST POST Request Result]===========================");
		System.out.println(retval);
		
		/*---------------------------------------------------------------------*/
		// REST ?��?��비스 ?���? GET		
		/*---------------------------------------------------------------------*/
		wstype = WebSvcType.REST; // REST Type
		URI = "http://localhost:8080/iros_eaptl_websvc/customerservice/customerservice/customers/123"; // URI?�� ?��?��?��?��.
		reqStr = null;	// GET 메소?��?�� Request Message�? ?��?��?��?��.

		// REST ?�� 경우?��?�� Message Header�? ?��?��?��?��.
		// SOAP ?�� 경우?��?�� SOAP 메시�??�� Message Header�? ?��?��?��?��.
		headerCnt = api.setHeaderCnt("serviceKey", "requestTime", "callbackURI", "reqMsgID");

		// REST ?�� ?��비스�? ?��출한?��.
		retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// 반환값을 출력?��?��.
		System.out.println("===========================[REST GET Request Result]===========================");
		System.out.println(retval);
		System.out.println();
		
		

		/*---------------------------------------------------------------------*/
		// SOAP ?��?��비스 ?���? 		
		/*---------------------------------------------------------------------*/
		wstype = WebSvcType.SOAP; // SOAP Type
		URI = "http://192.168.0.50:8092/PersonService/"; // URI?�� ?��?��?��?��.
		filename = "request.xml"; // SOAP 메시�??�� 직접 SOAP ?���? 메시�?�? ?��?��?��?�� ?��.
		reqStr = FileUtils.readFileToString(new File(filename)); // xml ?��?��?�� String?���? �??��?��?��.

		// SOAP ?�� 경우?��?�� SOAP 메시�??�� Message Header�? ?��?��?���?�? headerCnt �? null �? ?��?��?��?��.
		headerCnt = null;

		// REST ?�� ?��비스�? ?��출한?��.
		retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// 반환값을 출력?��?��.
		System.out.println("===========================[SOAP Request Result]===========================");
		System.out.println(retval);	
		
	}
}


