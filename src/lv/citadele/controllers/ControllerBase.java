package lv.citadele.controllers;


public abstract class ControllerBase implements IController {

	protected String redirectUrl = null;
	@Override
	public String getRedirectUrl() {
		// TODO Auto-generated method stub
		return redirectUrl;
	}

	

}
