<!DOCTYPE html>
<html>
<head>
    <title> Change of Study Center Application - Confirmation </title>
</head>
<body>
    <center>
        <h1>Change of Study Center Application - Confirmation</h1>
        <p>Dear <%= request.getParameter("studentName") %>,</p>
        <p>Your request to change your study center from <%= request.getParameter("currentStudyCenter") %> to <%=
            request.getParameter("newStudyCenter") %> has been received and is under review.</p>
            <p>Thank you for your request.</p>
            <p><a href="study.jsp"> Back to main page </a></p>
        </center>
</body>
</html>