-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         11.0.2-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para gestion_clientes
CREATE DATABASE IF NOT EXISTS `gestion_clientes` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `gestion_clientes`;

-- Volcando estructura para tabla gestion_clientes.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `cedula` varchar(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `genero` char(1) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` char(7) NOT NULL,
  `provincia` varchar(50) NOT NULL,
  `ciudad` varchar(50) NOT NULL,
  `corregimiento` varchar(50) NOT NULL,
  `tipo_cliente` varchar(15) NOT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gestion_clientes.clientes_frecuentes
CREATE TABLE IF NOT EXISTS `clientes_frecuentes` (
  `cedula` varchar(20) NOT NULL DEFAULT '0',
  `numero_membresia` char(5) NOT NULL,
  `promedio_gastado` decimal(20,2) NOT NULL DEFAULT 0.00,
  `productos_frecuentes` varchar(50) NOT NULL DEFAULT '',
  `descuento` decimal(20,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`numero_membresia`),
  KEY `clientes` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gestion_clientes.clientes_vip
CREATE TABLE IF NOT EXISTS `clientes_vip` (
  `numero_membresia` char(5) NOT NULL,
  `promedio_gastado` decimal(20,2) NOT NULL DEFAULT 0.00,
  `asesor_asignado` varchar(50) NOT NULL DEFAULT '',
  `producto_frecuente` varchar(50) NOT NULL DEFAULT '',
  `descuento` decimal(20,2) NOT NULL DEFAULT 0.00,
  `cantidad_credito` decimal(20,2) NOT NULL DEFAULT 0.00,
  `cedula` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`numero_membresia`),
  KEY `clientes` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gestion_clientes.compras
CREATE TABLE IF NOT EXISTS `compras` (
  `codigo_compra` char(5) NOT NULL,
  `cedula` varchar(10) NOT NULL,
  `productos_comprados` int(11) NOT NULL,
  `costo_total` decimal(10,2) NOT NULL,
  `itbms_cobrado` decimal(10,2) NOT NULL,
  PRIMARY KEY (`codigo_compra`),
  KEY `cedula` (`cedula`),
  CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`cedula`) REFERENCES `clientes` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gestion_clientes.detalles_compras
CREATE TABLE IF NOT EXISTS `detalles_compras` (
  `codigo_barra` char(5) NOT NULL,
  `codigo_compra` char(5) NOT NULL,
  PRIMARY KEY (`codigo_compra`),
  KEY `codigo_barra` (`codigo_barra`),
  CONSTRAINT `detalles_compras_ibfk_1` FOREIGN KEY (`codigo_barra`) REFERENCES `productos` (`codigo_barra`),
  CONSTRAINT `detalles_compras_ibfk_2` FOREIGN KEY (`codigo_compra`) REFERENCES `compras` (`codigo_compra`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gestion_clientes.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `codigo_barra` char(5) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `precio_estandar` decimal(20,2) NOT NULL,
  `precio_descuento` decimal(20,2) NOT NULL,
  PRIMARY KEY (`codigo_barra`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- La exportación de datos fue deseleccionada.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
