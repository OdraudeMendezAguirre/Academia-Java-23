<%@ page import="java.util.*, com.luv2code.web.jdbc.*" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<%
// get the students from the request object (sent by servlet)
	List<Vocalista> theVocalistas = 
			(List<Vocalista>) request.getAttribute("VOCALISTA_LIST");
%>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>FooBar The Ghost Band</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<table>
			
				<tr>
					<th>Nombre</th>
				</tr>
				
				<%
								for (Vocalista tempVocalista : theVocalistas) {
								%>
				
					<tr>
						<td> <%= tempVocalista.getNombre() %> </td>
					</tr>
				
				<% } %>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








