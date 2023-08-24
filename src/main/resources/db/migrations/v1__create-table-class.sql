CREATE TABLE class(
     id SERIAL primary key,
     name VARCHAR(255) NOT NULL,
     dataBegin DATE NOT NULL,
     dataEnd DATE NOT NULL,
     technology VARCHAR(255) NOT NULL,
     partners TEXT NOT NULL
)