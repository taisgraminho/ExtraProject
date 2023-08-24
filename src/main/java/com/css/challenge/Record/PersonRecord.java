package com.css.challenge.Record;

public record PersonRecord(String name, String email, String emailCompass, String cpf, Boolean status, String birthDay,
                           String civilStatus, char sex, String naturalNess, String phone, String adress, int cep) {

    public void printName(){
        System.out.println("Name: " + name);
    }

    public void printEmail(){
        System.out.println("Person Email: " + email);
    }

    public void printEmailCompass() {
        System.out.println("Compass Email: " + emailCompass);
    }

    public void printCPF() {
        System.out.println("CPF: " + cpf);
    }

    public void printStatus() {
        if(true) {
            System.out.println("Status Ativo!");
        }else{
            System.out.println("Status Inativo!");
        }
    }

    public void printBirthDay() {
        System.out.println("BirthDay: " + birthDay);
    }

    public void printCivilStatus() {
        System.out.println("Civil Status: " + civilStatus);
    }

    public void printNaturalNess() {
        System.out.println("Naturalness: " + naturalNess);
    }

    public void printPhone() {
        System.out.println("Phone: " + phone);
    }

    public void printAddress() {
        System.out.println("Address: " + adress);
    }

    public void printCEP() {
        System.out.println("CEP: " + cep);
    }
}
