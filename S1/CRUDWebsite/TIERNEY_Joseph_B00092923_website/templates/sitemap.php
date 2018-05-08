<?php
$pageTitle = 'site map page';

$indexLinkStyle = '';
$aboutLinkStyle = '';
$listLinkStyle = '';
$contactLinkStyle = '';
$sitemapLinkStyle = 'current_page';

require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';

//-------------------------------------------
?>

    <h1>
        Site Map
    </h1>

    <ul>
        <li><a href="/?action=index" class="<?= $indexLinkStyle ?>">Home</a>
        <li><a href="/?action=about" class="<?= $aboutLinkStyle ?>">About</a>
        <li><a href="/?action=list" class="<?= $listLinkStyle ?>">Merchandise</a>
        <li><a href="/?action=contact" class="<?= $contactLinkStyle ?>">Contact</a>
        <li><a href="/?action=sitemap" class="<?= $sitemapLinkStyle ?>">Site Map</a>
    </ul>


<?php
//-------------------------------------------
require_once __DIR__ . '/../templates/_footer.php';

//  don't close the PHP tags