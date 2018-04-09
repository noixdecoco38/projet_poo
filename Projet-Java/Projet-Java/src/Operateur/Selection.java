package Operateur;

import java.util.Iterator;

import BaseDeDonnee.Predicat;
import BaseDeDonnee.Relation;
import BaseDeDonnee.SchemaC;
import BaseDeDonnee.Tuple;

public class Selection extends StateLessrelationUnaire {

	
	protected Predicat p;
	protected Selection(String nom, SchemaC schema, Relation r, Predicat p) {
		super(nom, schema, r);
		
	}

	@Override
	public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
