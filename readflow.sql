-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.16-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for readflow
CREATE DATABASE IF NOT EXISTS `readflow` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `readflow`;

-- Dumping structure for table readflow.buku
CREATE TABLE IF NOT EXISTS `buku` (
  `buku_id` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(50) DEFAULT NULL,
  `pengarang` varchar(50) DEFAULT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  `tahun` int(11) DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `lokasi` varchar(50) DEFAULT NULL,
  `sampul` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`buku_id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table readflow.buku: ~39 rows (approximately)
REPLACE INTO `buku` (`buku_id`, `judul`, `pengarang`, `penerbit`, `tahun`, `kategori`, `lokasi`, `sampul`) VALUES
	(1, 'Matahari', 'Tere Liye', 'Gramedia Pustaka Utama', 2019, 'Fiksi', NULL, NULL),
	(2, 'Laskar Pelangi', 'Andrea Hirata', 'Bentang Pustaka', 2005, 'Fiksi', NULL, '2.jpg'),
	(3, 'Bumi Manusia', 'Pramoedya Ananta Toer', 'Hasta Mitra', 1980, 'Fiksi', NULL, NULL),
	(4, 'Ayat-Ayat Cinta', 'Habiburrahman El Shirazy', 'Republika Penerbit', 2004, 'Fiksi', NULL, NULL),
	(5, 'Sang Pemimpi', 'Andrea Hirata', 'Bentang Pustaka', 2006, 'Fiksi', NULL, NULL),
	(6, 'Harry Potter and the Sorcerer\'s Stone', 'J.K. Rowling', 'Bloomsbury Publishing', 1997, 'Fantasi', NULL, NULL),
	(7, 'Gadis Pantai', 'Pramoedya Ananta Toer', 'Hasta Mitra', 1985, 'Fiksi', NULL, NULL),
	(8, 'Dilan: Dia adalah Dilanku tahun 1990', 'Pidi Baiq', 'Dar! Mizan', 2014, 'Fiksi', NULL, NULL),
	(9, 'Negeri 5 Menara', 'Ahmad Fuadi', 'Gramedia Pustaka Utama', 2009, 'Fiksi', NULL, NULL),
	(10, 'Sang Alchemist', 'Paulo Coelho', 'HarperCollins', 1988, 'Fiksi', NULL, NULL),
	(11, 'Ayah', 'Andrea Hirata', 'Bentang Pustaka', 2011, 'Fiksi', NULL, NULL),
	(12, 'Lima Sekawan', 'Enid Blyton', 'Egmont Group', 1942, 'Petualangan', NULL, NULL),
	(13, 'Perahu Kertas', 'Dee Lestari', 'Bentang Pustaka', 2009, 'Fiksi', NULL, NULL),
	(14, 'Laut Bercerita', 'Leila S. Chudori', 'Kepustakaan Populer Gramedia', 2017, 'Fiksi', NULL, NULL),
	(15, 'Sang Pencerah', 'Andrea Hirata', 'Bentang Pustaka', 2005, 'Fiksi', NULL, NULL),
	(16, 'Tenggelamnya Kapal Van Der Wijck', 'Hamka', 'Balai Pustaka', 1938, 'Fiksi', NULL, NULL),
	(17, 'Hujan', 'Tere Liye', 'Gramedia Pustaka Utama', 2014, 'Fiksi', NULL, NULL),
	(18, 'Bumi', 'Tere Liye', 'Gramedia Pustaka Utama', 2004, 'Fiksi', NULL, NULL),
	(19, 'Senja di Jakarta', 'Mochtar Lubis', 'Balai Pustaka', 1950, 'Fiksi', NULL, NULL),
	(20, 'Sitti Nurbaya', 'Marah Rusli', 'Balai Pustaka', 1922, 'Fiksi', NULL, NULL),
	(21, 'asdas', 'ehdfhdf', NULL, NULL, NULL, NULL, NULL),
	(22, 'asda', 'asdgggg', NULL, NULL, NULL, NULL, NULL),
	(23, 'asd', 'asdgsdf', 'sdgsd', 123, 'Item 1', '', NULL),
	(24, 'aasdas', 'dfgdfg', 'afsdgsdf', 123, 'Item 4', '', NULL),
	(25, 'aasdas', 'dfgdfg', 'afsdgsdf', 123, 'Item 4', '', NULL),
	(26, 'aasdas', 'dfgdfg', 'afsdgsdf', 123, 'Item 4', '', NULL),
	(27, 'asdfassg', 'sdfsdf', 'asdasd', 1234, 'Item 3', '', NULL),
	(28, 'sdsdf', 'ADASDas', 'asfsdsdg', 12345, 'Item 3', '', NULL),
	(29, 'dfgdf', 'asdfsdf', 'asdasfg', 2331, 'Item 2', '', NULL),
	(30, 'sdfsd', 'asdas', 'gfhgf', 2113, 'Item 3', '', NULL),
	(31, 'asdas', 'dfsgsdf', 'asdasd', 2331, 'Item 1', '', '31.jpg'),
	(32, 'fasas', 'asdasd', 'sgdg', 2211, 'Item 3', '', NULL),
	(33, 'asdasad', 'sdfsdfsd', 'asdassad', 1233, 'Item 2', '', NULL),
	(34, 'assf', 'dfgdfgfd', 'werewr', 2331, 'Item 2', '', NULL),
	(35, 'dfgd', 'sdfsdf', 'erter', 2341, 'Item 2', '', '35.jpg'),
	(36, 'adasasd', 'dfgdfgg', 'asdasasasas', 2322, 'Item 3', '', '36.jpg'),
	(37, 'asdasd', 'sdsdsdf', 'sfqwewe', 2313, 'Item 1', '', '37.jpg'),
	(38, 'asdasasd', 'sdfgdfdfgdfgfd', 'qqwaqweq', 3213, 'Item 1', '', '38.jpg'),
	(39, 'asdasasd', 'sdfgdfdfgdfgfd', 'qqwaqweq', 3213, 'Item 1', '', '39.jpg'),
	(40, 'inijudul', 'pengarang', 'penerbit', 2003, 'Item 2', 'test lokasi', '40.jpg');

-- Dumping structure for table readflow.feedback
CREATE TABLE IF NOT EXISTS `feedback` (
  `feedback_id` int(11) NOT NULL AUTO_INCREMENT,
  `tanggal` date DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `feedback` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`feedback_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table readflow.feedback: ~0 rows (approximately)
REPLACE INTO `feedback` (`feedback_id`, `tanggal`, `username`, `feedback`) VALUES
	(1, '2023-05-26', 'ammar', 'test feedback');

-- Dumping structure for table readflow.member
CREATE TABLE IF NOT EXISTS `member` (
  `username` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `alamat` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table readflow.member: ~0 rows (approximately)
REPLACE INTO `member` (`username`, `nama`, `tgl_lahir`, `email`, `no_telp`, `alamat`) VALUES
	('ammar', 'test', '2023-05-01', 'asdasasasd', '1232121312123', 'asdasdasdasdasdasdasdas');

-- Dumping structure for table readflow.pinjam
CREATE TABLE IF NOT EXISTS `pinjam` (
  `pinjam_id` int(11) NOT NULL AUTO_INCREMENT,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `buku_id` int(11) DEFAULT NULL,
  `tgl_actual_kembali` date DEFAULT NULL,
  `denda` int(11) DEFAULT NULL,
  PRIMARY KEY (`pinjam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table readflow.pinjam: ~112 rows (approximately)
REPLACE INTO `pinjam` (`pinjam_id`, `tgl_pinjam`, `tgl_kembali`, `username`, `buku_id`, `tgl_actual_kembali`, `denda`) VALUES
	(1, '2023-05-23', '2023-06-06', 'ammar', 1, NULL, NULL),
	(2, '2023-05-23', '2023-06-06', 'septi', 5, NULL, NULL),
	(3, '2023-05-23', '2023-06-06', 'reza', 10, NULL, NULL),
	(4, '2023-05-23', '2023-05-06', 'marsya', 1, '2023-05-26', 40000),
	(5, '2023-05-23', '2023-04-06', 'marsya', 12, '2023-05-26', 50000),
	(6, '2023-05-23', '2023-06-06', 'ammar', 15, NULL, NULL),
	(7, '2023-05-23', '2023-06-06', 'ammar', 2, NULL, NULL),
	(8, '2023-05-24', '2023-06-07', 'ammar', 2, NULL, NULL),
	(9, '2024-05-23', '2024-06-06', 'ammar', 7, '2024-06-12', 12000),
	(10, '2024-03-29', '2024-04-12', 'ammar', 19, '2024-04-17', 10000),
	(11, '2023-05-29', '2023-06-12', 'ammar', 4, '2023-06-05', 0),
	(12, '2023-10-25', '2023-11-08', 'ammar', 12, '2023-11-05', 0),
	(13, '2023-10-17', '2023-10-31', 'ammar', 9, '2023-10-27', 0),
	(14, '2023-12-24', '2024-01-07', 'ammar', 12, '2024-01-08', 2000),
	(15, '2023-12-27', '2024-01-10', 'ammar', 11, '2024-01-07', 0),
	(16, '2023-10-30', '2023-11-13', 'ammar', 6, '2023-11-15', 4000),
	(17, '2024-04-16', '2024-04-30', 'ammar', 2, '2024-05-03', 6000),
	(18, '2023-09-11', '2023-09-25', 'ammar', 13, '2023-09-21', 0),
	(19, '2023-10-09', '2023-10-23', 'ammar', 20, '2023-10-27', 8000),
	(20, '2024-01-11', '2024-01-25', 'ammar', 8, '2024-01-21', 0),
	(21, '2024-02-18', '2024-03-03', 'ammar', 5, '2024-02-27', 0),
	(22, '2023-06-17', '2023-07-01', 'ammar', 11, '2023-07-02', 2000),
	(23, '2024-03-11', '2024-03-25', 'ammar', 19, '2024-03-31', 12000),
	(24, '2024-05-16', '2024-05-30', 'ammar', 10, '2024-06-06', 14000),
	(25, '2023-12-26', '2024-01-09', 'ammar', 9, '2024-01-11', 4000),
	(26, '2023-10-27', '2023-11-10', 'ammar', 9, '2023-11-12', 4000),
	(27, '2023-06-07', '2023-06-21', 'ammar', 14, '2023-06-25', 8000),
	(28, '2023-06-16', '2023-06-30', 'ammar', 7, '2023-06-28', 0),
	(29, '2024-04-01', '2024-04-15', 'ammar', 1, '2024-04-14', 0),
	(30, '2024-05-12', '2024-05-26', 'ammar', 18, '2024-05-28', 4000),
	(31, '2023-11-04', '2023-11-18', 'ammar', 8, '2023-11-18', 0),
	(32, '2023-10-01', '2023-10-15', 'ammar', 7, '2023-10-19', 8000),
	(33, '2023-08-28', '2023-09-11', 'ammar', 6, '2023-09-09', 0),
	(34, '2024-03-11', '2024-03-25', 'ammar', 4, '2024-03-26', 2000),
	(35, '2023-08-09', '2023-08-23', 'ammar', 2, '2023-08-24', 2000),
	(36, '2024-03-26', '2024-04-09', 'ammar', 18, '2024-04-03', 0),
	(37, '2023-09-24', '2023-10-08', 'ammar', 17, '2023-10-05', 0),
	(38, '2024-04-11', '2024-04-25', 'ammar', 11, '2024-04-21', 0),
	(39, '2023-12-31', '2024-01-14', 'ammar', 2, '2024-01-10', 0),
	(40, '2024-03-10', '2024-03-24', 'ammar', 8, '2024-03-21', 0),
	(41, '2023-07-16', '2023-07-30', 'ammar', 11, '2023-08-02', 6000),
	(42, '2023-10-30', '2023-11-13', 'ammar', 12, '2023-11-17', 8000),
	(43, '2023-10-26', '2023-11-09', 'ammar', 19, '2023-11-11', 4000),
	(44, '2023-12-11', '2023-12-25', 'ammar', 18, '2023-12-21', 0),
	(45, '2023-09-22', '2023-10-06', 'ammar', 10, '2023-10-11', 10000),
	(46, '2024-01-04', '2024-01-18', 'ammar', 2, '2024-01-21', 6000),
	(47, '2023-08-27', '2023-09-10', 'ammar', 3, '2023-09-12', 4000),
	(48, '2023-10-10', '2023-10-24', 'ammar', 17, '2023-10-19', 0),
	(49, '2023-06-26', '2023-07-10', 'ammar', 6, '2023-07-12', 4000),
	(50, '2023-07-22', '2023-08-05', 'ammar', 18, '2023-08-04', 0),
	(51, '2024-01-31', '2024-02-14', 'ammar', 10, '2024-02-14', 0),
	(52, '2023-06-28', '2023-07-12', 'ammar', 7, '2023-07-15', 6000),
	(53, '2023-08-26', '2023-09-09', 'ammar', 1, '2023-09-15', 12000),
	(54, '2024-02-04', '2024-02-18', 'ammar', 16, '2024-02-22', 8000),
	(55, '2023-09-26', '2023-10-10', 'ammar', 15, '2023-10-14', 8000),
	(56, '2023-06-13', '2023-06-27', 'ammar', 4, '2023-07-03', 12000),
	(57, '2023-12-24', '2024-01-07', 'ammar', 19, '2024-01-13', 12000),
	(58, '2024-01-25', '2024-02-08', 'ammar', 18, '2024-02-04', 0),
	(59, '2023-07-16', '2023-07-30', 'ammar', 14, '2023-07-27', 0),
	(60, '2024-05-08', '2024-05-22', 'ammar', 15, '2024-05-22', 0),
	(61, '2023-06-18', '2023-07-02', 'ammar', 5, '2023-07-04', 4000),
	(62, '2023-12-10', '2023-12-24', 'ammar', 9, '2023-12-19', 0),
	(63, '2024-02-29', '2024-03-14', 'ammar', 12, '2024-03-20', 12000),
	(64, '2023-12-19', '2024-01-02', 'ammar', 1, '2024-01-03', 2000),
	(65, '2024-05-20', '2024-06-03', 'ammar', 10, '2024-06-09', 12000),
	(66, '2023-12-24', '2024-01-07', 'ammar', 20, '2024-01-07', 0),
	(67, '2023-08-01', '2023-08-15', 'ammar', 18, '2023-08-19', 8000),
	(68, '2024-04-06', '2024-04-20', 'ammar', 10, '2024-04-19', 0),
	(69, '2023-06-19', '2023-07-03', 'ammar', 14, '2023-07-03', 0),
	(70, '2023-08-13', '2023-08-27', 'ammar', 12, '2023-08-31', 8000),
	(71, '2023-08-10', '2023-08-24', 'ammar', 2, '2023-08-24', 0),
	(72, '2024-02-04', '2024-02-18', 'ammar', 11, '2024-02-23', 10000),
	(73, '2023-08-01', '2023-08-15', 'ammar', 6, '2023-08-16', 2000),
	(74, '2023-09-24', '2023-10-08', 'ammar', 1, '2023-10-08', 0),
	(75, '2023-08-10', '2023-08-24', 'ammar', 18, '2023-08-21', 0),
	(76, '2024-05-01', '2024-05-15', 'ammar', 4, '2024-05-14', 0),
	(77, '2023-09-07', '2023-09-21', 'ammar', 10, '2023-09-15', 0),
	(78, '2023-09-12', '2023-09-26', 'ammar', 15, '2023-10-03', 14000),
	(79, '2023-12-18', '2024-01-01', 'ammar', 18, '2024-01-06', 10000),
	(80, '2023-08-25', '2023-09-08', 'ammar', 16, '2023-09-04', 0),
	(81, '2023-11-28', '2023-12-12', 'ammar', 14, '2023-12-17', 10000),
	(82, '2023-11-04', '2023-11-18', 'ammar', 16, '2023-11-25', 14000),
	(83, '2024-02-15', '2024-02-29', 'ammar', 17, '2024-03-01', 2000),
	(84, '2024-01-07', '2024-01-21', 'ammar', 6, '2024-01-26', 10000),
	(85, '2024-01-04', '2024-01-18', 'ammar', 4, '2024-01-20', 4000),
	(86, '2024-03-16', '2024-03-30', 'ammar', 16, '2024-03-23', 0),
	(87, '2024-01-27', '2024-02-10', 'ammar', 1, '2024-02-16', 12000),
	(88, '2024-01-05', '2024-01-19', 'ammar', 17, '2024-01-16', 0),
	(89, '2024-04-22', '2024-05-06', 'ammar', 16, '2024-05-07', 2000),
	(90, '2023-11-20', '2023-12-04', 'ammar', 8, '2023-12-04', 0),
	(91, '2023-12-12', '2023-12-26', 'ammar', 1, '2023-12-26', 0),
	(92, '2023-05-31', '2023-06-14', 'ammar', 1, '2023-06-15', 2000),
	(93, '2023-09-16', '2023-09-30', 'ammar', 9, '2023-10-04', 8000),
	(94, '2023-12-17', '2023-12-31', 'ammar', 3, '2024-01-02', 4000),
	(95, '2024-04-06', '2024-04-20', 'ammar', 12, '2024-04-23', 6000),
	(96, '2023-08-24', '2023-09-07', 'ammar', 3, '2023-09-04', 0),
	(97, '2023-12-07', '2023-12-21', 'ammar', 4, '2023-12-21', 0),
	(98, '2023-11-30', '2023-12-14', 'ammar', 4, '2023-12-07', 0),
	(99, '2023-12-23', '2024-01-06', 'ammar', 1, '2024-01-09', 6000),
	(100, '2023-10-13', '2023-10-27', 'ammar', 13, '2023-10-27', 0),
	(101, '2024-02-21', '2024-03-06', 'ammar', 2, '2024-03-01', 0),
	(102, '2024-05-16', '2024-05-30', 'ammar', 19, '2024-06-01', 4000),
	(103, '2024-05-03', '2024-05-17', 'ammar', 5, '2024-05-22', 10000),
	(104, '2024-03-30', '2024-04-13', 'ammar', 13, '2024-04-19', 12000),
	(105, '2024-01-01', '2024-01-15', 'ammar', 2, '2024-01-21', 12000),
	(106, '2024-03-16', '2024-03-30', 'ammar', 10, '2024-04-02', 6000),
	(107, '2024-01-05', '2024-01-19', 'ammar', 8, '2024-01-16', 0),
	(108, '2023-07-30', '2023-08-13', 'ammar', 5, '2023-08-17', 8000),
	(109, '2023-06-20', '2023-07-04', 'ammar', 3, '2023-06-30', 0),
	(110, '2023-11-03', '2023-11-17', 'ammar', 7, '2023-11-11', 0),
	(111, '2023-06-29', '2023-07-13', 'ammar', 18, '2023-07-20', 14000),
	(112, '2023-05-26', '2023-06-09', 'marsya', 1, NULL, NULL),
	(113, '2023-05-26', '2023-06-09', 'marsya', 2, NULL, NULL),
	(114, '2023-05-26', '2023-06-09', 'marsya', 3, NULL, NULL),
	(115, '2023-05-26', '2023-06-09', 'marsya', 4, NULL, NULL);

-- Dumping structure for table readflow.setting
CREATE TABLE IF NOT EXISTS `setting` (
  `nama_param` varchar(50) DEFAULT NULL,
  `nilai_param` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table readflow.setting: ~5 rows (approximately)
REPLACE INTO `setting` (`nama_param`, `nilai_param`) VALUES
	('LAMA_PINJAM', '14'),
	('FOLDER_COVER_BUKU', 'img'),
	('MAKSIMAL_PINJAM_BUKU', '4'),
	('DENDA_1HARI', '2000'),
	('DENDA_MAKS', '50000');

-- Dumping structure for table readflow.user
CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(50) NOT NULL,
  `password` char(32) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table readflow.user: ~5 rows (approximately)
REPLACE INTO `user` (`username`, `password`, `role`) VALUES
	('ammar', '4124bc0a9335c27f086f24ba207a4912', 'Admin'),
	('marsya', '12345678', NULL),
	('reza', '12345678', 'Pegawai'),
	('septi', '12345678', NULL),
	('user', '12345678', NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
