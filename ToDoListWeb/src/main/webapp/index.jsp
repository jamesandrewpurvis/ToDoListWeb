<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">

    <title>ToDoList</title>
  </head>
  <body>
    <div class="container">
      <header class="d-flex justify-content-center py-3">
        <ul class="nav nav-pills">
          <li class="nav-item"><a href="index.jsp" class="nav-link active" aria-current="page">Home</a></li>
          <li class="nav-item"><a href="add.jsp" class="nav-link">Add Item</a></li>
          <li class="nav-item"><a href="delete.jsp" class="nav-link">Delete Item</a></li>
          <li class="nav-item"><a href="view.jsp" class="nav-link">View The List</a></li>
        </ul>
      </header>
    </div>
    <div class="container px-4 py-5" id="hanging-icons">
      <h2 class="pb-2 border-bottom">ToDoList Application</h2>
      <div class="row g-4 py-5 row-cols-1 row-cols-lg-3">
        <div class="col d-flex align-items-start">
          <div class="icon-square bg-light text-dark flex-shrink-0 me-3">
            <svg class="bi" width="1em" height="1em"><use xlink:href="#toggles2"></use></svg>
          </div>
          <div>
            <h2>Add Item</h2>
            <p>Add items to your ToDoList dynamically! Keep track of things all at once.</p>
            <a href="add.jsp" class="btn btn-primary">
              Add Item
            </a>
          </div>
        </div>
        <div class="col d-flex align-items-start">
          <div class="icon-square bg-light text-dark flex-shrink-0 me-3">
          </div>
          <div>
            <h2>Delete Item</h2>
            <p>Plans, changed? It happens. Delete something from your ToDoList.</p>
            <a href="delete.jsp" class="btn btn-primary">
              Delete Item
            </a>
          </div>
        </div>
        <div class="col d-flex align-items-start">
          <div class="icon-square bg-light text-dark flex-shrink-0 me-3">
          </div>
          <div>
            <h2>View List</h2>
            <p>A list is kind-of useless if you can't view it! View your list.</p>
            <a href="view.jsp" class="btn btn-primary">
              View List
            </a>
          </div>
        </div>
      </div>
    </div>
    
    <div class="container">
      <footer class="py-3 my-4">
        <p class="text-center text-muted">&COPY; 2021 ToDoList</p>
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