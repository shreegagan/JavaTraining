<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Upload CSS</title>
    <style type="text/css">
    body.bg-light {
  background-color: #f8f9fa; /* Set your desired background color */
}

.container {
  max-width: 800px; /* Set your desired maximum width for the container */
}

.card {
  border: 1px solid #dee2e6; /* Add border to the card */
  border-radius: 8px; /* Add border radius for rounded corners */
  margin-top: 20px; /* Add margin at the top of the card */
}

.card-header {
  background-color: #007bff; /* Set your desired header background color */
  color: #ffffff; /* Set text color for the header */
  padding: 15px; /* Add padding to the header */
}

.card-title {
  margin-bottom: 0; /* Remove default margin for the card title */
}

.card-body {
  padding: 20px; /* Add padding to the card body */
}

.form-label {
  font-weight: bold; /* Set font weight for form labels */
}

.btn-primary {
  background-color: #007bff; /* Set your desired button background color */
  color: darkgray; /* Set text color for the button */
  border: none; /* Remove button border */
}

.btn-primary:hover {
  background-color: #0056b3; /* Set a darker color on button hover */
}
    
    </style>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card">
            <div class="card-header">
                <h5 class="card-title">Upload CSS</h5>
            </div>
            <div class="card-body">
                <form action="CssServlet" method="post" enctype="multipart/form-data">
                    <div class="mb-3">
                        <label for="cssFile" class="form-label">Choose a CSS file</label>
                        <input type="file" class="form-control" id="cssFile" name="cssFile" accept=".css">
                    </div>
                    <button type="submit" class="btn btn-primary" color="darkgray">Upload</button>
                </form>
            </div>
        </div>
    </div>

</body>
</html>
