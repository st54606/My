package lv.citadele.controllers;

import javax.servlet.http.HttpServletRequest;

import lv.citadele.models.IModel;

public interface IController {
	String getRedirectUrl();
	public void execute(IModel model, HttpServletRequest request);
}
