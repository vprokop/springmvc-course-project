<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../views/fragments/head.jsp"/>
<body>
	
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>			

	<div class="container">
		<h2>Current Project</h2>
		<ul class="list-group">
  			<li class="list-group-item">
  				<label>Project Name:</label>
  				<span>${currentProject.name }</span>
  			</li>
  			<li class="list-group-item">
  				<label>Sponsor:</label>
  				<span>${currentProject.sponsor }</span>
  			</li>
  			<li class="list-group-item">
  				<label>Description:</label>
  				<br/>
  				<span>${currentProject.description }</span>
  			</li>
		</ul>
	</div>
	
	<div class="container">
		<h2>Products</h2>
		<table class="table table-hover">
			<tbody>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
				<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.name}</td>
					<td>${product.price}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<jsp:include page="../views/fragments/footer.jsp"></jsp:include>
	
</body>
</html>