<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Course Management</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-info">

<div class="container mt-5">

    <div class="d-flex justify-content-between mb-3">
        <h2>Course Management System</h2>
        <a href="add" class="btn btn-primary">+ Add Course</a>
    </div>

    <div class="card shadow p-3">
        <table class="table table-hover text-center">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Instructor</th>
                    <th>Action</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="c" items="${courses}">
                    <tr>
                        <td>${c.id}</td>
                        <td>${c.name}</td>
                        <td>${c.instructor}</td>

                        <td>
                            <a href="edit?id=${c.id}" class="btn btn-warning btn-sm">Edit</a>
                            <a href="delete?id=${c.id}" 
                               class="btn btn-danger btn-sm"
                               onclick="return confirm('Delete this course?')">
                               Delete
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>
    </div>

</div>

</body>
</html>