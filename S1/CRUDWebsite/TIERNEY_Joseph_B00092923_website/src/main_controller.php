<?php

require_once __DIR__ . '/../src/functions.php';

function index_action(){
    $pageTitle = 'home page';

    require_once __DIR__ . '/../templates/index.php';
}

function about_action(){
    $pageTitle = 'about page';

    require_once __DIR__ . '/../templates/about.php';
}

function list_action(){
    $pageTitle = 'merchandise';

    $shoppingCart = getShoppingCart();
    $products = get_all_products();

    require_once __DIR__ . '/../templates/list.php';
}

function contact_action(){
    $pageTitle = "contact";

    require_once __DIR__ . '/../templates/contact.php';
}

function details_action(){
    $pageTitle = "details";

    require_once __DIR__ . '/../templates/details.php';
}

function addToCart()
{
    // get the ID of product to add to cart
    $id = filter_input(INPUT_GET, 'id', FILTER_SANITIZE_NUMBER_INT);

    // get the cart array
    $shoppingCart = getShoppingCart();

    // default is old total is zero
    $oldTotal = 0;

    // if quantity found in cart array, then use this
    if(isset($shoppingCart[$id])){
        $oldTotal = $shoppingCart[$id];
    }

    // store old total + 1 as new quantity into cart array
    $shoppingCart[$id] = $oldTotal + 1;

    // store new  array into SESSION
    $_SESSION['shoppingCart'] = $shoppingCart;

    // redirect display page
    list_action();
}

function removeFromCart()
{
    // get the ID of product to add to cart
    $id = filter_input(INPUT_GET, 'id', FILTER_SANITIZE_NUMBER_INT);

    // get the cart array
    $shoppingCart = getShoppingCart();

    // remove entry for this ID
    unset($shoppingCart[$id]);

    // store new  array into SESSION
    $_SESSION['shoppingCart'] = $shoppingCart;

    // redirect display page
    list_action();
}

function getShoppingCart()
{
    if (isset($_SESSION['shoppingCart'])){
        return $_SESSION['shoppingCart'];
    } else {
        return [];
    }
}

function sitemap_action(){
    $pageTitle = "site map";

    require_once __DIR__ . '/../templates/sitemap.php';
}

function get_one_product($connection, $id)
{
    $sql = "SELECT * FROM product WHERE id=$id";
    $statement = $connection->query($sql);

    if ($row = $statement->fetch()) {
        return $row;
    } else {
        return null;
    }
}

function delete_product($connection, $id)
{
    $sql = "DELETE FROM product WHERE id=$id";

    $numRowsAffected = $connection->exec($sql);

    // can set Boolean variable in a single statement
    // 	$queryWasSuccessful = ($numRowsAffected > 0);

    if($numRowsAffected > 0){
        $queryWasSuccessful = true;
    } else {
        $queryWasSuccessful = false;
    }

    return $queryWasSuccessful;
}

function create_product($connection, $name, $price)
{
    $sql = "INSERT into product (productName, price) VALUES ('$name', $price)";

    $numRowsAffected = $connection->exec($sql);

    // can set Boolean variable in a single statement
    // 	$queryWasSuccessful = ($numRowsAffected > 0);

    if($numRowsAffected > 0){
        $queryWasSuccessful = true;
    } else {
        $queryWasSuccessful = false;
    }

    return $queryWasSuccessful;
}

function update_product($connection, $id, $name, $price)
{
    $sql = "UPDATE product SET productName = '$name', price = $price WHERE id=$id";

    $numRowsAffected = $connection->exec($sql);

    // can set Boolean variable in a single statement
    // 	$queryWasSuccessful = ($numRowsAffected > 0);

    if($numRowsAffected > 0){
        $queryWasSuccessful = true;
    } else {
        $queryWasSuccessful = false;
    }

    return $queryWasSuccessful;
}