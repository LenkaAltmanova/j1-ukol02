package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        /*zofka.setLocation(200.0,200.0);
        nakresliRovnostrannyTrojuhelnik(100);
        zofka.setLocation(300.0,200.0);
        nakresliCtverec(100);
        zofka.setLocation(700,400);
        nakresliKruh(30);
        zofka.setLocation(500,200);
        nakresliObdelnik(100);
        zofka.setLocation(600,600);
        nakresliRovnoramennyTrojuhelnik(100);*/
        zofka.setLocation(100,150);
        nakresliKruh(30);
        zofka.setLocation(150,300);
        nakresliRovnostrannyTrojuhelnik(180);
        //zmrzlina
        zofka.setLocation(400,100);
        nakresliKruh(20);
        zofka.setLocation(420,190);
        nakresliKruh(30);
        zofka.setLocation(490,360);
        nakresliKruh(40);
        zofka.setLocation(360,250);
        nakresliKruh(10);
        zofka.setLocation(590,260);
        nakresliKruh(10);
        //sněhulák
        zofka.turnLeft(15);
        zofka.setLocation(750,320);
        nakresliRovnoramennyTrojuhelnik(100);
        zofka.turnLeft(5);
        zofka.setLocation(750,400);
        nakresliObdelnik(100);
        zofka.setLocation(780,440);
        nakresliKruh(10);
        zofka.setLocation(880,420);
        nakresliKruh(10);
        zofka.setLocation(980,360);
        nakresliKruh(18);
        zofka.turnLeft(80);
        zofka.setLocation(950,200);
        nakresliObdelnik(100);

    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        // Zde lze používat proměnnou velikostStrany.
        // Jeji hodnota je takova, s jakou byla metoda zavolana
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
    }
    public void nakresliCtverec(double velikostStran){
        for(int i = 0; i < 4; i++) {
            zofka.move(velikostStran);
            zofka.turnRight(90);
        }
    }

    public void nakresliKruh(double velStran){
        for(int i = 0; i < 20; i++) {
        zofka.move(velStran);
        zofka.turnRight(20);
    }
    }

    public void nakresliObdelnik(double velikostStr){
        zofka.turnRight(50);
        for(int i = 0; i < 2; i++) {
            zofka.move(velikostStr);
            zofka.turnRight(90);
            zofka.move(velikostStr*2);
            zofka.turnRight(90);
        }
    }
    public void nakresliRovnoramennyTrojuhelnik(double velikostStrany) {

        zofka.move(Math.sqrt(2*Math.pow(velikostStrany, 2)));
        zofka.turnLeft(135.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(90.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(45.0);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

