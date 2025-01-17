CREATE DATABASE IF NOT EXISTS `db-bolough` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `db-bolough`;

-- Create the `language` table
CREATE TABLE IF NOT EXISTS `language` (
    `id` INT PRIMARY KEY,
    `code` VARCHAR(10) NOT NULL,
    `name` VARCHAR(50) NOT NULL
);

-- Create the `kitab_ar` table
CREATE TABLE IF NOT EXISTS `kitab_ar` (
    `id` INT PRIMARY KEY,
    `audio` VARCHAR(255),
    `title` VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL
);

-- Create the `kitab_translation` table
CREATE TABLE IF NOT EXISTS `kitab_translation` (
    `id` INT PRIMARY KEY,
    `kitab_id` INT NOT NULL,
    `language_id` INT NOT NULL,
    `title` VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL,
    FOREIGN KEY (`kitab_id`) REFERENCES `kitab_ar`(`id`),
    FOREIGN KEY (`language_id`) REFERENCES `language`(`id`)
);

-- Create the `chapter_ar` table
CREATE TABLE IF NOT EXISTS `chapter_ar` (
    `id` INT PRIMARY KEY,
    `kitab_id` INT NOT NULL,
    `title` VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL,
    FOREIGN KEY (`kitab_id`) REFERENCES `kitab_ar`(`id`)
);

-- Create the `chapter_translation` table
CREATE TABLE IF NOT EXISTS `chapter_translation` (
    `id` INT PRIMARY KEY,
    `chapter_id` INT NOT NULL,
    `language_id` INT NOT NULL,
    `title` VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL,
    FOREIGN KEY (`chapter_id`) REFERENCES `chapter_ar`(`id`),
    FOREIGN KEY (`language_id`) REFERENCES `language`(`id`)
);

-- Insert data into `language` table
INSERT INTO `language` (`id`, `code`, `name`) VALUES
(1, 'en', 'english'),
(2, 'fr', 'french');

-- Insert data into `kitab_ar` table
INSERT INTO `kitab_ar` (`id`, `audio`, `title`) VALUES
(1, '', 'كِتَابُ الطَّهَارَةِ');

-- Insert data into `kitab_translation` table
INSERT INTO `kitab_translation` (`id`, `kitab_id`, `language_id`, `title`) VALUES
(1, 1, 1, 'The Book of Purification'),
(2, 1, 2, 'Le Livre de la Purification');

-- Insert data into `chapter_ar` table
INSERT INTO `chapter_ar` (`id`, `kitab_id`, `title`) VALUES
(1, 1, 'بَابُ الْمِيَاهِ');

-- Insert data into `chapter_translation` table
INSERT INTO `chapter_translation` (`id`, `chapter_id`, `language_id`, `title`) VALUES
(1, 1, 1, 'Chapter 1. Water'),
(2, 1, 2, 'Chapitre 1. les eaux');