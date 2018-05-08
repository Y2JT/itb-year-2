SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

INSERT INTO `product` (`id`, `name`, `price`, `image`, `description`) VALUES
(1, 'DC Watch Collection: The Joker', 39.95, 'images/merch/watch.jpg', '"Why so serious?" It is always time for chaos with this stylish timepiece featuring Heath Ledger as the Joker.'')'),
(2, 'Agent of Chaos Canvas Wall Art', 42.46, 'images/merch/chaos.jpg', 'The Joker is ready to watch the world burn in this stunning piece of canvas wall art.'),
(3, 'Why So Serious? Poster Canvas Wall Art', 42.46, 'images/merch/serious.jpg', 'The terrifying Joker poster for the blockbuster film The Dark Knight is the basis for this stunning piece of canvas wall art.'),
(4, 'Batman Gauntlets', 16.95, 'images/merch/gloves.jpg', 'Complete your Batman costume with these gauntlets.'),
(5, 'Batman Belt', 17.95, 'images/merch/belt.jpg', 'Complete your Batman costume with this utility belt.'),
(6, 'Bats Logo Charcoal T-Shirt', 26.95, 'images/merch/batlogo.jpg', 'Features the Batman logo.'),
(7, 'The Dark Knight Blu-ray Steelbook', 19.98, 'images/merch/steelbookBR.jpg', 'Includes 30 minutes of extra footage and exclusive behind-the-scenes.'),
(8, 'The Dark Knight Blu-ray Standard', 14.97, 'images/merch/standardBR.jpg', 'No extras.');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
