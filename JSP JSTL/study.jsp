<!DOCTYPE html>
<html>
<head>
    <title>Change of Study Center Application</title>
</head>
<body>
    <center>
        <h1>Change of Study Center Application</h1>
        <form action="confirmation.jsp" method="post">
            <label for="studentName">Student Name:</label>
            <input type="text" id="studentName" name="studentName" required><br><br>
            <label for="currentStudyCenter">Current Study Center:</label>
            <input type="text" id="currentStudyCenter" name="currentStudyCenter" required><br><br>
            <label for="newStudyCenter">New Study Center:</label>
            <input type="text" id="newStudyCenter" name="newStudyCenter" required><br><br>
            <input type="submit" value="Submit">
        </form>
    </center>
</body>
</html>