package org.apache.commons.mail;

import java.util.Date;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MailTest extends TestCase{
    Email testEmail;

    @Before
    public void setUp() {
        testEmail = new SimpleEmail();
    }

    @Test
    public void testAddTo() throws EmailException {
        System.out.println("MailTest.java: This test should succeed in adding a 'TO' recipient to the email.");
        System.out.println("gdpXXX");
        testEmail.addTo("aaa@b.com");
        assertEquals("aaa@b.com", testEmail.getToAddresses().get(0).toString());
    }

    @Test
    public void testSetSubject() {
        System.out.println("MailTest.java: This test should set the subject.");
        System.out.println("gdpXXX");
        testEmail.setSubject("Hello");
        assertEquals("Hello", testEmail.getSubject());
    }

    @Test
    public void testSetSentDate() {
        System.out.println("MailTest.java: This test should set the sent date.");
        System.out.println("gdpXXX");
        testEmail.setSentDate(new Date(100L));
        assertEquals(new Date(100L), testEmail.getSentDate());
    }
}
