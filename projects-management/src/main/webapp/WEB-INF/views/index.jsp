<%@include file="./shared/header.jsp"%>
<body>

	<c:if test="${userClickIndex == true}">
		<%@include file="login.jsp"%>
	</c:if>

	<c:if test="${userCLickDashboard == true}">
		<%@include file="dashboard.jsp"%>
	</c:if>
	
</body>
<%@include file="./shared/footer.jsp"%>
</html>