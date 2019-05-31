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
  `userId` int NOT NULL,
  `privacyTypeId` int NOT NULL,
  `placeId` int NOT NULL,
  `post_content` text
);

ALTER TABLE `Posts` ADD FOREIGN KEY (`userId`) REFERENCES `Users` (`id`);

ALTER TABLE `Posts` ADD FOREIGN KEY (`privacyTypeId`) REFERENCES `PrivaryTypes` (`id`);

ALTER TABLE `Posts` ADD FOREIGN KEY (`placeId`) REFERENCES `Places` (`id`);
