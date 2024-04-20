CREATE  TABLE IF NOT EXISTS `colegio`.`profesores` (

  `id_profesor` INT NOT NULL AUTO_INCREMENT ,

  `profesor` VARCHAR(45) NOT NULL ,

  `id_curso` INT NOT NULL ,

  PRIMARY KEY (`id_profesor`) )

ENGINE = InnoDB;



USE `colegio` ;