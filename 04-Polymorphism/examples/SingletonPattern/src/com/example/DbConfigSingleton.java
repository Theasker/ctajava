package com.example;

public final class DbConfigSingleton {
  private final String hostName;
  private final String dbName;
  private final String user;
  private final String passwd;
  private final long port;
    
  private static final DbConfigSingleton instance =
            new DbConfigSingleton();
    
  private DbConfigSingleton(){
    // Values loaded from file in practice
    hostName = "dbhost.example.com";
    dbName = "MyDB";
    user = "dbuser";
    passwd = "dbpass";
    port = 7080;
  }
    
  public static DbConfigSingleton getInstance() {
    return instance;
  }   

  public String getHostName() {
    return hostName;
  }

  public String getDbName() {
    return dbName;
  }

  public String getUser() {
    return user;
  }

  public String getPasswd() {
    return passwd;
  }

  public long getPort() {
    return port;
  }
 
}
