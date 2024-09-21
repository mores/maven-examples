package org.test;

import com.sendgrid.*;

import org.junit.jupiter.api.Test;

public class MailTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( MailTest.class );

	@Test
        public void emailTest() throws Exception
        {
                log.info( "Sending email" );

                java.util.Properties properties = new java.util.Properties();

                properties.setProperty( "mail.smtp.auth", "true" );
                properties.setProperty( "mail.smtp.host", "smtp.sendgrid.net" );
                properties.setProperty( "mail.smtp.port", "587" );
                properties.setProperty( "mail.smtp.from", "" );

                properties.setProperty( "mail.smtp.auth.username", "apikey" );
                properties.setProperty( "mail.smtp.auth.password", "" );

		properties.setProperty( "mail.smtp.starttls.enable", "true" );

		jakarta.mail.Session session = null;
		log.trace( "Sending TLS" );

		session = jakarta.mail.Session.getDefaultInstance( properties,
			new jakarta.mail.Authenticator()
			{
				protected jakarta.mail.PasswordAuthentication getPasswordAuthentication()
				{
					return new jakarta.mail.PasswordAuthentication( properties.getProperty( "mail.smtp.auth.username" ), properties.getProperty( "mail.smtp.auth.password" ) );
				}
			} );

		session.setDebug( true );

                jakarta.mail.Message message = new jakarta.mail.internet.MimeMessage( session );

		message.setFrom( new jakarta.mail.internet.InternetAddress( properties.getProperty( "mail.smtp.from" ) ) );

		message.setSubject( "Test" );

		message.setRecipients( jakarta.mail.Message.RecipientType.TO, jakarta.mail.internet.InternetAddress.parse( "" ) );

		java.util.List<jakarta.mail.BodyPart> bodyParts = new java.util.ArrayList<>();

		jakarta.mail.BodyPart messageBodyPart = new jakarta.mail.internet.MimeBodyPart();
                messageBodyPart.setContent( "This is just a test", "text/html; charset=utf-8" );
                bodyParts.add( messageBodyPart );

		jakarta.mail.Multipart multipart = new jakarta.mail.internet.MimeMultipart();
                for( jakarta.mail.BodyPart bodyPart : bodyParts )
                {
                        multipart.addBodyPart( bodyPart );
                }
                message.setContent( multipart );

                jakarta.mail.Transport.send( message );

        }
}
