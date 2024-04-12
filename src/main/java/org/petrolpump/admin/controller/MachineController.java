package org.petrolpump.admin.controller;

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpum.admin.service.MachineService;
import org.petrolpum.admin.service.MachineServiceImpl;
import org.petrolpump.admin.model.MachineModel;

/**
 * Servlet implementation class MachineController
 */
@WebServlet("/newmachine")
public class MachineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	MachineService machineService=new MachineServiceImpl();
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
//		out.println("<h1> I am Controller </h1>");
		String machineCode=request.getParameter("machineCode");
		MachineModel model=new MachineModel();
		model.setMachineCode(machineCode);
		boolean b=machineService.isAddNewMachine(model);
		if(b) {
			out.println("<h2> Machine Added Successfully </h2>");
		}
		else {
			out.println("Some problem is there");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
