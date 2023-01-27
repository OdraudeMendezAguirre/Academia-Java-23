<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>The band Ghost</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>The Band Ghost</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
			
			<input type="button" value="Agregar Vocalista" 
				   onclick="window.location.href='add-vocalista-form.jsp'; return false;"
				   class="add-vocalista-button"
			/>
			
			<table>
			
				<tr>
					<th>Nombre</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempVocalista" items="${VOCALISTA_LIST}">
					
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="VocalistaControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="VocalistaId" value="${tempVocalista.idVocalista}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="VocalistaControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="VocalistaId" value="${tempVocalista.idVocalista}" />
					</c:url>
																		
					<tr>
						<td> ${tempVocalista.nombre} </td>
						<td> 
							<a href="${tempLink}">Update</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Seguro que vas a eliminar a este vocalista?'))) return false">
							Delete</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








