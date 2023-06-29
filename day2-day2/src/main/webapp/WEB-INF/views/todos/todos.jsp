<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <p><%= request.getParameter("err")%></p>
  <form action="/main" method="post">
    <input type="text" name="content" placeholder="content을 입력해주세요">
    <input type="submit">
  </form>
</div>
