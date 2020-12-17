package com.cod;

public class IniciarUser {
      private String gmail="pepe@daniencastelao.org";
      private String ip = "127.0.0.2";
      private static IniciarUser instance;

    public IniciarUser() {

    }

    public IniciarUser(String gmail, String ip) {
        this.gmail = gmail;
        this.ip = ip;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public static IniciarUser getInstance() {
        return instance;
    }

    public static void setInstance(IniciarUser instance) {
        IniciarUser.instance = instance;
    }

    public boolean iniciarUser() {
        return !gmail.equals("anonymous@danielcastelao.org");
    }
}
