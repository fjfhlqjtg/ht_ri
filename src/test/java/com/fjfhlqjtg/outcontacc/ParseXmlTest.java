package com.fjfhlqjtg.outcontacc;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fjfhlqjtg.outcontacc.vo.OutContAccVo;
import com.fjfhlqjtg.utils.XMLUtil;

public class ParseXmlTest {

	private static Logger log=LoggerFactory.getLogger(ParseXmlTest.class);
	@Test
	public void testParseXml2Bean(){
		log.info("OUTCONTACC");
		String fileName = "./src/test/resources/xmlStr/outcontacc.xml";
		String xmlStr=XMLUtil.xml2String(fileName);
		try {
			OutContAccVo obj=(OutContAccVo) XMLUtil.parseXml2JavaBean("OUTCONTACC",xmlStr);
			Assert.assertNotNull(obj);
			log.info("deptNo:"+obj.getPlyVo().getDeptNo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
