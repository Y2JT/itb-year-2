<?php
//-------- page header -------------------
$pageTitle = 'merchandise details';

$indexLinkStyle = '';
$aboutLinkStyle = '';
$listLinkStyle = 'current_page';
$contactLinkStyle = '';
$sitemapLinkStyle = '';

require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';
//----------------------------------------
?>
<h2><a href="index.php?action=list">Back to Products</a></h2>
<h1>Product Details</h1>

<dl>
    <dt>ID</dt>
    <dd><?= $product['id'] ?></dd>

    <dt>Name</dt>
    <dd><?= $product['productName'] ?></dd>

    <dt>Price</dt>
    <dd><?= $product['price'] ?></dd>

    <dt>Description</dt>
    <dd><?= $product['description'] ?></dd>
</dl>