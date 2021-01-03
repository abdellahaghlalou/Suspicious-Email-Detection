<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Composer un E-mail</title>
	<link rel="stylesheet" type="text/css" href="css/compose.css">
</head>
<body>
	<a href="/Application/Login.jsp">Se d�connecter</a>
	<section>
		<a href="/Application/EmailRegister.jsp" target="_self">Composer un E-mail</a><br><br>
		<a href="/Application/Inbox.jsp" target="_self">Bo�te de r�ception</a><br><br>
		<a href="/Application/Outbox.jsp" target="_self">Bo�te d'envoi</a><br><br>
	</section>
	<form>
		<label>� :</label>
		<input type="email" name="to" required><br><br>
		<label>De :</label>
		<input type="email" name="from" required><br><br>
		<label>Objet : </label>
		<input type="text" name="subject"><br><br>
		<label>Message :</label>
		<textarea name="message" placeholder="Ecrivez votre message ici ..."></textarea><br><br>
		<button style="background-color: saddlebrown; color: white;">Envoyer</button>
	</form><br><br>
</body>
</html>