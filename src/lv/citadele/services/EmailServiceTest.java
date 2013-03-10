package lv.citadele.services;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailServiceTest  {

	public static void main (String[] args){
		 // Create the email message
		  HtmlEmail email = new HtmlEmail();
		  email.setHostName("smtp.googlemail.com");
		  try {
			email.addTo("tofancheg@gmail.com", "Client");
			email.setSmtpPort(465);
		  email.setFrom("client@citadele.lv", "client");
		  email.setSubject("Form Page");
		  email.setSSLOnConnect(true);
		  email.setAuthenticator(new DefaultAuthenticator("tofancheg", "megaboss"));
		  
		  // embed the image and get the content id
		  URL url = new URL("http://www.citadele.lv/common/img/citadele-logo.gif");
		  String cid = email.embed(url, "Citadele logo.gif");
		  
		  // set the html message
		  email.setHtmlMsg("<html><body>" +
		  		"<img src=\"cid:"+cid+"\">"+ "<b>" + url + "</b><br>" +
		  		 url +
		  				"</body></html>");
		  
		  // set the alternative message
		  email.setTextMsg("Your email client does not support HTML messages");

		  // send the email
		  email.send();
		  } catch (EmailException | MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}

}
