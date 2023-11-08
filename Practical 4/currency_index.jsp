<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
    <h1>Currency Converter</h1>
    <p>Enter the amount to be converted and select the currencies:</p>
    <form action="convert.jsp" method="post">
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required><br><br>
                <label for="fromCurrency">From Currency:</label>
                <select id="fromCurrency" name="fromCurrency">
                    <option value="INR">INR</option>
                    <option value="USD">USD</option>
                    <option value="EUR">EUR</option>
                    <option value="GBP">GBP</option>
                </select><br><br>
 
                <label for="toCurrency">To Currency:</label>
                <select id="toCurrency" name="toCurrency">
                    <option value="INR">INR</option>
                    <option value="USD">USD</option>
                    <option value="EUR">EUR</option>
                    <option value="GBP">GBP</option>
                </select><br><br>
                <input type="submit" value="Convert">
        </form>
</body>
</html>
