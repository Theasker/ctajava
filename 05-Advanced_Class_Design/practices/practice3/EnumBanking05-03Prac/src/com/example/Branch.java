package com.example;

public enum Branch {
    LA("Basic"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");
    
    String serviceLevel;
    
    private Branch(String serviceLevel){
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel(){
        return serviceLevel;
    }


}
