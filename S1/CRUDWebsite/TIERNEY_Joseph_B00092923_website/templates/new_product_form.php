<?php
//-------- page header -------------------
$pageTitle = 'new product form';
require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';
//----------------------------------------
?>
<h1>Create a new product</h1>

<form
    action="index.php?action=createNewProduct"
    method="POST"
>

    <p>
        <label>Name:</label>
        <input type="text" name="productName">
    </p>


    <p>
        <label>Price:</label>
        <input type="text" name="price">
    </p>

    <input type="submit" value="Create New Product">

</form>

<?php
require_once __DIR__ . '/../templates/_footer.php';