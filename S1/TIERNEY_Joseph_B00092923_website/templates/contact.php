<?php
$pageTitle = 'contact page';

$indexLinkStyle = '';
$aboutLinkStyle = '';
$listLinkStyle = '';
$contactLinkStyle = 'current_page';
$sitemapLinkStyle = '';

require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';

?>

    <h1>
        Contact
    </h1>

    <h3>Address</h3>
    <p>
        4000 Warner Boulevard
        <br>
        Warner Bros. Studios,
        <br>
        Burbank,
        <br>
        California,
        <br>
        USA.
        <br>
    </p>

    <h3>Telephone</h3>
    <p>
        818-954-1744
    </p>

    <h3>Email</h3>
    <p>
        <a href="http://www.warnerbros.com/">enquiries@warnerbros.com</a>
    </p>

<?php
require_once __DIR__ . '/../templates/_footer.php';
