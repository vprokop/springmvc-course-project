<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="../views/fragments/head.jsp"/>
<body>

	<jsp:include page="../views/fragments/header.jsp"/>
	
	<div class="container">
		<div class="row">
			
				<div class="form-group">
					<label for="project-name">Name</label>
					<span>${project.name}</span>
				</div>

				<div class="form-group">
					<label for="project_type">Type</label>
					<span>${project.type }</span>
				</div>
							
				<div class="form-group">
					<label for="sponsor">Sponsor</label>
					<span>${project.sponsor}</span>
				</div>
			
				<div class="form-group">
					<label for="funds">Authorized Funds</label>
					<span>${project.authorizedFunds}</span>
				</div>
			
				<div class="form-group">
					<label for="hours">Authorized Hours</label>
					<span>${project.authorizedHours}</span>
				</div>
			
				<div class="form-group">
					<label for="project-name">Description</label>
					<span>${project.description}</span>
				</div>
				
				<div class="form-group">
					<label for="special">Special</label>
					<span>${project.special == true ? 'Yes':'No'}</span>
				</div>
			
		</div>
	</div>
	
	<jsp:include page="../views/fragments/footer.jsp"/>
</body>
</html>