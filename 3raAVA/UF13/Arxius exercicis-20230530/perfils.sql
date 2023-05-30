

--
-- Base de dades`perfils`
--
DROP DATABASE IF EXISTS perfils;
CREATE DATABASE perfils CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE perfils;





--
-- Estructura de taula `contactes`
--

CREATE TABLE `contactes` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telefon` varchar(12) NOT NULL,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB;


