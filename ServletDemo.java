package com.createiq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      res.setContentType("text/html");	
      PrintWriter  printWriter = res.getWriter();
      printWriter.write("<body style = \"background-color: lightcyan;\">\r\n" + 
      		"	\r\n" + 
      		"	<h1 align=\"center\" style=\"font-style: inherit;font-size: xx-large;-large; color:darkviolet ;text-decoration: underline;text-decoration-color: darkviolet;\">\r\n" + 
      		"		Pulendar Vemula's Blog\r\n" + 
      		"</h1>\r\n" + 
      		"<hr style=\"border-width: 3px;border-color:orangered ;\">\r\n" + 
      		"\r\n" + 
      		"<p align=\"center\">\r\n" + 
      		"<img src = \"C:\\Users\\Hp\\Pictures\\Pictures\\20190614180902_IMG_5150 (2).jpg\" alt = \"Pulendar Vemula\" width=\"500\" height=\"400\">\r\n" + 
      		"</p>\r\n" + 
      		"<p align=\"center\" style=\"font-style : italic;color: darkmagenta;font-size: x-large;\">\r\n" + 
      		"	<mark>Pulendar Vemula</mark> was an <b>Indian</b> anti-colonial <em>nationalist</em>,<br>\r\n" + 
      		"	secular humanist, social democrat, politician,<br>\r\n" + 
      		"	and author who was a central figure in India.<br>\r\n" + 
      		"	during the middle third of the 20<sup>th</sup> century.<br>\r\n" + 
      		"	He was a principal leader of the <strong>Indian independence</strong><br>\r\n" + 
      		"	movement in the 1930s and 1940s. <br>\r\n" + 
      		"    Born: 24<sup>th</sup> May 1995, Thoodukurthy.<br>\r\n" + 
      		"    Profession : Java Developer<br>\r\n" + 
      		"    Education: Mallareddy Institute of Technology (2014 - 2017), Z P High School, Thoodukurthy\r\n" + 
      		"</p>\r\n" + 
      		"</body>");
      printWriter.close();
	}

}
