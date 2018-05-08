<?php
$pageTitle = 'merchandise page';

$indexLinkStyle = '';
$aboutLinkStyle = '';
$listLinkStyle = 'current_page';
$contactLinkStyle = '';
$sitemapLinkStyle = '';

require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';

?>
<h1>Merchandise</h1>
    <table>
        <tr>
            <th>ID: </th>
            <th>Name: </th>
            <th>Price: </th>
            <th></th>
            <th></th>
            <th>update</th>
            <th>delete</th>
        </tr>

        <?php foreach($products as $product): ?>

            <tr>
                <td> <?= $product[0] ?></td>
                <td> <?= $product[1] ?></td>
                <td>&euro; <?= $product['price'] ?></td>
                <td><a href="index.php?action=show&id=<?= $product['id'] ?>">
                        (details)</a></td>
                <td><a href="index.php?action=addToCart&id=<?= $product['id'] ?>">(add to cart)</a></td>
                <td><a href="index.php?action=showUpdateProduct&id=<?= $product['id'] ?>">
                        (UPDATE)</a></td>
                <td><a href="index.php?action=deleteProduct&id=<?= $product['id'] ?>">
                        (DELETE)</a></td>
            </tr>

        <?php endforeach; ?>
    </table>

<h3>Shopping Cart</h3>
<table>
    <tr>
        <th>Product</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>sub-total</th>
        <th>(remove)</th>
    </tr>
<?php
//-----------------------------
$total = 0;

foreach($shoppingCart as $id=>$quantity):

    $product = get_one_product($id);
    $price = $product['price'];
    $subTotal = $price * $quantity;
    $total += $subTotal;
//-----------------------------
?>
    <tr>
    <td><?= $product['description'] ?></td>
    <td>&euro; <?= $price ?></td>
    <td><?= $quantity ?></td>
    <td><?= $subTotal ?></td>
    <td><a href="/list.php?action=removeFromCart&id=<?= $product['id'] ?>">(remove from cart)</a></td>

    </tr>
<?php endforeach; ?>
</table>
    <form
        action="index.php"
        method="get"
    >
        <input type="hidden" name="action" value="showNewProductForm">
        <input type="submit" value="Create New Product">

    </form>
<?php
require_once __DIR__ . '/../templates/_footer.php';