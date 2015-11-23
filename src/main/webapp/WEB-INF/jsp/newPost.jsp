<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body>
	<h2>Writing new Post</h2>

	<form:form method="POST" commandName="blogPost" action="/postBlog">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
				<tr>
				<td>Heading :</td>
				<td><form:input path="heading"  /></td>
				<td><form:errors path="heading" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Post :</td>
				<td><form:textarea path="content" rows="5" cols="30" /></td>
				<td><form:errors path="content" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td colspan="3"><input type="submit" name="Post" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>