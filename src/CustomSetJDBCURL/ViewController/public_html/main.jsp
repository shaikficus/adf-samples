<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<title>Browse Departments</title>
</head>
<body>
  <html:errors/>
  <table border="1" width="100%">
    <tr>
      <th>&nbsp;</th>
      <th>
        <c:out value="${bindings.DeptView.labels['Deptno']}"/>
      </th>
      <th>
        <c:out value="${bindings.DeptView.labels['Dname']}"/>
      </th>
      <th>
        <c:out value="${bindings.DeptView.labels['Loc']}"/>
      </th>
    </tr>
    <c:forEach var="Row" items="${bindings.DeptView.rangeSet}">
      <tr>
        <td>&nbsp;
        </td>
        <td>
          <c:out value="${Row['Deptno']}"/>&nbsp;
        </td>
        <td>
          <c:out value="${Row['Dname']}"/>&nbsp;
        </td>
        <td>
          <c:out value="${Row['Loc']}"/>&nbsp;
        </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
