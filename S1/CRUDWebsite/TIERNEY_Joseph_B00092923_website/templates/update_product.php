<?php
//-------- page header -------------------
$pageTitle = 'new product form';
require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';
//----------------------------------------
?>


<h1>Update product</h1>


<form
    action="index.php?action=showUpdateProduct"
    method="POST"
>
    <!-- ****** send ID, but don't let user see this ***** -->
    <input type="hidden" name="id" value="<?= $product['id'] ?>">

    <p>
        <label>Name:</label>
        <input type="text" name="name" value="<?= $product['productName'] ?>">
    </p>

    <p>
        <label>Price:</label>
        <input type="text" name="price" value="<?= $product['price'] ?>">
    </p>

    <input type="submit" value="Update Product">

</form>

<?php
require_once __DIR__ . '/../templates/_footer.php';