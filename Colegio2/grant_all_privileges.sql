/*alter user 'root'@'localhost' identified with native_password by 'root';*/
grant all privileges on *.* to 'root'@'localhost';
flush privileges;