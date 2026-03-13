<?php
class MyClass {
	// code will go here
}
$object1 = new MyClass();
echo "\$object1 is an ".gettype($object1).".<br/>";

if (is_object($object1)) {
	echo "Really! I swear \$object1 is an object!";
}
?>