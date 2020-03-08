-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 08, 2020 at 06:59 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `android`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` text NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `email`) VALUES
(1, 'a', '81dc9bdb52d04dc20036dbd8313ed055', 'a@gmail.com'),
(2, '', '232401bed6348c4dc144fb4c020ad490', 'rayef@gmail.com'),
(3, 'ra', '232401bed6348c4dc144fb4c020ad490', 'rayef@gmail.com'),
(4, 'rajb', '232401bed6348c4dc144fb4c020ad490', 'rayef@gmail.com'),
(5, 'e', 'e1671797c52e15f763380b45e841ec32', 'e@gmail.com'),
(6, 'ray', '202cb962ac59075b964b07152d234b70', 'ray@gmail.com'),
(7, 'R', 'e1e1d3d40573127e9ee0480caf1283d6', 'r@gmail.com'),
(8, 'tu', 'b6b4ce6df035dcfaa26f3bc32fb89e6a', 'tu@gmail.com'),
(9, 'u', '7b774effe4a349c6dd82ad4f4f21d34c', 'u@gmail.com'),
(10, 'rn', 'd67f249b90615ca158b1258712c3a9fc', 'rm'),
(11, 'ru', 'd67f249b90615ca158b1258712c3a9fc', 'rm@gmail.com'),
(12, 'rayef', '202cb962ac59075b964b07152d234b70', 'rayef123@gmail.com'),
(13, 'n', '7b8b965ad4bca0e41ab51de7b31363a1', 'n@gmail.com'),
(14, 'ef', 'feb78cc258bdc76867354f01c22dbe43', 'ef'),
(15, 'q', '7694f4a66316e53c8cdd9d9954bd611d', 'q@gmail.com'),
(16, 'qr', 'eb430691fe30d16070b5a144c3d3303c', 'qr@gmail.com'),
(17, 'ty', '36f3af6226e0b5303e19b824e7442272', 'ty@gmail.com'),
(18, 't', 'e358efa489f58062f10dd7316b65649e', 't'),
(19, 'h', '2510c39011c5be704182423e3a695e91', 'h@gmail.com'),
(20, 'shayara', 'e10adc3949ba59abbe56e057f20f883e', 'ahasanul.ha@gmail.com'),
(21, 'Rayeef', '7860d2eef9a59a1a9f1612a20233ecee', 'rayeef@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
