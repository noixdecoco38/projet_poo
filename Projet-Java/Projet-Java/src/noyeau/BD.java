package noyeau;

import java.util.ArrayList;

/*
 * Class Base de donn�es (noyeau) et elle a une liste des relations
 */
public class BD {
	
	
	// Attribut relations de type arrayList relation
	private ArrayList<Relation> relations;
	
	
	// Initialiser la base de donn�es avec les relations
	public BD(ArrayList<Relation> relation  ) {
		
		relations = relation;
		
	}
	/*
	 * ajouter une realtion a la base de donn�es
	 * @param R : la relation � ajout�
	 * @ensure : Realtion R ajout�
	 */
	private void addRelation(Relation R) {
		
		relations.add(R);
	}
	
	
	/*
	 * Supprimer la relation de la BD si elle existe
	 * si on affiche un message 
	 * @param : realtion a supprimer 
	 */
	private void supRelation(Relation R) {
		if(!relations.contains(R)){
			System.out.println("Cette relation n'hexiste pas dans la base de données");
		}else{
			relations.remove(R);
		}
		
	}
	
	/*
	 * @return le nombre de relations dans la base de donn�es
	 */
	private int nbDeRelation() {
        return relations.size();
    }
	
	
	/*
	 * @return true si la base de donn�es est vide
	 */
	private boolean ifBDEmpty() {
        return relations.isEmpty();
    }
	
}
