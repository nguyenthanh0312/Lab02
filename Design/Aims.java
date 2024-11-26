package Aims;
import cart.cart;
import DigitalVideoDisc.DigitalVideoDisc;
public class Aims {

	public static void main(String[] args) {
		cart anOrder = new cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Doraemon","Naruto",
                "Roger Allers",90,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Ford","Lambogini",
                "Geogre Lucas",90,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Luffy","Zoro",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.print();
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.printf("Total cost is: %.2f",anOrder.totalCost());
    }

}
