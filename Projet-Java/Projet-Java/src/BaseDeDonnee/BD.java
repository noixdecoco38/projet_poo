package BaseDeDonnee;

import java.util.ArrayList;

public class BD {
	
	private ArrayList<RelationC> relations;
	
	
	
	public BD(ArrayList<RelationC> relation  ) {
		
		relations = relation;
		
	}
	
	private void addRelation(RelationC R) {
		
		relations.add(R);
	}
	
	private void supRelation(RelationC R) {
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
