package lv.citadele.mapping;

import lv.citadele.controllers.IController;
import lv.citadele.modelCreater.ModelCreater;


public class UrlMapping {
	
private ModelCreater modelCreater;
public ModelCreater getModelCreater() {
	return modelCreater;
}
public void setModelCreater(ModelCreater modelCreater) {
	this.modelCreater = modelCreater;
}
public IController getController() {
	return controller;
}
public void setController(IController controller) {
	this.controller = controller;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getJsp() {
	return jsp;
}
public void setJsp(String jsp) {
	this.jsp = jsp;
}
private IController controller;
private String url;
private String jsp;
}
