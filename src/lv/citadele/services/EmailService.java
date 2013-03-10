package lv.citadele.services;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import lv.citadele.models.FormModel;
import lv.citadele.models.IModel;

public class EmailService implements EmailServiceInterface {

	@Override
	public void sendEmail(IModel model) {
		FormModel modelf = (FormModel) model;

		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName("smtp.googlemail.com");
			email.addTo("tofancheg@gmail.com", "Client");
			email.setSmtpPort(465);
			email.setFrom("Client@citadele.lv", "Client");
			email.setSubject("Form Page");
			email.setSSLOnConnect(true);
			email.setAuthenticator(new DefaultAuthenticator("tofancheg",
					"megaboss"));

			// embed the image and get the content id
			URL url = new URL(
					"http://www.citadele.lv/common/img/citadele-logo.gif");
			String cid = email.embed(url, "Citadele logo.gif");

			// set the html message
			email.setHtmlMsg("<html><body>" + "<img src=\"cid:" + cid + "\">"
					+ "<b><h3>Remitter</h3></b> " + "<br>"
					+ "Customer number:  " + modelf.getCustomerNumber()
					+ "<br>" + "Date : " + modelf.getFormdate() + "<br>"
					+ "Remitter name: " + modelf.getRemitterName() + "<br>"
					+ "Beneficiary name: " + modelf.getBeneficiaryName()
					+ "<br>" + "Personal code: " + modelf.getPersCode()
					+ "<br>" + "Account number: " + modelf.getAccountNr()
					+ "<br>" + "Beneficiary bank: "
					+ modelf.getBeneficiaryBank() + "<br>"
					+ "Residence country: " + modelf.getResidenceCountry()
					+ "<br>" + "Bank code: " + modelf.getBankCode() + "<br>"
					+ "<b><h3>Payment information</h3></b> " + "<br>"
					+ "Amount in figures and currency: " + modelf.getCurrency()
					+ "Amount in words: " + modelf.getAmountInWords()
					+ "Bank fee: " + modelf.getBankFee() + "Payment type: "
					+ modelf.getPaymentType() + "Exchange rate: "
					+ modelf.getExchangeRate() + "Value date: "
					+ modelf.getValueDate() + "Code of external payment: "
					+ modelf.getCodeOfExternalPayment() + "Payment details: "
					+ modelf.getPaymentDetails()
					+ "<b><h3>Signatures </h3></b> " + "<br>" + "Signature: "
					+ modelf.getSignature() + "</body></html>");

			// set the alternative message
			email.setTextMsg("Your email client does not support HTML messages");

			// send the email
			email.send();
		} catch (EmailException | MalformedURLException e) {
			System.out.println("Error in email service");
			e.printStackTrace();
		}

	}

}
