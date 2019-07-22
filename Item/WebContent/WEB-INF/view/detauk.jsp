<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    			
    			<c:forEach var="itemDto" items="${list}">
    			<c:if test="${itemDto.no == param.no }">
    			
    			<c:if test="${itemDto.type == '키보드' }">
					<img width="15px" height="15px" src="/res/image/keybord.jpg">
				</c:if>
				<c:if test="${itemDto.type == '마우스' }">
					<img width="15px" height="15px" src="/res/image/mouse.jpg">
				</c:if>
    			<hr>
    				<h3>${itemDto.type }</h3><hr>
    				<h3>${itemDto.name }</h3><hr>
    				<h3>${itemDto.price }</h3>
				</c:if>
    			</c:forEach>
    