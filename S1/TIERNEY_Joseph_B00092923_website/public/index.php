<?php

require_once __DIR__ . '/../src/main_controller.php';

$action = filter_input(INPUT_GET, 'action', FILTER_SANITIZE_STRING);

switch ($action){
    case 'about':
        about_action();
        break;

    case 'list':
        list_action();
        break;

    case 'contact':
        contact_action();
        break;

    case 'sitemap':
        sitemap_action();
        break;

    case 'addToCart':
        addToCart();
        break;

    case 'index':
        index_action();
}