<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Sinh viên</title>
<style>
	table{
	margin-left:300px;
	}
	th,td{
	border-right:1px solid black;
	}
</style>
</head>
<body>
	
	<table style="border:1px solid black; text-align:center; padding-right:10px">
		<tr><th>Thêm Sinh Viên</th></tr>
	<tr>
		<th style="">Mã Sinh Viên</th>
		<th>Họ Sinh Viên</th>
		<th>Tên Sinh Viên</th>
		<th>Ngày Sinh</th>
		<th>Giới Tính</th>
		<th>Mã Khoa</th>
		<th>Sửa</th>
		<th>Xóa</th>
	<tr>
	<c:forEach items="${listSv}" var="item">
	<tr>
		<td>${item.masv}</td>
		<td>${item.hosv}</td>
		<td>${item.tensv}</td>
		<td>${item.ngaysinh}</td>
		<td>${item.gioitinh}</td>
		<td>${item.makhoa}</td>
		<td><a href="SuaSV?macansua=${item.masv}">Sua</a></td>
		<td><a href="XoaSV?macanxoa=${item.masv}">Xoa</a></td>
	</tr>
	</c:forEach>
	</table>
	<form action="themsv" method="post">
		Masv <input name="masv" type="text"/>
		Hosv <input name="hosv" type="text"/>
		Tensv <input name="tensv" type="text"/>
		NgaySinh <input name="ngaysinh" type="text"/>
		Gioitinh <input name="gioitinh" type="text"/>
		Ma khoa <input name="makhoa" type="text"/>
		 <input value="Them" type="submit"/>
	</form>
	
</body>
</html>