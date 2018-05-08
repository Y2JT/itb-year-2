<?php
$pageTitle = 'about page';

$indexLinkStyle = '';
$aboutLinkStyle = 'current_page';
$listLinkStyle = '';
$contactLinkStyle = '';
$sitemapLinkStyle = '';

require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';

//-------------------------------------------
?>

    <h1>
       Cast
    </h1>
    <p><img src="../images/cast1.jpg" alt="batman and alfred"></p>
    <p><img src="../images/cast2.jpg" alt="joker and gordon"></p>
    <p><img src="../images/cast3.jpg" alt="two-face and rachel"></p>
    <p><img src="../images/cast4.jpg" alt="lucius"></p>


<?php
//-------------------------------------------
require_once __DIR__ . '/../templates/_footer.php';

//  don't close the PHP tags