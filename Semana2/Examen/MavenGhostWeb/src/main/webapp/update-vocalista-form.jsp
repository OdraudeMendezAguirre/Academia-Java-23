<!DOCTYPE html>
<html>

<head>
	<title>Actualizar Vocalista</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-vocalista-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>The band Ghost</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Actualizar Vocalista</h3>
		
		<form action="VocalistaControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="vocalistaId" value="${THE_VOCALISTA.id}" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><input type="text" name="nombre" 
								   value="${THE_STUDENT.nombre}" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="VocalistaControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











