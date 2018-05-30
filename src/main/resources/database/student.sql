-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 30, 2018 at 04:54 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_details`
--

CREATE TABLE `attendance_details` (
  `details_id` bigint(20) NOT NULL,
  `attendance_id` bigint(20) NOT NULL,
  `status` int(11) NOT NULL,
  `student_id` bigint(20) NOT NULL,
  `time_attendance` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance_details`
--

INSERT INTO `attendance_details` (`details_id`, `attendance_id`, `status`, `student_id`, `time_attendance`) VALUES
(1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `attendance_slots`
--

CREATE TABLE `attendance_slots` (
  `attendance_id` bigint(20) NOT NULL,
  `attendance_date` bigint(20) NOT NULL,
  `attendance_status` int(11) NOT NULL,
  `id_class` bigint(20) NOT NULL,
  `id_slot` bigint(20) NOT NULL,
  `subject_code` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance_slots`
--

INSERT INTO `attendance_slots` (`attendance_id`, `attendance_date`, `attendance_status`, `id_class`, `id_slot`, `subject_code`) VALUES
(1, 1527613200000, 1, 1, 1, 'EJB');

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `id` bigint(20) NOT NULL,
  `datecreate` bigint(20) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`id`, `datecreate`, `status`) VALUES
(1, 1527613200000, 1),
(2, 1527613200000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` bigint(20) NOT NULL,
  `student_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `student_name`) VALUES
(1, 'Nguyen Van Hung'),
(2, 'Nguyen Tuan Anh\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `student_class`
--

CREATE TABLE `student_class` (
  `student_class_id` bigint(20) NOT NULL,
  `class_id` bigint(20) NOT NULL,
  `date_create_student` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL,
  `student_status` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_class`
--

INSERT INTO `student_class` (`student_class_id`, `class_id`, `date_create_student`, `student_id`, `student_status`) VALUES
(1, 1, 1527613200000, 1, 1),
(2, 1, 1527613200000, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `timeslots`
--

CREATE TABLE `timeslots` (
  `id` bigint(20) NOT NULL,
  `datecreate` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `timeslots`
--

INSERT INTO `timeslots` (`id`, `datecreate`) VALUES
(1, 1),
(2, 2),
(3, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance_details`
--
ALTER TABLE `attendance_details`
  ADD PRIMARY KEY (`details_id`),
  ADD KEY `fk_foreign_key_name2` (`attendance_id`),
  ADD KEY `fk_foreign_key_name3` (`student_id`);

--
-- Indexes for table `attendance_slots`
--
ALTER TABLE `attendance_slots`
  ADD PRIMARY KEY (`attendance_id`),
  ADD KEY `fk_foreign_key_name2` (`id_class`);

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `student_class`
--
ALTER TABLE `student_class`
  ADD PRIMARY KEY (`student_class_id`),
  ADD KEY `fk_foreign_key_name` (`student_id`),
  ADD KEY `fk_foreign_key_name1` (`class_id`);

--
-- Indexes for table `timeslots`
--
ALTER TABLE `timeslots`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
