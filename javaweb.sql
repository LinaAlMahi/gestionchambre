-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 22, 2022 at 01:05 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaweb`
--

-- --------------------------------------------------------

--
-- Table structure for table `chambre`
--

CREATE TABLE `chambre` (
  `idChambre` int(11) NOT NULL,
  `Numero` int(11) NOT NULL,
  `Type` varchar(255) NOT NULL,
  `tarif` double NOT NULL,
  `photo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chambre`
--

INSERT INTO `chambre` (`idChambre`, `Numero`, `Type`, `tarif`, `photo`) VALUES
(9, 1, 'Chambre Simple', 500, '20220120092356image3.jpg'),
(10, 2, 'Chambre Simple', 320, '20220120092332image2.jpg'),
(12, 3, 'Chambre Simple', 204, '20220120092648image1.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `idReservation` int(11) NOT NULL,
  `dateDebut` date NOT NULL,
  `DateFin` date NOT NULL,
  `prix` double DEFAULT NULL,
  `idUser` int(11) NOT NULL,
  `idChambre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`idReservation`, `dateDebut`, `DateFin`, `prix`, `idUser`, `idChambre`) VALUES
(1, '2022-01-14', '2022-01-20', 500, 2, 9),
(3, '2022-01-14', '2022-01-27', 6500, 2, 9),
(4, '2022-01-25', '2022-02-05', 3520, 2, 10);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL,
  `Nom` varchar(255) NOT NULL,
  `Prenom` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `etat` int(11) NOT NULL DEFAULT 0,
  `role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `Nom`, `Prenom`, `Email`, `Password`, `etat`, `role`) VALUES
(1, 'Al Mahi', 'Lina', 'Lina.Almahi@gmail.com', '1234', 1, 1),
(2, 'Al Mahi', 'Omar', 'omar@gmail.com', '123', 1, 2),
(3, 'almahi', 'kamal', 'kamal@gmail.com', '123', 1, 2),
(6, 'Al Mahi', 'khalil', 'khalil@gmail.com', '123', 2, 2),
(7, 'majida', 'majida', 'majida@gmail.com', '123456', 0, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chambre`
--
ALTER TABLE `chambre`
  ADD PRIMARY KEY (`idChambre`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`idReservation`),
  ADD KEY `fkkk` (`idUser`),
  ADD KEY `fkkkkk` (`idChambre`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chambre`
--
ALTER TABLE `chambre`
  MODIFY `idChambre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `idReservation` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1005;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `fkkk` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fkkkkk` FOREIGN KEY (`idChambre`) REFERENCES `chambre` (`idChambre`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
