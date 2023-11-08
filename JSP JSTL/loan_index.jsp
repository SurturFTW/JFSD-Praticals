<!DOCTYPE html>
<html>
<head>
    <title>Loan Calculator</title>
</head>
<body>
    <Center>
        <h1>Loan Calculator</h1>
        <form action="calculate.jsp" method="post">
            <label for="loanAmount">Principal Loan Amount:</label>
            <input type="text" id="loanAmount" name="loanAmount" required><br><br>
            <label for="loanPeriod">Period of Time (in years):</label>
            <input type="text" id="loanPeriod" name="loanPeriod" required><br><br>
            <input type="submit" value="Calculate">
        </form>
    </Ceter>
</body>
</html>
