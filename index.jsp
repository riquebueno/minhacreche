<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MinhaCreche.com</title>
</head>
<body>

<h1><font color="darkblue">Bem vindo(a)!<br><a href="index.jsp">MinhaCreche.com</a></font></h1>





<form>


Cidade 
<select name="cidade">
	<option value="Selecione">Selecione</option>
	<option value="RioDeJaneiro">Rio de Janeiro</option>
	<option value="Niteroi">Niteroi</option>
</select>
<font size="2" color="red">(Obrigatorio)</font>
<br>
Bairro
<select name="bairro">
	<option value="Selecione">Selecione</option>
	<option value="Ipanema">Ipanema</option>
	<option value="Leblon">Leblon</option>
	<option value="Flamengo">Flamengo</option>
	<option value="Botafogo">Botafogo</option>
</select>
<font size="2" color="red">(Obrigatorio)</font>

<br>
<br>

<input type="hidden" name="acao">
<input type="submit" value="Refinar busca" onclick="javascript: form.acao.value='refinar';form.action='executa';"/>
<input type="submit" value="Ver todos" onclick="javascript: form.acao.value='todos';form.action='executa';"/>


</form>

<font size="1"><a href="contato.jsp">Como posso cadastrar a minha creche?</a></font>


</body>
</html>