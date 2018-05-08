<?php
$pageTitle = 'home page';

$indexLinkStyle = 'current_page';
$aboutLinkStyle = '';
$listLinkStyle = '';
$contactLinkStyle = '';
$sitemapLinkStyle = '';

require_once __DIR__ . '/../templates/_header.php';
require_once __DIR__ . '/../templates/_nav.php';
?>

    <h1>
        The Dark Knight
    </h1>

    <p>
        <i>The Dark Knight</i> is a 2008 superhero film. The Dark Knight was directed, produced and co-written by Christopher Nolan.
        Featuring DC Comics most iconic hero, Batman, the film is the second movie in Nolan's Dark Knight Trilogy, and the sequel
        to the critically acclaimed <i>Batman Begins</i>.
        <br><br>
        A psychotic young criminal, who dubs himself "The Clown Prince of Crime", the Joker strolls into town and throws Gotham into chaos.
        Batman, with the help of his allies Lt. Jim Gordon and DA Harvey Dent must find a way to end his madness before it's too late.
        <br><br>
        <b>Starring:</b><br>
        Christian Bale, Michael Caine, Heath Ledger, Gary Oldman, Morgan Freeman, Aaron Eckhart and Maggie Gyllenhaal.<br><br>
    <div style="text-align: center">
    <iframe width="570" height="315" src="https://www.youtube.com/embed/EXeTwQWrcwY" frameborder="2" allowfullscreen></iframe></div>
    </p>
<?php

require_once __DIR__ . '/../templates/_footer.php';