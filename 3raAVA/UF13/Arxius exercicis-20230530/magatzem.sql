

--
-- Base de dades`magatzem`
--
DROP DATABASE IF EXISTS magatzem;
CREATE DATABASE magatzem CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE magatzem;





--
-- Estructura de taula `productes`
--

CREATE TABLE `productes` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `preu` int unsigned NOT NULL,
  `actiu` tinyint(1) NOT NULL,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB;


--
-- Estructura de taula `totals`
--

CREATE TABLE `totals`(
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT CURRENT_TIMESTAMP,
  `total` int unsigned NOT NULL,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB;


--
-- Dades de la taula `productes`
--

INSERT INTO `productes` (`nom`, `preu`,`actiu`) VALUES
('Pera', 10, 1),
('Poma', 20, 0),
('Carxofa', 15, 0),
('Tàperes', 17, 1);


