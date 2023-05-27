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
import net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing;
@WebServlet("/delete")

public class Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
	
		Studentdao dao=new Studentdao();
		List<Studentdto> dto1=dao.fetchall();
		req.setAttribute("Studentlist", dto1);
		RequestDispatcher rd=req.getRequestDispatcher("print.jsp");
		rd.forward(req, resp);
		
		
		
		
		
//		for(Object o:dto1) {
//		resp.getWriter().print(o);
	}
	}


