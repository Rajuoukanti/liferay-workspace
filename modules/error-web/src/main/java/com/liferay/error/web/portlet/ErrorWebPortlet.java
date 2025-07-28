package com.liferay.error.web.portlet;

import com.liferay.error.web.constants.ErrorWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author vidyayug
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ErrorWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ErrorWebPortletKeys.ERRORWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ErrorWebPortlet extends MVCPortlet {
	
	@Override
	public void init() {
	    try {
	        String password = "hardcodedPassword123"; // Hardcoded secret — Sonar will flag
	        System.out.println("Portlet initialized"); // Use logger instead of System.out
	    } catch (Exception e) {
	        e.printStackTrace(); // Bad practice — use logger
	    }
	}

	public void someMethod() {
	    String unusedVariable = "I am unused"; // Unused variable — Sonar will flag
	    if (true) {
	        // empty if block — code smell
	    }
	}
}