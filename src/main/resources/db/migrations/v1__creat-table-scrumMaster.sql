CREATE TABLE scrum_master(
      id SERIAL PRIMARY KEY,
      name VARCHAR(255) NOT NULL,
      email VARCHAR(100) NOT NULL,
      emailCompass VARCHAR(100) NOT NULL,
      cpf VARCHAR(18) NOT NULL,
      status VARCHAR(20) NOT NULL,
      birthDay DATE NOT NULL,
      civilStatus VARCHAR(10) NOT NULL,
      sex CHAR(1) NOT NULL,
      phone BIGINT(14) NOT NULL,
      adress VARCHAR(150) NOT NULL,
      zipCode INT(8),
      naturalNess VARCHAR(100) NOT NULL,
      id_class INT FOREIGN KEY NOT NULL
)