/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;


public enum Branch {
    
    LA("Basic"), Boston("Loan"), Bangalore("Full"), Mumbai("Full");
       
        String serviceLevel;
        private Branch(String serviceLevel){
            this.serviceLevel = serviceLevel;
        }
        
        public String getServiceLevel(){
          return serviceLevel;
        }

    
}
