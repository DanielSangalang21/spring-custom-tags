package com.example.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AdviseTag extends SimpleTagSupport {
	public String choice;
	@Override
	public void doTag() throws IOException,JspException{
		String advice;
		switch (choice) {
		case "Romance":
			advice = "Langitngit ng lawanit";
			break;
		case "Comedy":
			advice = "Johny English";
			break;
		case "Horror":
			advice = "Child's play";
			break;
		default:
			advice = "Terminator";
			break;
		}
		getJspContext().setAttribute("advise", advice);
		getJspBody().invoke(null);
	}
	
	public String getChoice() {
		return choice;
	}
	public void setChoice(String firstChoice) {
		this.choice = firstChoice;
	}
}
