CREATE TABLE `Users`
(
  `id` int UNIQUE PRIMARY KEY NOT NULL,
  `first_name` varchar(50),
  `last_name` text,
  `email` text,
  `phone` text,
  `password` text,
  `created_at` timestamp
);

CREATE TABLE `PrivaryTypes`
(
  `id` int UNIQUE PRIMARY KEY NOT NULL,
  `privacy_type` varchar(50),
  `description` text
);

CREATE TABLE `Places`
(
  `id` int UNIQUE PRIMARY KEY NOT NULL,
  `place_name` varchar(50),
  `latitude` double,
  `longitude` double
);

CREATE TABLE `Posts`
(
  `id` int UNIQUE PRIMARY KEY NOT NULL,
  `user_id` int NOT NULL,
  `privacy_type_id` int NOT NULL,
  `place_id` int NOT NULL,
  `post_content` text
);

ALTER TABLE `Posts` ADD FOREIGN KEY (`user_id`) REFERENCES `Users` (`id`);

ALTER TABLE `Posts` ADD FOREIGN KEY (`privacy_type_id`) REFERENCES `PrivaryTypes` (`id`);

ALTER TABLE `Posts` ADD FOREIGN KEY (`place_id`) REFERENCES `Places` (`id`);
