<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
    <title>Loan Calculation Result</title>
</head>
<body>
<center>
    <h1>Loan Calculation Result</h1>
    <%
    double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
    int loanPeriod = Integer.parseInt(request.getParameter("loanPeriod"));
    double annualInterestRate = 0.0;
    
    if (loanPeriod >= 1 && loanPeriod <= 7) {
        annualInterestRate = 5.35;
    } else if (loanPeriod >= 8 && loanPeriod <= 15) {
        annualInterestRate = 5.5;
    } else if (loanPeriod >= 16 && loanPeriod <= 30) {
        annualInterestRate = 5.75;
    }
 
    double monthlyInterestRate = annualInterestRate / 12 / 100;
    int totalPayments = loanPeriod * 12;
    double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, - totalPayments));
 
    // Create a DecimalFormat object to format numbers with 2 decimal places
    DecimalFormat df = new DecimalFormat("#.00");
    out.println("<h2>Loan Details:</h2>");
    out.println("<p>Principal Loan Amount: Rs " + df.format(loanAmount) + "</p>");
    out.println("<p>Loan Period: " + loanPeriod + " years</p>");
    out.println("<p>Annual Interest Rate: " + annualInterestRate + "%</p>");
    out.println("<p>Monthly Payment: Rs " + df.format(monthlyPayment) + "</p>");
 
    double remainingBalance = loanAmount;
 
    out.println("<h2>Payment Schedule:</h2>");
    out.println("<table border='1'>");
    out.println("<tr><th> Payment Number </th><th> Payment Amount </th><th> Interest Paid </th><th> Principal Paid </th><th> Remaining Balance </th></tr>");
 
    for (int i = 1; i <= totalPayments; i++) {
        double interestPaid = remainingBalance * monthlyInterestRate;
        double principalPaid = monthlyPayment - interestPaid;
        remainingBalance -= principalPaid;
        out.println("<tr><td>" + i + "</td><td>Rs" + df.format(monthlyPayment) + "</td><td>Rs" + 
            df.format(interestPaid) + "</td><td>Rs"+ df.format(principalPaid) + "</td><td> Rs"+ df.format(remainingBalance) +"</td></tr>");
    }
    out.println("</table>");
    %>
 
    <p><a href="Loan_Calculator_index.jsp">Back to Loan Calculator</a></p>
</center>
</body>
</html>
