<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="../views/fragments/head.jsp"></jsp:include>
<body>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
<div class="panel panel-default">
<div class="panel-body">
	<div class="row">
		<form action="<spring:url value="/project/add"/>" method="post" 
			class="col-md-8 col-md-offset-2">
		
			<div class="form-group">
				<label for="project-name">Name</label>
				<input type="text" id="project-name" 
						class="form-control" name="name"/>
			</div>
			
			<div class="form-group">
				<label for="project-type">Type</label>
				<select name="type" class="selectpicker" id="project-type">
					<option></option>
					<option value="single">Single Year</option>
					<option value="multi">Multi-Year</option>
				</select>
			</div>
		
			<div class="form-group">
				<label for="sponsor">Sponsor</label>
				<input id="sponsor" type="text" 
						class="form-control" name="sponsor"/>
			</div>
		
			<div class="form-group">
				<label for="funds">Authorized Funds</label>
				<input id="funds" type="text"
					class="form-control" name="authorizedFunds"/>
			</div>
		
			<div class="form-group">
				<label for="hours">Authorized Hours</label>
				<input id="hours" type="text"
					class="form-control" name="authorizedHours"/>
			</div>
		
			<div class="form-group">
				<label for="project-name">Description</label>
				<textarea class="form-control" name="description" rows="3"></textarea>
			</div>

			<div class="form-group">
				<label for="special">Special</label>
				<input id="special" name="special" type="checkbox"/>
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>

		</form>
		
	</div>
</div>
</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>

</body>
</html>