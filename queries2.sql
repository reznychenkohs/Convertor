CREATE DATABASE sales_database;

show databases

use sales_database

CREATE TABLE sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product VARCHAR(50),
    price INT,
    quantity INT
);

select * FROM sales

INSERT INTO sales (product, price, quantity)
VALUES ('Laptop', 1000, 5),
       ('Phone', 700, 3),
       ('Tablet', 500, 2),
       ('Printer', 300, 4);

select * FROM sales

select * FROM sales LIMIT 2

SELECT SUM(price * quantity) AS Total FROM sales

select product, SUM(quantity) as total_quantity , AVG(price) as average_price FROM Sales GROUP BY product