DELETE FROM user_roles;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password) VALUES
  ('User', 'user@yandex.ru', 'password'),
  ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 100000),
  ('ROLE_ADMIN', 100001);

INSERT INTO  meals (datetime,description,calories,user_id) VALUES
('2020-01-30 12:55' , 'Ланч', 100, 100000),
('2020-01-30 14:55' , 'Обед', 500, 100000),
('2020-01-30 16:55' , 'Ужин', 500, 100000),
('2020-01-31 12:55' , 'Ланч', 100, 100001),
('2020-01-31 14:55' , 'Обед', 500, 100001),
('2020-01-31 16:55' , 'Ужин', 500, 100001);