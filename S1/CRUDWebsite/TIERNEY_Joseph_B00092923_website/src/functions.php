<?php

define("DB_HOST", "localhost");
define("DB_USER", "root");
define("DB_PASSWORD", "root");
define("DB_DATABASE", "shop");

$db = mysqli_connect(DB_HOST, DB_USER, DB_PASSWORD, DB_DATABASE);

function connect_to_db()
{

    $dsn = 'mysql:host=' . DB_HOST . ';dbname=' . DB_DATABASE;

    // attempt to create a connection to the database
    try {
        $connection = new \PDO($dsn, DB_USER, DB_PASSWORD);
    } catch (\PDOException $e) {
        // deal with connection error
        print 'ERROR: there was a problem trying to create a connection to the database' . PHP_EOL;
        return null;
    }

    return $connection;
}

// Create product
function createProduct()
{
    if (isset($_POST["name"])) {
        $productName = $_POST['name'];
        $productPrice = $_POST['price'];

        $sql = "INSERT INTO `product` (`ID`, `Name`, `Price`)
                VALUES (NULL, '" . $productName . "', " . $productPrice . ")";
        connect_to_db()->query($sql);
    }
}

// Delete product
function deleteProduct()
{
    if(isset($_GET['delete'])) {
        $sql = "DELETE FROM `products` WHERE `products`.`ID` = " . $_GET['delete'];
        connect_to_db()->query($sql);
    }
}

function get_all_products()
{
    $connection = connect_to_db();
    // SQL query
    $sql = 'SELECT * FROM product';

    // execute query and collect results
    $statement= $connection->query($sql);
    $products = $statement->fetchAll();


    return $products;
}

function get_one_product_action()
{
    $connection = connect_to_db();

    $id = filter_input(INPUT_GET, 'id', FILTER_SANITIZE_NUMBER_INT);
    $product = get_one_product($connection, $id);

    if(null == $product){
        $message = 'sorry, no product with id = ' . $id . ' could be retrieved from the database';

        // output the detail of product in HTML table
        require_once __DIR__ . '/../templates/index.php';
    } else {
        // output the detail of product in HTML table
        require_once __DIR__ . '/../templates/details.php';
    }
}