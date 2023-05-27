package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.Studentdao;
import dto.Studentdto;
@WebServlet("/update12")
public class Controllerupdate extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	String sid=req.getParameter("sid");
	int sid1=Integer.parseInt(sid);
	String sname=req.getParameter("sname");
	String gender=req.getParameter("gender");
	String phno=req.getParameter("phno");
	long phno1=Long.parseLong(phno);
	
	Studentdto dto1=new Studentdto();
	dto1.setSid(sid1);
	dto1.setSname(sname);
	dto1.setGender(gender);
	dto1.setPhno(phno1);
	
	Studentdao dao=new Studentdao();
	    dao.update1(dto1);
	    List<Studentdto> dto=dao.fetchall();
	    
	    req.setAttribute("Studentlist", dto);
	    
	    resp.getWriter().print("<h1>data is successfully updated</h1>");
	    RequestDispatcher rd=req.getRequestDispatcher("print.jsp");
	    rd.include(req, resp);
	
}
}
