package vue;

import Erreur.NotYetImplementedException;
import Modele.Jeu;
import Modele.Joueur;
import vue.IHM.FrameJeu;

/**
 * Created by Jean on 13/11/14.
 */
public class NouvellePartie implements Commande {
    @Override
    public void execute() {
        try {
            Jeu.instance().init(new Joueur("J1"), new Joueur("J2"));
            FrameJeu.instance().MAJ();
        } catch (NotYetImplementedException e) {
            e.printStackTrace();
        }
        /*try {
            //FrameJeu.instance().MAJ();
        } catch (NotYetImplementedException e) {
            e.printStackTrace();
        }*/
    }
}
