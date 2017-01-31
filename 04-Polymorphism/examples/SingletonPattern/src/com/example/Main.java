package com.example;

public class Main {
    
  public static void main(String[] args) {
    SingletonClass s1 = SingletonClass.getInstance();
    SingletonClass s2 = SingletonClass.getInstance();
    if(s1==s2)
      System.out.println("same instance");
    else
      System.out.println("different instances");
       
    DbConfigSingleton db1 = DbConfigSingleton.getInstance();
    DbConfigSingleton db2 = DbConfigSingleton.getInstance();
    
    if(db1==db2)
      System.out.println("same db instance");
    else
      System.out.println("different db instances");
       
    System.out.println("==DBData==");
    System.out.println("Host:" + db1.getHostName()
        + "\nDB: " + db2.getDbName() + "\nUser: " 
        + db1.getUser() + "\nPasswd: " + db2.getPasswd()
        + "\nPort: " + db1.getPort()
    );
       
        
    }
    
}