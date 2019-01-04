<%--
  Created by IntelliJ IDEA.
  User: danqu
  Date: 29/12/2018
  Time: 6:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
  <head>
    <title>Customer ListView</title>
  </head>
  <body>
  <h2>Danh sách khách hàng</h2>
  <table>
    <tr>
      <td width="200px">Họ tên
      </td>
      <td width="200px">
        Ngày sinh
      </td>
      <td width="200px">
        Địa chỉ
      </td>
    </tr>
      <c:forEach items="${customer}" var="cus">
        <tr>
        <td>
            ${cus.name}
        </td>

        <td>
            <fmt:formatDate type="date" value="${cus.date}" />
        </td>

        <td>
          ${cus.add}
        </td>
    </tr>

      </c:forEach>
  </table>
  </body>
</html>
