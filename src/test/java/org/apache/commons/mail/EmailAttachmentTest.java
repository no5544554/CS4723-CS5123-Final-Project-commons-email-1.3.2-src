package org.apache.commons.mail;

import java.net.URL;
import java.net.MalformedURLException;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmailAttachmentTest extends TestCase{
    EmailAttachment testEmailAttachment;

    @Before
    public void setUp() {
        testEmailAttachment = new EmailAttachment();
    }

    @Test
    public void testSetName() {
        System.out.println("EmailAttachmentTest: This test attempts to set the attachment's name");
        System.out.println("gdpXXX");
        testEmailAttachment.setName("portable_document.pdf");
        assertEquals("portable_document.pdf", testEmailAttachment.getName());
    }

    @Test
    public void testSetURL() throws MalformedURLException{
        System.out.println("EmailAttachmentTest: This test attempts to set the attachment's URL");
        System.out.println("gdpXXX");
        testEmailAttachment.setURL(new URL("https://www.dotcom.com"));
        assertEquals("https://www.dotcom.com", testEmailAttachment.getURL().toString());
    }

    @Test
    public void testSetDescription() {
        System.out.println("EmailAttachmentTest: This test attempts to set the attachment's description");   
        System.out.println("gdpXXX");
        testEmailAttachment.setDescription("The Portable Document");
        assertEquals("The Portable Document", testEmailAttachment.getDescription());
    }

    @Test
    public void testSetDisposition() {
        System.out.println("EmailAttachmentTest: This test attempts to set the attachment's disposition");   
        System.out.println("gdpXXX");
        testEmailAttachment.setDisposition("Disposition");
        assertEquals("Disposition", testEmailAttachment.getDisposition());
    }
    
}
