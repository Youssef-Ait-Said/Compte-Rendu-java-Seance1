package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.ImetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        IMetier metier = new ImetierImpl(dao);

        System.out.println("Resultat :" + metier.calcul());
    }
}
