INSERT INTO chat.users (login, password) VALUES ('Tmiranda', 'qwerty1');
INSERT INTO chat.users (login, password) VALUES ('Vaustin', 'ads');
INSERT INTO chat.users (login, password) VALUES ('Margarita', 'zxc');
INSERT INTO chat.users (login, password) VALUES ('Karina', 'rty0');
INSERT INTO chat.users (login, password) VALUES ('Mseastar', 'hjd');

INSERT INTO chat.chatrooms (name, owner) VALUES ('general', 1);
INSERT INTO chat.chatrooms (name, owner) VALUES ('random', 1);
INSERT INTO chat.chatrooms (name, owner) VALUES ('report', 1);
INSERT INTO chat.chatrooms (name, owner) VALUES ('help', 2);
INSERT INTO chat.chatrooms (name, owner) VALUES ('news', 2);

INSERT INTO chat.messages (author, room, message_text) VALUES (3, 1, 'hello');
INSERT INTO chat.messages (author, room, message_text) VALUES (2, 5, 'world');
INSERT INTO chat.messages (author, room, message_text) VALUES (4, 4, 'Hi');
INSERT INTO chat.messages (author, room, message_text) VALUES (2, 2, 'new message');
INSERT INTO chat.messages (author, room, message_text) VALUES (1, 3, 'sos');