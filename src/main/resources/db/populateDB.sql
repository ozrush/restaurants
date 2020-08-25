DELETE
FROM user_roles;
DELETE
FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@gmail.com', 'Password'),
       ('Admin', 'admin@gmail.com', 'Password');

INSERT INTO user_roles (role, user_id)
VALUES ('ROLE_USER', 100000),
       ('ROLE_USER', 100001);
