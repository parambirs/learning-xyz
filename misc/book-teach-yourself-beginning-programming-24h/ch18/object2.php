<?php
class MyCar {
	public $color = "silver";
	public $make = "Mazda";
	public $model = "Miata";
}
$car = new MyCar();
echo "I drive a: ".$car->color." ".$car->make." ".$car->model;
?>