<?php
$servername = "localhost:3306";
$username = "scrumteam3";
$password = "z64tfokibCy0NrKl";
$dbname = "...";
$conn = mysqli_connect($servername, $username, $password, $dbname);
if (!$conn) {
die("Connection failed: " . mysqli_connect_error());
}
?>
