<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<title>Spring MVC Tutorial </title>

</head>
<body>
I am hello jsp/ message:${message}


<sec:authorize access="hasRole('ADMIN')">
<h3>ADMIN Role</h3>
</sec:authorize>
<sec:authorize access="hasRole('USER')">
<h3>USER Role</h3>
</sec:authorize>
</body>
</html>