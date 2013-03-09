package lv.citadele.filters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lv.citadele.controllers.FormController;
import lv.citadele.controllers.IController;
import lv.citadele.mapping.UrlMapping;
import lv.citadele.modelCreater.FormModelCreater;
import lv.citadele.modelCreater.ModelCreater;
import lv.citadele.models.IModel;


@WebFilter("/MappingFilter")
public class MappingFilter implements Filter {
	private Map<String, UrlMapping> mapping;
	
   
    public MappingFilter() {
		mapping = new HashMap<String, UrlMapping>();
		
		//Form mapping
		UrlMapping formPage = new UrlMapping();
		formPage.setUrl("/jsp/successful.jsp");
		formPage.setModelCreater(new FormModelCreater());
		formPage.setController(new FormController());
		formPage.setJsp("/jsp/sucessful.jsp");

		mapping.put(formPage.getUrl(), formPage);
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		ModelCreater modelCreater = mapping.get("formPage").getModelCreater();
		IModel model= modelCreater.createModel(req);
			IController controller  = mapping.get("formPage").getController();
			controller.execute(model, req);
			
		
		chain.doFilter(request, response);
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
