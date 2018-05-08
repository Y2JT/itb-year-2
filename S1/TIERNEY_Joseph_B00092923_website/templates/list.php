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

    <table>
        <tr>
            <th>ID: </th>
            <th>Name: </th>
            <th>Price: </th>
            <th></th>
        </tr>

        <?php foreach($products as $product): ?>

            <tr>
                <td> <?= $product[0] ?></td>
                <td> <?= $product[1] ?></td>
                <td>&euro; <?= $product['price'] ?></td>
                <td><a href="/index.php?action=addToCart&id=<?= $product['id'] ?>">(add to cart)</a></td>
            </tr>

        <?php endforeach; ?>
    </table>

<?php
require_once __DIR__ . '/_footer.php';