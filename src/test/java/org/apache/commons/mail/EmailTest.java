package org.apache.commons.mail;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.Test;
import org.subethamail.smtp.server.Session;
import java.util.Date;

public class EmailTest {
	
	private static final String[] TestEmails = {"ab@bc.com", "a.b@c.org", "test@gmail.com"};

	private EmailConcrete email;
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
		
	}
	
	@After
	public void tearDownEmailTest() throws Exception 
	{
		
	}
	
	@Test
	public void testaddBcc() throws Exception
	{
		email.addBcc(TestEmails);
		assertEquals(3, email.bccList.size());
		assertEquals(3, email.getBccAddresses().size());
	}
	
	@Test
	public void testaddCc() throws Exception
	{
		email.addCc(TestEmails);
		assertEquals(3, email.bccList.size());
		assertEquals(3, email.getBccAddresses().size());
	}
	
	
	
}
