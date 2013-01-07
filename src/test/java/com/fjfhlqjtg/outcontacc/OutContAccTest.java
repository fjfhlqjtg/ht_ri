package com.fjfhlqjtg.outcontacc;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import junit.framework.Assert;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.fjfhlqjtg.outcontacc.vo.OutContAccVo;
import com.fjfhlqjtg.utils.XMLUtil;

@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class OutContAccTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	private final Logger log = LogManager.getLogger(this.getClass());
	private final String filePath = "./src/test/resources/xmlStr/outcontacc.xml";
	@Autowired
	private Validator validator;

	@Before
	public void init() {

	}

	@Test
	public void testParseXml2Bean() {
		log.info("testParseXml2Bean");
		try {
			String xmlStr = XMLUtil.xml2String(filePath);
			OutContAccVo obj = (OutContAccVo) XMLUtil.parseXml2JavaBean(
					"OUTCONTACC", xmlStr);
			Assert.assertNotNull(obj);
			log.info("deptNo:" + obj.getPlyVo().getDeptNo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testValidator() {
		log.info("testValidator");
		try {
			String xmlStr = XMLUtil.xml2String(filePath);
			OutContAccVo obj = (OutContAccVo) XMLUtil.parseXml2JavaBean(
					"OUTCONTACC", xmlStr);
			Set<ConstraintViolation<OutContAccVo>> constraint = validator
					.validate(obj);
			Assert.assertEquals(0, constraint.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
