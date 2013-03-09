package lv.citadele.modelCreater;

import javax.servlet.http.HttpServletRequest;

import lv.citadele.models.IModel;

public abstract class ModelCreater {
public abstract	IModel createModel(HttpServletRequest request);
}
