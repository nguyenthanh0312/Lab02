package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.cart.Cart.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;
public class Aims {

	public static void main(String[] args) {
		cart anOrder = new cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.print();
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.printf("Total cost is: %.2f",anOrder.totalCost());
    }

}