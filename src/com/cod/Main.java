package com.cod;

public class Main {
    public static void main(String[] args) {
        if (iniciarUser("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (iniciarGmail()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }

    }

    public static boolean iniciarUser(String user) {
        IniciarUser obx1 = new IniciarUser();
        System.out.println("Conectando a " + obx1.getIp() + ", con el usuario " + user);
        return obx1.iniciarUser();
    }

    public static boolean iniciarGmail() {
        IniciarUser obx2;
        obx2 = new IniciarUser();
        System.out.println("Conectando a " + obx2.getIp()+ ", con el usuario " + obx2.getGmail());
        return obx2.iniciarUser();
    }
}
