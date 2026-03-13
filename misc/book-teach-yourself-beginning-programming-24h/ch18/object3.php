<?php
class MyClass {
	public $name = "John";
	function sayHello() {
		echo "HELLO! My name is ".$this->name;
	}
}
$object1 = new MyClass();
$object1->sayHello();
?>