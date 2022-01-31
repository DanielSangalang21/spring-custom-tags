package com.example.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest1 extends SimpleTagSupport {
	
	private List movieList;
	@Override
	public void doTag() throws JspException, IOException {
		
		Iterator it = movieList.iterator();
		
		while(it.hasNext())
		{
			getJspContext().setAttribute("movie", it.next());
			getJspBody().invoke(null);
		}
		
	}
	public void setMovieList(List movieList) {
		this.movieList = movieList;
	}

}
