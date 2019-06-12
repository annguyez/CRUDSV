<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sua</title>
</head>
<body>
<form action="SuaSV" method="post">
		Masv <input name="masv" value="${sv.masv}" type="text"/>
		Hosv <input name="hosv"value="${sv.hosv}" type="text"/>
		Tensv <input name="tensv"value="${sv.tensv}" type="text"/>
		NgaySinh <input name="ngaysinh"value="${sv.ngaysinh}" type="text"/>
		Gioitinh <input name="gioitinh" value="${sv.gioitinh}"type="text"/>
		Ma khoa <input name="makhoa"value="${sv.makhoa}" type="text"/>
		 <input value="Sua" type="submit"/>
	</form>
</body>
</html>