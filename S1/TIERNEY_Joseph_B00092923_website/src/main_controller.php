<?php

require_once __DIR__ . '/../src/functions.php';

function index_action(){

    $shoppingCart = getShoppingCart();
    $products = get_all_products();

    $pageTitle = 'home page';

    require_once __DIR__ . '/../templates/index.php';
}

function about_action(){
    $pageTitle = 'about page';

    require_once __DIR__ . '/../templates/about.php';
}

function list_action(){
    $pageTitle = 'merchandise';

    $products = get_all_products();

    require_once __DIR__ . '/../templates/list.php';
}

function contact_action(){
    $pageTitle = "contact";

    require_once __DIR__ . '/../templates/contact.php';
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
    index_action();
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
    index_action();
}

function getShoppingCart()
{
    if (isset($_SESSION['shoppingCart'])){
        return $_SESSION['shoppingCart'];
    } else {
        return [];
    }
}

function forgetSession()
{
    killSession();

    // redirect to display text
    indexAction();
}

function sitemap_action(){
    $pageTitle = "site map";

    require_once __DIR__ . '/../templates/sitemap.php';
}