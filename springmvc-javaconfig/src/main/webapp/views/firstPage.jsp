
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Hello World!</h2>
    This is a Example of Spring MVC using JavaConfig and Not XML Files..
    <p>
        If you want to see if the controller really works just click <a href="./saveBook">here</a>.
    </p>
    <p>
        If you want to logout just click below
    </p>
    <form action="<%=request.getContextPath()%>/logout" method="POST">
        <input type="submit" value="Logout"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
      </form> 
</body>
</html>
