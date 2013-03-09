package lv.citadele.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import lv.citadele.models.FormModel;
import lv.citadele.models.IModel;

public class FormController  extends ControllerBase{

	@Override
	public void execute(IModel model, HttpServletRequest request) {
		FormModel modelf = ((FormModel)model);
		HttpSession session = request.getSession();
		System.out.println(modelf.getRemitterName()+ "controller");
		session.setAttribute("model", modelf);
	}

}
