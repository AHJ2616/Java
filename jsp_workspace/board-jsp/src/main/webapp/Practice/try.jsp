<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <script>
      const buttonA = document.querySelector('#button_A');
      const headingA = document.querySelector('#heading_A');

      buttonA.onclick{
        const name = prompt('What is your name?');
        if (name) {
          alert(`Hello ${name}, nice to see you!`);
          headingA.textContent = `Welcome ${name}`;
        } else {
          alert('You did not enter a name.');
        }
      };
    </script>
    <button id="button_A">Press me</button>
    <h3 id="heading_A"></h3>
</body>
</html>