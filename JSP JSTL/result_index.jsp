<!DOCTYPE html>
<html>
    <head>
        <title>Result</title>
    </head>
    <body>
        <center>
            <h1>Student marks</h1>
            <form action="marks.jsp" method="get"> 
                Enter Marks in Java : <input type="number" oninput="if(this.value > 100) this.value = 100;"
                name="Java"> <br><br>

                Enter UXDD Marks : <input type="number" oninput="if(this.value > 100) this.value = 100;"
                name="UXDD"><br><br>
                
                Enter DWM Marks :<input type="number" oninput="if(this.value > 100) this.value = 100;"
                name="DWM"><br><br>

                Enter PPL Marks :<input type="number" oninput="if(this.value > 100) this.value = 100;"
                name="PPL"><br><br>

                Enter Project Marks :<input type="number" oninput="if(this.value > 100) this.value = 100;"
                name="pro"><br><br>

                <input type="submit">
            </form>
        </center>
    </body>
</html>
