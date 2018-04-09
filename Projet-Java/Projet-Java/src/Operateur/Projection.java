package Operateur;

import java.util.Iterator;

import BaseDeDonnee.Relation;
import BaseDeDonnee.SchemaC;
import BaseDeDonnee.Tuple;

public class Projection extends StateLessrelationUnaire {
	
	private final int[] indexes;
	protected Projection(String nom, SchemaC schema, Relation r) {
		super(nom, schema, r);
		indexes = new int[schema.degre()];
		
		
	}

	@Override
	public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			private Iterator<Tuple>it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}

			@Override public Tuple next() {
				Tuple t = it.next();
				Object[] temp = new Object[indexes.length];
				for(int i = 0; i<indexes.length;i++) temp[i] = t.get(indexes[i]);
				return new Tuple(temp);
			}
		};

	
	}

}
