<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Form</title>
</head>
<body>

	<div class="container mt-5">
		<h1>${header}</h1>
		<h3>${desc}</h3>
	
		<form action="processform" method="post">
			<div class="form-group">
				<label for="exampleInputName">Name</label> 
				<input type="text"
					class="form-control" 
					id="exampleInputName"
					aria-describedby="nameHelp" 
					placeholder="Enter Name"
					name="name">
			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> 
				<input
					type="email" 
					class="form-control" 
					id="exampleInputEmail1"
					aria-describedby="emailHelp" 
					placeholder="Enter email"
					name="email">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> 
				<input
					type="password" 
					class="form-control" 
					id="exampleInputPassword1"
					placeholder="Password"
					name="password">
			</div>

			<div class="form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>

			</div>

		</form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>