package Modèle.Pièce;

import Controleur.Visiteur.Visiteur;
import Erreur.NotYetImplementedException;
import Modèle.Coordonnee;

/**
 * Created by Paul on 16/10/2014.
 */
public class Tour extends Piece {
    public Tour(boolean b, Coordonnee c) {
        super(b, c);
    }

    @Override
    public void applique(Visiteur v) {
        try {
            v.visite(this);
        } catch (NotYetImplementedException e) {
            e.printStackTrace();
        }
    }
}
