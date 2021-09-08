package com.company;

public class Main {

    public static void main(String[] args) {
      Player1 p = new Player1("Ravindu Sathsara", "M416", 100);
      Player2 p2 = new Player2("Ashan Chamika ", "AWM",100,true);


      p.damageByGun1();
      p.damageByGun1();
      p.heal();
      p.damageByGun1();
      p.damageByGun2();
      p.damageByGun2();
      p.heal();


      p2.damageByGun2();
      p2.damageByGun2();
      p2.damageByGun2();


    }
}
