<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Conversion Result</title>
</head>
<body>
    <h1>Currency Conversion Result</h1>
    <%
    double amount = Double.parseDouble(request.getParameter("amount"));
    String fromCurrency = request.getParameter("fromCurrency");
    String toCurrency = request.getParameter("toCurrency");
    double rate = 0.0;
    if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
    rate = 83.30;
    } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
    rate = 0.73;
    } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
    rate = 83.03;
    } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
    rate = 1.18;
    } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
    rate = 0.86;
    } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
    rate = 89.03;
    } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
    rate = 1.37;
    } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
    rate = 1.17;
    } else if (fromCurrency.equals("GBP") && toCurrency.equals("INR")) {
    rate = 103.10;
    } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
    rate = 0.012;
    } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
    rate = 0.011;
    } else if (fromCurrency.equals("INR") && toCurrency.equals("GBP")) {
    rate = 0.0097;
    }
    
    double convertedAmount = amount * rate;
    %>
    <h2>Conversion Result:</h2>
    <p><strong> Amount: </strong> <%= amount %> <%= fromCurrency %></p>
    <p><strong> Converted Amount: </strong> <%= convertedAmount %> <%= toCurrency %></p>
    <p><a href="Currency_converter_index.jsp"> Back to Converter </a></p>
</body>
</html>