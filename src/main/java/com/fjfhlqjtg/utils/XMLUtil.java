package com.fjfhlqjtg.utils;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.fjfhlqjtg.infacacc.vo.InFacAccVo;
import com.fjfhlqjtg.outcontacc.vo.OutContAccVo;
import com.fjfhlqjtg.outcontacc.vo.PlyInfoVo;
import com.fjfhlqjtg.outcontacc.vo.PlyPayPlanVo;
import com.fjfhlqjtg.outcontacc.vo.TaskInfoVo;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * xml字符串转换JavaBean工具类
 * 
 * @author fjfhlqjtg
 * 
 */
public class XMLUtil {

	/**
	 * <p>
	 * 将入参xml字符串转换为JavaBean
	 * </p>
	 * 
	 * @param serviceType
	 *            服务名称
	 * @param xmlStr
	 *            入参xml字符串
	 * @return
	 * @return
	 */
	public static Object parseXml2JavaBean(String serviceType, String xmlStr)
			throws ConversionException {
		Object obj = null;
		if (StringUtils.equalsIgnoreCase("OUTCONTACC", serviceType)) {
			obj = parseXml2OutContAcc(xmlStr);
		} else if (StringUtils.equalsIgnoreCase("OUTFACACC", serviceType)) {

		} else if (StringUtils.equalsIgnoreCase("INFACACC", serviceType)) {
			obj=parseXml2InFacAcc(xmlStr);
		}
		return obj;
	}

	/**
	 * 将入参转换为分入临分JavaBean
	 * @param xmlStr	入参xml字符串
	 * @return	<p>分出合同JavaBean</p><see>com.fjfhlqjtg.infacacc.vo.InFacAccVo</see>
	 */
	private static Object parseXml2InFacAcc(String xmlStr) {
		InFacAccVo vo=null;
		if(StringUtil.isNotNull(xmlStr)){
			
		}
		return vo;
	}

	/**
	 * 将入参xml字符串转换为分出合同JavaBean
	 * 
	 * @param xmlStr
	 *            入参xml字符串
	 * @return <p>分出合同JavaBean</p><see>com.fjfhlqjtg.outcontacc.vo.OutContAccVo</see>
	 */
	private static Object parseXml2OutContAcc(String xmlStr) throws ConversionException{
		OutContAccVo vo = null;
		if (StringUtil.isNotNull(xmlStr)) {
			XStream xstream = new XStream(new DomDriver());
			xstream.registerConverter(new DateConverter("yyyy-MM-dd HH:mm:ss",
					new String[] { "YYYY-MM-DD", "yyyy-MM-dd HH:mm:ss.S" }));
			xstream.alias("OUTCONTACC", OutContAccVo.class);
			xstream.aliasField("SERVICE_TYPE", OutContAccVo.class,
					"serviceType");
			xstream.aliasField("TRANSACTION_TYPE", OutContAccVo.class,
					"operateType");

			xstream.aliasField("PLY_INFO", OutContAccVo.class, "plyVo");
			xstream.alias("PLY_INFO", PlyInfoVo.class);
			xstream.aliasField("CREATEDATETIME", PlyInfoVo.class, "crtTime");
			xstream.aliasField("CREATEUSERCODE", PlyInfoVo.class, "crtCode");
			xstream.aliasField("CHANGEDATETIME", PlyInfoVo.class, "updTime");
			xstream.aliasField("CHANGEUSERCODE", PlyInfoVo.class, "updCode");
			xstream.aliasField("PROPOSALNO", PlyInfoVo.class, "plyAppNo");
			xstream.aliasField("POLICYNO", PlyInfoVo.class, "plyNo");
			xstream.aliasField("EDRAPPNO", PlyInfoVo.class, "edrAppNo");
			xstream.aliasField("ENDORSENO", PlyInfoVo.class, "edrNo");
			xstream.aliasField("DOCUMENTNO", PlyInfoVo.class, "docNo");
			xstream.aliasField("DOCUMENTNTYPE", PlyInfoVo.class, "docType");
			xstream.aliasField("PROPOSALSERIALNO", PlyInfoVo.class, "serialNo");
			xstream.aliasField("PRODUCTNODECODE", PlyInfoVo.class, "insuCode");
			xstream.aliasField("DEPTCODE", PlyInfoVo.class, "deptNo");
			xstream.aliasField("INSUREDNAME", PlyInfoVo.class, "insuName");
			xstream.aliasField("AGENTCODE", PlyInfoVo.class, "agentCode");
			xstream.aliasField("AGENTCOMMPRT", PlyInfoVo.class, "agentComPrt");
			xstream.aliasField("STARTDATE", PlyInfoVo.class, "insuBegTime");
			xstream.aliasField("ENDDATE", PlyInfoVo.class, "insuEndTime");
			xstream.aliasField("PAYSTART", PlyInfoVo.class, "payBegTime");
			xstream.aliasField("PAYEND", PlyInfoVo.class, "payEndTime");
			xstream.aliasField("PAYMENTMODE", PlyInfoVo.class, "payMode");
			xstream.aliasField("INSURANCEVALUECURRENCY", PlyInfoVo.class,
					"insuCurr");
			xstream.aliasField("INSURANCEVALUE", PlyInfoVo.class, "insuAmt");
			xstream.aliasField("INSURANCEVALUEVAR", PlyInfoVo.class,
					"insuAmtVar");
			xstream.aliasField("PREMIUMCURRENCY", PlyInfoVo.class, "prmCurr");
			xstream.aliasField("PREMIUM", PlyInfoVo.class, "prmAmt");
			xstream.aliasField("PREMIUMVAR", PlyInfoVo.class, "prmAmtVar");
			xstream.aliasField("DEVELOPBUSINESSAMT", PlyInfoVo.class, "showAmt");
			xstream.aliasField("DEVELOPBUSINESSVAR", PlyInfoVo.class,
					"showAmtVar");
			xstream.aliasField("COMMISSIONAMT", PlyInfoVo.class, "commisonAmt");
			xstream.aliasField("COMMISSIONVAR", PlyInfoVo.class,
					"commisonAmtVar");
			xstream.aliasField("BROKERAMT", PlyInfoVo.class, "brokerAmt");
			xstream.aliasField("BROKERVAR", PlyInfoVo.class, "brokerAmtVar");
			xstream.aliasField("ISSUEDATE", PlyInfoVo.class, "insuTime");
			xstream.aliasField("PAYBEFOREISSUEDATE", PlyInfoVo.class,
					"payBeforeInsuTime");
			xstream.aliasField("MAXDATE", PlyInfoVo.class, "maxTime");
			xstream.aliasField("REMARK", PlyInfoVo.class, "remark");
			xstream.aliasField("SALESYS", PlyInfoVo.class, "saleSys");
			xstream.aliasField("PERSISTMARK", PlyInfoVo.class, "persistMark");
			xstream.aliasField("EXCLUDE", PlyInfoVo.class, "exclude");
			xstream.aliasField("RISKLEVEL", PlyInfoVo.class, "riskLev");

			xstream.aliasField("TASK_INFO", OutContAccVo.class, "taskVo");
			xstream.alias("TASK_INFO", TaskInfoVo.class);
			xstream.aliasField("CREATEDATETIME", TaskInfoVo.class, "crtTime");
			xstream.aliasField("CREATEUSERCODE", TaskInfoVo.class, "crtCode");
			xstream.aliasField("CHANGEDATETIME", TaskInfoVo.class, "updTime");
			xstream.aliasField("CHANGEUSERCODE", TaskInfoVo.class, "updCode");
			xstream.aliasField("PROPOSALNO", TaskInfoVo.class, "plyAppNo");
			xstream.aliasField("POLICYNO", TaskInfoVo.class, "plyNo");
			xstream.aliasField("APPLYNO", TaskInfoVo.class, "edrAppNo");
			xstream.aliasField("ENDORSENO", TaskInfoVo.class, "edrNo");
			xstream.aliasField("IFISSUED", TaskInfoVo.class, "isIssued");
			xstream.aliasField("INSURANCEVALUE", TaskInfoVo.class, "insuAmt");
			xstream.aliasField("PREMIUM", TaskInfoVo.class, "prmAmt");
			xstream.aliasField("TASKSTARTDATE", TaskInfoVo.class, "startTime");
			xstream.aliasField("DEPTCODE", TaskInfoVo.class, "dptCode");

			xstream.aliasField("PLY_PAY_PLAN_INFO_LIST", OutContAccVo.class,
					"planList");
			xstream.alias("PLY_PAY_PLAN_INFO", PlyPayPlanVo.class);
			xstream.aliasField("PROPOSALNO", PlyPayPlanVo.class, "plyAppNo");
			xstream.aliasField("POLICYNO", PlyPayPlanVo.class, "plyNo");
			xstream.aliasField("APPLYNO", PlyPayPlanVo.class, "edrAppNo");
			xstream.aliasField("ENDORSENO", PlyPayPlanVo.class, "edrNo");
			xstream.aliasField("PAYSEQUENCE", PlyPayPlanVo.class, "paySeq");
			xstream.aliasField("PAYSTARTDATE", PlyPayPlanVo.class, "payBegTime");
			xstream.aliasField("PAYENDDATE", PlyPayPlanVo.class, "payEndTime");
			xstream.aliasField("PREMIUM", PlyPayPlanVo.class, "prmAmt");
			xstream.aliasField("CURRENCY", PlyPayPlanVo.class, "curr");
			xstream.aliasField("STATE", PlyPayPlanVo.class, "state");
			vo = (OutContAccVo) xstream.fromXML(xmlStr);
		}
		return vo;
	}

	public static String xml2String(String fileName) {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();
		InputSource inputSource = new InputSource(fileName);
		Document document = null;
		StringWriter sw = null;
		try {
			document = documentBuilderFactory.newDocumentBuilder().parse(
					inputSource);
			sw = new StringWriter();
			Transformer serializer = TransformerFactory.newInstance()
					.newTransformer();
			serializer.transform(new DOMSource(document), new StreamResult(sw));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return (sw == null) ? "" : sw.toString();
	}

}
