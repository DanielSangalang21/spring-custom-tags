package com.example.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ChoicesTag extends SimpleTagSupport {
	public static final List choices = new ArrayList<String>();
	public ChoicesTag() {
		choices	.add("Horror");
		choices.add("Comedy");
		choices.add("Action");
		choices.add("Romance");
	}
	@Override
	public void doTag() throws JspException, IOException {
		Iterator it = choices.iterator();
		while(it.hasNext())
		{
			getJspContext().setAttribute("choice", it.next());
			getJspBody().invoke(null);
		}
	}
}
