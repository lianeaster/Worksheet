<html>
    <title>Worksheet</title>
    <body>
        <% String firstName = (String) session.getAttribute("first_name");
            String lastName = (String) session.getAttribute("last_name");
            String age = (String) session.getAttribute("age");
            Integer petsCount = (Integer) session.getAttribute("pets_count");
            Integer citizenCount = (Integer) session.getAttribute("citizen_count");
            if ((firstName == null || "".equals(firstName))&&(lastName == null || "".equals(lastName))) { %>
        <table>
            <tr>
                <td>
                    <h3>First name*<Br>
                        Last name*<Br>
                        Age<Br>
                        Do you have a pet?<Br>
                        Is your birth city is Kiev?<Br>
                    </h3>
                </td>
                <td>
                    <form id="form1" action="/sendForm" method="POST"><Br>
                        <input type="text" name="first name" form="form1"/><Br>
                        <input type="text" name="last name" form="form1"/><Br>
                        <input type="text" name="age" form="form1"/><Br>
                        <input type="radio" name="pet" value="yes">yes
                        <input type="radio" name="pet" value="no">no<Br>
                        <input type="radio" name="city" value="yes">yes
                        <input type="radio" name="city" value="no">no<Br>
                        <input type="submit" form="form1" value="Submit"/>
                    </form>
                </td>
            </tr>
        </table>
        <span>*-mandatory fields</span>
        <% } else { %>
        <h3>Your name is: <%= firstName %></h3>
        <h3>Your surname is: <%= lastName %></h3>
        <h3>Your age is: <%= age %></h3>
        <h3>How many people has a pet: <%= petsCount %></h3>
        <h3>How many people born in Kiev: <%= citizenCount %></h3>
        <a href="/sendForm?b=goBack">go back</a>
        <% } %>
    </body>
</html>
