package Operateur;

import java.util.Iterator;

import BaseDeDonnee.Attribut;
import BaseDeDonnee.Relation;
import BaseDeDonnee.Tuple;

public class Projection extends StateLessrelationUnaire {
	
	private final int[] indexes;
	public Projection(Relation r) {
		super(r.nom(), r.schema(), r);
		Attribut at;
		indexes = new int[r.schema().degre()];
		for (int i =0;i<indexes.length;i++) {
			at =r.schema().getAttribute(i);
			indexes[i] = r.schema().getOrdre(at);
		}
		
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
