<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Machine</title>
<link href="CSS/adminstyle.css" rel="stylesheet">
</head>
<body>
	<%@include file="admindashboard.jsp"%>
	<div class="col py-3">

		<div class="container mt-5">
			<div class="row">
				<div class="addmachinebox col-md-6 offset-md-3">
				
					<form name="frm" action="newmachine" method="POST"
						class="shadow p-4">
						<div class="mb-3 text-center">
							<h3>Add New Machine</h3>
						</div>
						<div class="mb-3">
							<label for="machinecode">Enter Machine Code</label> <input
								type="text" class="form-control" name="machineCode"
								placeholder="Machine Code">
						</div>
						<div class="mb-3 text-center ">
							<button type="submit" class="btn btn-primary btnid addmachinebox">Add</button>
						</div>

						<hr>

					</form>
				</div>
			</div>
		</div>



	</div>
	</div>
	</div>
</body>
</html>