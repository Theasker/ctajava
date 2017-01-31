package com.example;

public class Main {
  public static void main(String[] args) {
    PeerSingleton peerList01 = PeerSingleton.getInstance();
    PeerSingleton peerList02 = PeerSingleton.getInstance();
    
    for(String host:peerList01.getHostNames()){
        System.out.println(host);
    }
    for(String host:peerList02.getHostNames()){
        System.out.println(host);
    }
  }  
}
