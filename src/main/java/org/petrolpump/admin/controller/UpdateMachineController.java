package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpum.admin.service.MachineService;
import org.petrolpum.admin.service.MachineServiceImpl;
import org.petrolpump.admin.model.MachineModel;

@WebServlet("/updmachine")
public class UpdateMachineController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int mid=Integer.parseInt(request.getParameter("mid"));
		String machineCode=request.getParameter("mcode");
		
		RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
		r.include(request, response);
		
		out.println("<div class='col py-3'><div class='container mt-5'><div class='row'><div class='bg-info text-dark col-md-6 offset-md-3'>");
		
		out.println("<form class='shadow p-4 formarea' name='frm' action='finalmachineupdate' method='POST'>");
		out.println("<input type='hidden' name='mid' value='"+mid+"' class='form-control'><br>");
		out.println("<input type='text' name='mCode' value='"+machineCode+"' class='text-bg-secondary form-control'><br><br>");
		out.println("<input type='submit' name='s' value='Update Machine Code' class='submitid text-bg-secondary form-control '>");
				
		out.println("</div></div></div></div>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
