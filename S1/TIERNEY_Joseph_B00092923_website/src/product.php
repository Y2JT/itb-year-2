<?php

class product
{
    public $id;
    public $name;
    public $price;
    public $image;
    public $description;

    function __construct($id, $name, $price, $image, $description) {
        $this->id = $id;
        $this->name = $name;
        $this->price = $price;
        $this->image = $image;
        $this->description = $description;
    }

}
