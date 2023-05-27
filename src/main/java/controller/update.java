package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.Studentdao;
import dto.Studentdto;

@WebServlet("/update")
public class update extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	String sid=req.getParameter("sid");
	int sid1=Integer.parseInt(sid);
	String sname=req.getParameter("sname");
	 String gender=req.getParameter("gender");
	 
	 String phno=req.getParameter("phno");
	 
	 long phno1= Long.parseLong(phno);
	 Studentdao dao=new Studentdao();
	 dao.update(sid1,sname,gender,phno1);
}
}
