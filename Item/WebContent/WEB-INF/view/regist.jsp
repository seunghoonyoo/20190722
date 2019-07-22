<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
<h3>상품 등록</h3>
<form action="regist" method="post">
<input type="radio" name="type" value="키보드">keybord
<input type="radio" name="type" value="마우스">mouse
<br><br>
<input type="text" name="name" placeholder="상품 이름 입력">
<br><br>
<input type="number" name="price" placeholder="상품 가격 입력">
<br><br>
<input type="submit" value="등록">
</form>
</div>