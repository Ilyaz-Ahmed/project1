package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.Studentdao;

@WebServlet("/remove")
public class delete extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	String sid=req.getParameter("sid");
	int sid1=Integer.parseInt(sid);
	
	Studentdao dao=new Studentdao();
	dao.remove(sid1);
}
}
