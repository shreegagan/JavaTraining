<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Conversion Result</title>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            margin: auto;
			padding: 0;
			
			
        }
        .container{
        background-color: skyblue;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            max-width: 300px;
            margin: 0 auto;
            width : 700px;
			height : 150px;
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
        
}
    </style>
    
    </head>
<body>
	<h1 class="mt-5">Conversion Result</h1>
    <div class="container">
        
        <div class="alert alert-success mt-4">
            The result in the selected number system is: ${result}
        </div>
    </div>
    
    <!-- Add Bootstrap JS and jQuery CDN links at the end of the body, if needed -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
