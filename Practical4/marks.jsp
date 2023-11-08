<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int java=Integer.parseInt(request.getParameter("Java"));
        int UXDD=Integer.parseInt(request.getParameter("UXDD"));
        int DWM=Integer.parseInt(request.getParameter("DWM"));
        int PPL=Integer.parseInt(request.getParameter("PPL"));
        int Project=Integer.parseInt(request.getParameter("pro"));
 
        int c=java+UXDD+DWM+PPL+Project;
        double avg=c/5;
 
        if(avg > 90 ){
            out.println("Congratulations, your grade is A");
        }else if (avg >= 80) {
            out.println("Congratulations, your grade is B");
        } else if (avg >= 70) {
            out.println("Congratulations, your grade is C");
        } else if (avg >= 60) {
            out.println("Congratulations, your grade is D");
        } else if (avg >= 35) {
            out.println("Congratulations, your grade is E");
        }
        else {
            out.println("You have failed to clear the exam");
        }
        %>
    </body>
</html>
