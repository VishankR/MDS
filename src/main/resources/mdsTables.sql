CREATE TABLE `mds`.`patient` (
  `patient_id` INT NOT NULL AUTO_INCREMENT,
  `dob` DATETIME NOT NULL,
  `home_contact` INT NULL,
  `mobile_contact` INT NULL,
  `office_contact` INT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `middle_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `mail` VARCHAR(45) NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `last_updated_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated_by` VARCHAR(45) NULL,
  `is_dirty` VARCHAR(1) NULL DEFAULT 'N',
  PRIMARY KEY (`patient_id`),
  UNIQUE INDEX `patient_id_UNIQUE` (`patient_id` ASC) VISIBLE);

  CREATE TABLE `mds`.`patient_address` (
  `street` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL,
  `patient_id` INT NOT NULL,
  INDEX `patient_patientAddress_idx` (`patient_id` ASC) VISIBLE,
  CONSTRAINT `patient_patientAddress`
    FOREIGN KEY (`patient_id`)
    REFERENCES `mds`.`patient` (`patient_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

    CREATE TABLE `mds`.`prescription` (
  `prescription_id` INT NOT NULL AUTO_INCREMENT,
  `patient_id` INT NOT NULL,
  `drug_name` VARCHAR(45) NOT NULL,
  `dispensed_quantity` INT NULL,
  `days` INT NULL,
  `refills` INT NULL,
  `prescribed_quantity` INT NULL,
  `refill_quantity` INT NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `last_updated_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`prescription_id`),
  UNIQUE INDEX `prescription_id_UNIQUE` (`prescription_id` ASC) VISIBLE,
  INDEX `prescription_patient_idx` (`patient_id` ASC) VISIBLE,
  CONSTRAINT `prescription_patient`
    FOREIGN KEY (`patient_id`)
    REFERENCES `mds`.`patient` (`patient_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `mds`.`prescription_fill` (
  `prescription_fill_id` INT NOT NULL AUTO_INCREMENT,
  `prescription_id` INT NOT NULL,
  `days` INT NULL,
  `dispensed_quantity` INT NULL,
  `fill_number` INT NULL,
  `pickup_date` DATETIME NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `last_updated_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`prescription_fill_id`),
  UNIQUE INDEX `prescription_fill_id_UNIQUE` (`prescription_fill_id` ASC) VISIBLE,
  INDEX `prescriptionFill_prescription_idx` (`prescription_id` ASC) VISIBLE,
  CONSTRAINT `prescriptionFill_prescription`
    FOREIGN KEY (`prescription_id`)
    REFERENCES `mds`.`prescription` (`prescription_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

ALTER TABLE `mds`.`patient_address` 
ADD COLUMN `created_date` DATETIME NULL AFTER `patient_id`,
ADD COLUMN `created_by` VARCHAR(45) NULL AFTER `created_date`,
ADD COLUMN `last_updated_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP AFTER `created_by`,
ADD COLUMN `last_updated_by` VARCHAR(45) NULL AFTER `last_updated_date`;

ALTER TABLE `mds`.`patient` 
CHANGE COLUMN `home_contact` `home_contact` DOUBLE NULL DEFAULT NULL ,
CHANGE COLUMN `mobile_contact` `mobile_contact` DOUBLE NULL DEFAULT NULL ,
CHANGE COLUMN `office_contact` `office_contact` DOUBLE NULL DEFAULT NULL ;
