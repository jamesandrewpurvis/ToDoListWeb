
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <link href="css/todo-style.css" rel="stylesheet">
    <title>ToDoList</title>
  </head>
  <body>
    <div class="container">
      <header class="d-flex justify-content-center py-3">
        <ul class="nav nav-pills">
          <li class="nav-item"><a href="index.jsp" class="nav-link">Home</a></li>
          <li class="nav-item"><a href="add.jsp" class="nav-link active" aria-current="page">Add Item</a></li>
          <li class="nav-item"><a href="delete.jsp" class="nav-link">Delete Item</a></li>
          <li class="nav-item"><a href="view.jsp" class="nav-link">View The List</a></li>
        </ul>
      </header>
    </div>

    <div class="add-form">
    <form name="addItem" action="AddItem">
      <h3>Add Item</h3>
        <label for="formGroupExampleInput" class="form-label">Event Description</label>
        <input type="text" class="form-control" name="eventName" placeholder="Event Description">
        <br>
        <br>
        <label for="formGroupExampleInput2" class="form-label">Event Time</label>
        <input type="text" class="form-control" name="eventTime" placeholder=" MM/DD/YYYY - TIME">
        <br>
        <br>
        <button name="submitbutton" type="submit" class="btn btn-primary">Submit</button>
        </form>
                           
      </div>
      
    <div class="container">
      <footer class="py-3 my-4">
        <p class="text-center text-muted">� 2021 ToDoList</p>
      </footer>
    </div>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.min.js" integrity="sha384-PsUw7Xwds7x08Ew3exXhqzbhuEYmA2xnwc8BuD6SEr+UmEHlX8/MCltYEodzWA4u" crossorigin="anonymous"></script>
    -->
  </body>
</html>
</html>