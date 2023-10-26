<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Number System Converter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: green;
        }

        form {
            background-color: skyblue;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            max-width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            text-align: left;
            margin: 10px 0;
        }

        select, input[type="text"] {
            width: 90%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: purple;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: red;
        }
    </style>
</head>
<body>
    <h1>Number System Converter</h1>

    <form action="NumberConverterServlet" method="post">
        <label>Select Number System:</label>
        <select name="numberSystem">
            <option value="binary">Binary</option>
            <option value="octal">Octal</option>
            <option value="hexadecimal">Hexadecimal</option>
            <!-- Add more number systems as needed -->
        </select><br><br>

        <label>Enter First Decimal Number:</label>
        <input type="text" name="number1" required><br><br>

        <label>Enter Second Decimal Number:</label>
        <input type="text" name="number2" required><br><br>

        <input type="submit" value="Convert">
    </form>
</body>
</html>
