<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../views/fragments/head.jsp"/>
<body>
	
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>			

	<div class="container">
		
		<h2>Projects</h2>
		<table class="table table-hover">
			<tbody>
				<tr>
					<th>Name</th><th>Sponsor</th><th>Description</th>
				</tr>
				<c:forEach items="${projects}" var="project">
					<tr>
						<td><a href="<spring:url 
							value="/project/${project.projectId}"/>">${project.name}</a></td>
						<td>${project.sponsor}</td>
						<td>${project.description}</td>
					</tr>	
				</c:forEach>
			</tbody>
		</table>
		
	</div>
	
	<jsp:include page="../views/fragments/footer.jsp"></jsp:include>
	
</body>
</html>