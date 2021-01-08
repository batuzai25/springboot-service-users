INSERT INTO usuarios (username, password, enable, nombre, apellido, email,create_at) VALUES ('adelmo','$2a$10$PV78NNpPvovJG.v.6S//WuY3c3GVRagh3jlzMnU8UaEKB0EMkNh3.',true, 'Adelmo', 'Martinez','Amartinez@am.com',NOW());
INSERT INTO usuarios (username, password, enable, nombre, apellido, email,create_at) VALUES ('admin','$2a$10$nHjksNaSoHC6/wrEZjDtqukqxy5vdU7bgmN5wiEDkyK4c/dKoe8/i',true, 'John', 'Doe','jhon.doe@bolsadeideas.com',NOW());


INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (user_id, role_id) VALUES (2, 1);




