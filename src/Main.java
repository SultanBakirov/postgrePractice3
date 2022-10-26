public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        create database postgre_practice3;
//
//        create table person(
//                id serial primary key,
//                name varchar(50) not null,
//                age smallint not null,
//                address varchar(50) not null,
//                car_id int references cars(id)
//);
//
//        insert into person(name, age, address, car_id)
//        values ('Eldiar', 18, 'Grazhdanskaya 119', 1),
//                ('Argen', 22, 'Chuy 15', 4),
//        ('Nurkyz', 20, 'Gogolya 1', 2);
//
//        insert into person(name, age, address)
//        values ('Abdirazak', 25, 'Ahunbaeva 119'),
//                ('Nurislam', 30, 'Abaya 15'),
//        ('Cholpon', 28, 'Karl Marks 1');
//
//        create table cars(
//                id serial primary key,
//                car_model varchar(50) not null,
//                car_color varchar(50) not null,
//                car_number varchar(25) not null
//);
//
//        insert into cars(car_model, car_number, car_color)
//        values ('honds fit', '01 KG 312', 'black'),
//                ('rolls roys', '02 KG 111', 'white'),
//        ('range rover', '03 KG 001', 'yellow'),
//        ('nissan gtr', '04 KG 777', 'pink'),
//        ('mercedes s600', '05 KG 123', 'gray');
//
//        select p.name, c.car_model, c.car_number from person p join cars c on p.car_id = c.id
//        order by p.age desc;
//
//        select p.name, c.car_model, c.car_number from person p left join cars c on p.car_id = c.id;
//
//        select p.name, c.car_model, c.car_number from person p right join cars c on p.car_id = c.id;
//
//        select p.name, c.car_model, c.car_number from person p full join cars c on p.car_id = c.id;
//
//        create table products(
//                id serial primary key,
//                product_name varchar(50) not null,
//                company varchar(20) not null,
//                product_amount int default 0,
//                price numeric not null
//);
//
//        create table customers(
//                id serial primary key,
//                name varchar(30) not null
//);
//
//        create table orders(
//                id serial primary key,
//                product_id int references products(id),
//                customer_id int references customers(id),
//                created_at date not null,
//                product_count int default 1,
//                price numeric not null
//);
//
//        insert into customers(name)
//        values ('Eldiar'),
//                ('Argen'),
//                ('Samarbek'),
//                ('Azimbek'),
//                ('Sapar'),
//                ('Abdirazak');
//
//        insert into products(product_name, company, product_amount, price)
//        values ('MackBook air', 'apple', 5, 1000),
//                ('Inspiron 5500', 'Dell', 10, 600),
//        ('AirDots', 'Xiaomi', 50, 25),
//        ('Crusher wireless', 'ScullCandy', 20, 100),
//        ('Nokia 3310', 'Nokia', 100, 50);
//
//        insert into orders(product_id, customer_id, created_at, price)
//        VALUES (1, 2, '2022-10-12', 1000),
//                (3, 2, '2022-10-12', 200),
//        (4, 1, '2022-10-12', 1500),
//        (2, 2, '2022-10-12', 1000),
//        (5, 2, '2022-10-12', 12352);
//
//        select c.name, o.created_at, p.product_name from orders o join customers c on c.id = o.customer_id
//        inner join products p on o.product_id = p.id order by o.created_at;
//
//        insert into orders(product_id, customer_id, created_at, price)
//        VALUES ((select p.id from products p where product_name like 'MackBook air'),
//        (select c.id from customers c where c.name like 'Argen'),
//        '2022-10-12',
//                (select p.price from products p where product_name like 'MackBook air')),
//
//
//
//        ((select p.id from products p where product_name like 'Inspiron 5500'),
//        (select c.id from customers c where c.name like 'Sapar'),
//        '2022-10-12',
//                (select p.price from products p where product_name like 'Inspiron 5500')),
//
//
//
//        ((select p.id from products p where product_name like 'Crusher wireless'),
//        (select c.id from customers c where c.name like 'Eldiar'),
//        '2022-10-12',
//                (select p.price from products p where product_name like 'Crusher wireless')),
//
//
//
//        ((select p.id from products p where product_name like 'Nokia 3310'),
//        (select c.id from customers c where c.name like 'Samarbek'),
//        '2022-10-12',
//                (select p.price from products p where product_name like 'Nokia 3310')),
//
//
//
//        ((select p.id from products p where product_name like 'AirDots'),
//        (select c.id from customers c where c.name like 'Abdirazak'),
//        '2022-10-12',
//                (select p.price from products p where product_name like 'AirDots'));
    }
}