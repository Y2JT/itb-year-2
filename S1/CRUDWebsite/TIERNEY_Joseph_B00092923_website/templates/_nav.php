<?php
if (empty($indexLinkStyle)){
    $indexLinkStyle = '';
}
if (empty($aboutLinkStyle)){
    $aboutLinkStyle = '';
}
if (empty($listLinkStyle)){
    $listLinkStyle = '';
}
if (empty($contactLinkStyle)){
    $contactLinkStyle = '';
}
if (empty($sitemapLinkStyle)){
    $sitemapLinkStyle = '';
}
?>

<nav>
    <ul>
        <li>
            <a href="/?action=index" class="<?= $indexLinkStyle ?>">Home</a>
        </li>

        <li>
            <a href="/?action=about" class="<?= $aboutLinkStyle ?>">About</a>
        </li>

        <li>
            <a href="/?action=list" class="<?= $listLinkStyle ?>">Merchandise</a>
        </li>

        <li>
            <a href="/?action=contact" class="<?= $contactLinkStyle ?>">Contact</a>
        </li>

        <li>
            <a href="/?action=sitemap" class="<?= $sitemapLinkStyle ?>">Site Map</a>
        </li>
    </ul>
</nav>
