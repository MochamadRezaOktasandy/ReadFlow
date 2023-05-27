-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.28-MariaDB - mariadb.org binary distribution
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
CREATE DATABASE IF NOT EXISTS `readflow` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
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
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table readflow.buku: ~32 rows (approximately)
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
	(41, 'The Lord of the Rings: The Fellowship of the Ring', 'J.R.R. Tolkien', 'Allen & Unwin', 1954, 'Fiksi', 'RAK 1A', '41.jpg'),
	(42, 'To Kill a Mockingbird', 'Harper Lee', ' J.B. Lippincott & Co', 1960, 'Fiksi', 'RAK 1B', '42.jpg'),
	(43, 'Doraemon', 'Fujiko F. Fujio', 'Elex Media Komputindo', 1999, 'Fiksi', 'RAK 1C', '43.jpg'),
	(44, 'Naruto', ' Masashi Kishimoto', 'Elex Media Komputindo', 1999, 'Fiksi', 'RAK 1C', '44.jpg'),
	(46, 'Crayon Shinchan', 'Yoshito Usui', 'Level Comics', 1990, 'Fiksi', 'RAK 2A', '46.jpg'),
	(47, 'Dragon Ball', ' Akira Toriyama', 'Elex Media Komputindo', 1984, 'Fiksi', 'RAK 2B', '47.jpg'),
	(48, 'Detective Conan', 'Gosho Aoyama', ' Elex Media Komputindo', 1994, 'Fiksi', 'RAK 2B', '48.jpg'),
	(49, 'Wiro Sableng', 'Bastian Tito ', 'Kompas Gramedia', 1978, 'Fiksi', 'RAK 2C', '49.jpg'),
	(50, 'Attack on Titan', ' Hajime Isayama', ' Kodansha', 2009, 'Fiksi', 'RAK 2C', '50.jpg'),
	(51, 'My Hero Academia', 'Kohei Horikoshi', 'Shueisha', 2014, 'Fiksi', 'RAK 3A', '51.jpg'),
	(52, 'One Piece', 'Eiichiro Oda', 'Elex Media Komputindo', 1997, 'Fiksi', 'RAK 2A', '52.jpg'),
	(53, 'Demon Slayer: Kimetsu no Yaiba', 'Koyoharu Gotouge', 'Shueisha', 2016, 'Fiksi', 'RAK 3A', '53.jpg'),
	(54, 'Haikyu!!', 'Haruichi Furudate', 'Shueisha', 2012, 'Fiksi', 'RAK 3B', '54.jpg');

-- Dumping structure for table readflow.feedback
CREATE TABLE IF NOT EXISTS `feedback` (
  `feedback_id` int(11) NOT NULL AUTO_INCREMENT,
  `tanggal` date DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `feedback` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`feedback_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table readflow.feedback: ~2 rows (approximately)
REPLACE INTO `feedback` (`feedback_id`, `tanggal`, `username`, `feedback`) VALUES
	(1, '2023-05-26', 'ammar', 'test feedback'),
	(2, '2023-05-27', 'imam', 'PERPUSTAKAAN INI SANGATLAH BAGUS DAN OP SAYA SANGAT SENANG MEMBACA DAN MEMINJAM DI PERPUSTAKAAN READFLOW INI');

-- Dumping structure for table readflow.member
CREATE TABLE IF NOT EXISTS `member` (
  `username` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `alamat` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table readflow.member: ~3 rows (approximately)
REPLACE INTO `member` (`username`, `nama`, `tgl_lahir`, `email`, `no_telp`, `alamat`) VALUES
	('afjar', 'Afjar Maulana', '2002-08-15', 'afjar@gmail.com', '087867216721', 'Jalan pisangan'),
	('ammar', 'test', '2023-05-01', 'asdasasasd', '1232121312123', 'asdasdasdasdasdasdasdas'),
	('imam', 'Muhammad Imam Wicaksono', '2003-05-27', 'imam@gmail.com', '089765782245', 'Jl Pasar Nangka');

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
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table readflow.pinjam: ~9 rows (approximately)
REPLACE INTO `pinjam` (`pinjam_id`, `tgl_pinjam`, `tgl_kembali`, `username`, `buku_id`, `tgl_actual_kembali`, `denda`) VALUES
	(1, '2023-05-23', '2023-06-06', 'ammar', 1, NULL, NULL),
	(2, '2023-05-23', '2023-06-06', 'septi', 5, NULL, NULL),
	(3, '2023-05-23', '2023-06-06', 'reza', 10, NULL, NULL),
	(4, '2023-05-23', '2023-05-06', 'marsya', 1, '2023-05-26', 40000),
	(5, '2023-05-23', '2023-04-06', 'marsya', 12, '2023-05-26', 50000),
	(6, '2023-07-30', '2023-08-13', 'ammar', 5, '2023-08-17', 8000),
	(7, '2023-06-20', '2023-07-04', 'ammar', 3, '2023-06-30', 0),
	(8, '2023-11-03', '2023-11-17', 'ammar', 7, '2023-11-11', 0),
	(9, '2023-05-26', '2023-06-09', 'marsya', 1, NULL, NULL),
	(116, '2023-05-27', '2023-06-10', 'imam', 41, NULL, NULL),
	(117, '2023-05-27', '2023-06-10', 'imam', 1, NULL, NULL);

-- Dumping structure for table readflow.setting
CREATE TABLE IF NOT EXISTS `setting` (
  `nama_param` varchar(50) DEFAULT NULL,
  `nilai_param` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table readflow.user: ~7 rows (approximately)
REPLACE INTO `user` (`username`, `password`, `role`) VALUES
	('afjar', '25d55ad283aa400af464c76d713c07ad', 'Pegawai'),
	('ammar', '4124bc0a9335c27f086f24ba207a4912', 'Admin'),
	('imam', '25d55ad283aa400af464c76d713c07ad', 'User'),
	('marsya', '12345678', NULL),
	('reza', '12345678', 'Pegawai'),
	('septi', '12345678', NULL),
	('user', '12345678', NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
