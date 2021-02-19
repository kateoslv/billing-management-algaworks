CREATE TABLE account_receivable (
    `id` INT NOT NULL AUTO_INCREMENT UNIQUE,
    `description` VARCHAR(255) NOT NULL,
    `due_date` DATE,
    `value` DECIMAL,
    `status` VARCHAR(45),
    PRIMARY KEY (`id`)
);