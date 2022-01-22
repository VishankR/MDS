-- mds.patient definition
CREATE TABLE `patient` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `dob` datetime NOT NULL,
  `home_contact` double DEFAULT NULL,
  `mobile_contact` double DEFAULT NULL,
  `office_contact` double DEFAULT NULL,
  `first_name` varchar(45) NOT NULL,
  `middle_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `last_updated_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `last_updated_by` varchar(45) DEFAULT NULL,
  `is_dirty` varchar(1) DEFAULT 'N',
  PRIMARY KEY (`patient_id`),
  UNIQUE KEY `patient_id_UNIQUE` (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- mds.patient_address definition
CREATE TABLE `patient_address` (
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `patient_id` int NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `last_updated_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `last_updated_by` varchar(45) DEFAULT NULL,
  KEY `patient_patientAddress_idx` (`patient_id`),
  CONSTRAINT `patient_patientAddress` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- mds.prescription definition
CREATE TABLE `prescription` (
  `prescription_id` int NOT NULL AUTO_INCREMENT,
  `patient_id` int NOT NULL,
  `drug_name` varchar(45) NOT NULL,
  `dispensed_quantity` int DEFAULT NULL,
  `days` int DEFAULT NULL,
  `refills` int DEFAULT NULL,
  `prescribed_quantity` int DEFAULT NULL,
  `refill_quantity` int DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `last_updated_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `last_updated_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`prescription_id`),
  UNIQUE KEY `prescription_id_UNIQUE` (`prescription_id`),
  KEY `prescription_patient_idx` (`patient_id`),
  CONSTRAINT `prescription_patient` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- mds.prescription_fill definition
CREATE TABLE `prescription_fill` (
  `prescription_fill_id` int NOT NULL AUTO_INCREMENT,
  `prescription_id` int NOT NULL,
  `days` int DEFAULT NULL,
  `dispensed_quantity` int DEFAULT NULL,
  `fill_number` int DEFAULT NULL,
  `pickup_date` datetime DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `last_updated_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `last_updated_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`prescription_fill_id`),
  UNIQUE KEY `prescription_fill_id_UNIQUE` (`prescription_fill_id`),
  KEY `prescriptionFill_prescription_idx` (`prescription_id`),
  CONSTRAINT `prescriptionFill_prescription` FOREIGN KEY (`prescription_id`) REFERENCES `prescription` (`prescription_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;