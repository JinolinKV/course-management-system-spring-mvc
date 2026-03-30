<html>
<head>
<title>Add Course</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-info">

<div class="container mt-5">

    <div class="card shadow p-4 col-md-6 mx-auto">

        <h3 class="text-center mb-4">
            ${course.id == 0 ? "Add Course" : "Edit Course"}
        </h3>

        <form action="${pageContext.request.contextPath}/save" method="post">

            <input type="hidden" name="id" value="${course.id}">

            <div class="mb-3">
                <label>Course Name</label>
                <input type="text" name="name" class="form-control"
                       value="${course.name}" required>
            </div>

            <div class="mb-3">
                <label>Instructor</label>
                <input type="text" name="instructor" class="form-control"
                       value="${course.instructor}" required>
            </div>

            <div class="d-flex justify-content-between">
                <a href="${pageContext.request.contextPath}/" class="btn btn-secondary">Back</a>
                <button type="submit" class="btn btn-success">Save</button>
            </div>

        </form>

    </div>

</div>

</body>
</html>