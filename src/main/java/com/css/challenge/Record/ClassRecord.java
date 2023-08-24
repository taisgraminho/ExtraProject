package com.css.challenge.Record;

public record ClassRecord(String name,String dataBegin,String dataEnd, String technology, String partners){

    public void printName(){
        System.out.println("Name: " + name);
    }

    public void printDataBegin(){
        System.out.println("Data Begin: " + dataBegin);
    }

    public void printDataEnd(){
        System.out.println("Data End: " + dataEnd);
    }

    public void printTechnology(){
        System.out.println("Technology: " + technology);
    }

    public void printPartners(){
        System.out.println("Partners: " + partners);
    }

}
