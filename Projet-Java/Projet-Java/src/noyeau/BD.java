package noyeau;

import java.util.ArrayList;

public class BD {
	
	private ArrayList<Relation> relations;
	
	
	
	public BD(ArrayList<Relation> relation  ) {
		
		relations = relation;
		
	}
	
	private void addRelation(Relation R) {
		
		relations.add(R);
	}
	
	private void supRelation(Relation R) {
		if(!relations.contains(R)){
			System.out.println("Cette relation n'hexiste pas dans la base de données");
		}else{
			relations.remove(R);
		}
		
	}
	
	private int nbDeRelation() {
        return relations.size();
    }
	
	private boolean ifBDEmpty() {
        return relations.isEmpty();
    }
	
}
