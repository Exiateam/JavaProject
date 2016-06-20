/* ************************************************************************** */
/*                                                                            */
/*   Data base.sql                     $$$$$$$$\ $$\   $$\ $$$$$$\  $$$$$$\   */
/*                                     $$  _____|$$ |  $$ |\_$$  _|$$  __$$ | */
/*   Author: Corentin Benoist          $$ |      \$$\ $$  |  $$ |  $$ /  $$ | */
/*                                     $$$$$\     \$$$$  /   $$ |  $$$$$$$$ | */
/*   Group: Erwan PLESSIS              $$  __|    $$  $$<    $$ |  $$  __$$ | */
/*                                     $$ |      $$  /\$$\   $$ |  $$ |  $$ | */
/*                                     $$$$$$$$\ $$ /  $$ |$$$$$$\ $$ |  $$ | */
/*   Created: 2016/06/13 15:27:00      \________|\__|  \__|\______|\__|  \__| */
/*                                                                            */
/* ************************************************************************** */

-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Created :  Jeu 02 Juin 2016 à 23:02
-- Serveur Version :  5.7.11
-- PHP Version :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database :  `jpublankproject`
--

CREATE DATABASE `jpublankproject` ;

USE `jpublankproject` ;

DELIMITER $$

--
-- Procédures
--

CREATE DEFINER=`root`@`localhost` PROCEDURE `mapById` (IN `p_id` INT)  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM map WHERE id = p_id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `mapByKey` (IN `p_key` VARCHAR(5))  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM jpublankproject.map where `key`=p_key$$

DELIMITER ;

--
-- Structure of the table `map`
--

CREATE TABLE `map` (
  `id` int(11) NOT NULL,
  `key` varchar(5) NOT NULL,
  `map` varchar(240) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Filling table `map`
--

-- A = Lorann
-- B = Fireball
-- C = Crystall_ball
-- D = Door locked
-- E = door unlocked
-- F = Corner
-- G = Horizontal_bone
-- H = Vertical_bone
-- I = Monster_1
-- J = Monster_2
-- K = Monster_3
-- L = Monster_4
-- M = Purse
-- N = Empty

INSERT INTO `map` (`id`, `key`, `map`) VALUES
(1, 'MAP1', 'NNNNNNFGFGGGGGGGGGFNNNNFGGFMHNNNNNNNNNFFNNNHNNNNHNNNNNNNNNNHFGGFNNNNHNNNMNNNNNNHHNMNFGGGFGGGGGFNNNNFHMNNHINNNNNNCNNNNANDHNMNFGGGFGGGGGFNNNNFFGGFNNNNHNNNMNNNNNNHNNNHNNNNHNNNNNNNNNNHNNNHNNNNHNNNNNNNNNNHNNNFGGFMHNNNNNNNNNFFNNNNNNFGFGGGGGGGGGFN'),
(2, 'MAP2', 'NNFFGGGGGGGGGGGGGGGFNFFNNNNNNNNNNNNNNANHFFNNNNNNNNNNNNNNNNNHFNDNFGGGGGGGFMFNFGGFHNNNHNNNNJNNNNHNNNNHHNNNHNFGGGGGGGFGGFNHHNNNHNNNNLNNNMHNNNNHHNNNFGGGGGGGFNFNFGGFHNNNHNNNNKNNNMHNNNNHFGFNHNFGGGGGGFFGGFNHHCNNHNNNNINNMHMNMNNHFGGGFGGGGGGGGFGGGGGF'),
(3, 'MAP3', 'FGGGGGFGGGGGGGGFGGFNHNNNNNFNMNMNMNFFNNHFHNANNNFFNNNNNFFNNNHFHNNNNNNFFNNINFNNNNHFHNNNFFNNFFNNFFNNNNHFHNFFFNNNNFNFFNNNNNHFFFFNNNJNFCFNKNNFFMHFHNNMNNNFNFNNNNNNFFHFHNMNNFFFNNLNNFFNNFFFHMNNFFNNNNNNNNFFNNNFFGGGFGGGGGGGGGGFFNDFNFFFFFFFFFFFFFFFFFFF'),
(4, 'MAP4', 'NNFGGFGGGGGGGGGGGFNNNFFNNFNNNNNNNNNNNFNNFFNNNNNFMFMFMFMFNMFFHNNFFFNFGFGFGFGFFNNHHNNFHHNNNNNNNNNHNNNHHNNNHFGFNFGGGFNHFNNHHNNFHHNNNFGFNNNHNNNHHNNNFFANNFGFNNDHFNNHHNNFGGGGFGGGGGGFFNNHFFNNFMFMFMFMFMFFKCFFNFFNNNNNNLNNINNJNFFNNNFGGGGGGGGGGGGGGFNN'),
(5, 'MAP5', 'NNNNNNNNNNNNNNNNNNNNNFGGGGGFFNNNNNNNNNNNFFNNNNNCFGGFNNNNNNNNHNFGGGFNNNMFGGFNNNNNHINNNNNNNFNNNMFGGFNNHNFGGFNFNNNFNNNNMFGFHJNNNNNNNFNHNNNANNMHHNFGGFNFNNNFNNNNMFGFHKNNNNNNNFNNNMFGGFNNHNFGGGFNNNMFGGFNNNNNFDNNNNNMFGGFNNNNNNNNNFGGGGGFFNNNNNNNNNNN');

--
-- Index 
--

ALTER TABLE `map`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `key_UNIQUE` (`key`);

--
-- AUTO_INCREMENT of table `map`
--

ALTER TABLE `map`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
