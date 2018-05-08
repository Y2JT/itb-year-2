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
    echo "
    <div class='product'>
        <form method='post' action='../templates/list.php'>
            Name: <input type='text' name='name'/>
            Price: <input type='number' name='price'/>
            <input type='submit' value='Create'/>
        </form>
    </div>";

    $connection = connect_to_db();
    // SQL query
    $sql = 'SELECT * FROM product';

    // execute query and collect results
    $statement= $connection->query($sql);
    $products = $statement->fetchAll();


    return $products;
}

function get_one_product($id)
{
    $connection = connect_to_db();

    $sql = "SELECT * FROM products WHERE id=$id";
    $statement = $connection->query($sql);

    if ($row = $statement->fetch()) {
        return $row;
    } else {
        return null;
    }
}


