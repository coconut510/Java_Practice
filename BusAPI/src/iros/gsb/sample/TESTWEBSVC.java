package iros.gsb.sample;

import iros.gsb.constant.UserType;
import iros.gsb.constant.WebSvcType;
import iros.gsb.sbe.api.IntegrationClientAPI;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;

/**
 * ?›¹?„œë¹„ìŠ¤(SOAP, REST) ?˜¸ì¶? Example
 * @author Administrator
 *
 */
public class TESTWEBSVC {

	public static void main(String[] args) throws Exception{
		IntegrationClientAPI api = new IntegrationClientAPI("C:\\workspace\\Java_Practice\\BusAPI\\src\\esbclient.properties");
		String filename = "";
	
		// ?›¹ ?„œë¹„ìŠ¤ ?™œ?š©? ?¸ì¦ì²˜ë¦¬ë?? ?•œ?‹¤.
		System.out.println("---------------------------------------------");
		api.auth(UserType.USER);

		// ?›¹ ?„œë¹„ìŠ¤ ?™œ?š©?ë¥? ?œ„?•œ ?„œë¹„ìŠ¤ ?¸ì¦í‚¤ê°? ?ƒ?„±?œ?‹¤.		
		String madesskey = api.makeSessionKey();

		// ?›¹ ?„œë¹„ìŠ¤ ?™œ?š©?ë¥? ?œ„?•œ ?„œë¹„ìŠ¤ ?¸ì¦í‚¤(session key)ë¥? ë°œí–‰?•œ ?›„ ?¸ì¦? ?„œë²„ì— ?“±ë¡í•œ?‹¤.
		api.sendSessionKey(madesskey);
		
		System.out.println("===========================[Session Key Result]===========================");
		System.out.println("[INFO] made SessionKey : " + madesskey);	
		System.out.println();
		

		/*--------------------------------------------------------------------*/
		// REST ?›¹?„œë¹„ìŠ¤ ?˜¸ì¶? POST		
		/*--------------------------------------------------------------------*/
		WebSvcType wstype = WebSvcType.REST; // REST Type
		String URI = "http://localhost:21/iros_eaptl_websvc/customerservice/customerservice/customers"; // URI?„ ?„¤? •?•œ?‹¤.
		String reqStr = "<Customer><name>567</name></Customer>";	// Request Messageë¥? ?„¤? •?•œ?‹¤.

		// REST ?¼ ê²½ìš°?—?Š” Message Headerë¥? ?„¤? •?•œ?‹¤.
		// SOAP ?¼ ê²½ìš°?—?Š” SOAP ë©”ì‹œì§??— Message Headerë¥? ?‘?„±?•œ?‹¤.
		Map headerCnt = api.setHeaderCnt("serviceKey", "requestTime", "callbackURI", "reqMsgID");

		// REST ?›¹ ?„œë¹„ìŠ¤ë¥? ?˜¸ì¶œí•œ?‹¤.
		String retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// ë°˜í™˜ê°’ì„ ì¶œë ¥?•œ?‹¤.
		System.out.println("===========================[REST POST Request Result]===========================");
		System.out.println(retval);
		
		/*---------------------------------------------------------------------*/
		// REST ?›¹?„œë¹„ìŠ¤ ?˜¸ì¶? GET		
		/*---------------------------------------------------------------------*/
		wstype = WebSvcType.REST; // REST Type
		URI = "http://localhost:8080/iros_eaptl_websvc/customerservice/customerservice/customers/123"; // URI?„ ?„¤? •?•œ?‹¤.
		reqStr = null;	// GET ë©”ì†Œ?“œ?Š” Request Messageê°? ?•„?š”?—†?‹¤.

		// REST ?¼ ê²½ìš°?—?Š” Message Headerë¥? ?„¤? •?•œ?‹¤.
		// SOAP ?¼ ê²½ìš°?—?Š” SOAP ë©”ì‹œì§??— Message Headerë¥? ?‘?„±?•œ?‹¤.
		headerCnt = api.setHeaderCnt("serviceKey", "requestTime", "callbackURI", "reqMsgID");

		// REST ?›¹ ?„œë¹„ìŠ¤ë¥? ?˜¸ì¶œí•œ?‹¤.
		retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// ë°˜í™˜ê°’ì„ ì¶œë ¥?•œ?‹¤.
		System.out.println("===========================[REST GET Request Result]===========================");
		System.out.println(retval);
		System.out.println();
		
		

		/*---------------------------------------------------------------------*/
		// SOAP ?›¹?„œë¹„ìŠ¤ ?˜¸ì¶? 		
		/*---------------------------------------------------------------------*/
		wstype = WebSvcType.SOAP; // SOAP Type
		URI = "http://192.168.0.50:8092/PersonService/"; // URI?„ ?„¤? •?•œ?‹¤.
		filename = "request.xml"; // SOAP ë©”ì‹œì§??Š” ì§ì ‘ SOAP ?š”ì²? ë©”ì‹œì§?ë¥? ?‘?„±?•´?•¼ ?•¨.
		reqStr = FileUtils.readFileToString(new File(filename)); // xml ?ŒŒ?¼?„ String?œ¼ë¡? ë³??™˜?•œ?‹¤.

		// SOAP ?¼ ê²½ìš°?—?Š” SOAP ë©”ì‹œì§??— Message Headerë¥? ?‘?„±?•˜ë¯?ë¡? headerCnt ë¥? null ë¡? ?„¤? •?•œ?‹¤.
		headerCnt = null;

		// REST ?›¹ ?„œë¹„ìŠ¤ë¥? ?˜¸ì¶œí•œ?‹¤.
		retval = api.send(wstype, URI, reqStr, headerCnt);
		
		// ë°˜í™˜ê°’ì„ ì¶œë ¥?•œ?‹¤.
		System.out.println("===========================[SOAP Request Result]===========================");
		System.out.println(retval);	
		
	}
}


