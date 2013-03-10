package lv.citadele.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import lv.citadele.models.FormModel;
import lv.citadele.models.IModel;
import lv.citadele.services.EmailService;
import lv.citadele.services.EmailServiceInterface;

public class FormController  extends ControllerBase{

	@Override
	public void execute(IModel model, HttpServletRequest request) {
		FormModel modelf = ((FormModel)model);
		EmailServiceInterface email = new EmailService();
		email.sendEmail(modelf);
		HttpSession session = request.getSession();
		System.out.println(modelf.getRemitterName()+ "controller");
		session.setAttribute("model", modelf);
	}

}
