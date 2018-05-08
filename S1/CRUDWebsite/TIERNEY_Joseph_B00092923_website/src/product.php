<?php

class product
{
    public $id;
    public $productName;
    public $price;
    public $image;
    public $description;

    function __construct($id, $productName, $price, $image, $description) {
        $this->id = $id;
        $this->name = $productName;
        $this->price = $price;
        $this->image = $image;
        $this->description = $description;
    }

}
