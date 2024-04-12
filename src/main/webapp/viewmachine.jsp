<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.petrolpum.admin.service.*,java.util.*,org.petrolpump.admin.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Machines</title>
</head>
<body>
<%!
MachineService machineService=new MachineServiceImpl();

%>
	<%@include file="admindashboard.jsp"%>
	<div class="col py-3">
		<div class="container mt-5">
			
			<h2>Machine Details </h2>
				<table class="table">
  <thead class="table-dark">
  	<tr>
  	<th scope="col">Sr No</th>
  	<th scope="col">Machine Code</th>
  	<th scope="col">Delete</th>
  	<th scope="col">Update</th>
  	</tr>
  </thead>
  <tbody>
  <%
  List<MachineModel> list=machineService.getAllMachines();
  int count=0; 
  for(MachineModel m:list){
%>
<tr>
  <td scope="row"><%=++count %></td>
  <td><%= m.getMachineCode() %></td>
  <td><a href='del?machineid=<%=m.getId() %>' >DELETE</a></td>
  <td><a href='updmachine?mid=<%=m.getId()%>&mcode=<%=m.getMachineCode()%>' >UPDATE</a></td>
  </tr>
<% 
   }
  %>
  
  
  
  </tbody>
</table>
			
		</div>



	</div>
	</div>
	</div>

</body>
</html>