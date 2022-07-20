<html>

<head>
<title>First Web Application</title>
</head>

<body>
    Your Name is : ${username}
    <BR/>
    <BR/>
    Here are the list of your todos:
    ${filteredToDosList}
    <BR/>
    <BR/>
    Add a new note:
    <form:form method="post" modelAttribute="note">
        Note description: <input type="text" name="description" />
        Target date: <input type="date" name="toDate" />
        Is done: <input type="checkbox" name="isDone" />
        <button>Save</button>
    </form:form>
</body>

</html>