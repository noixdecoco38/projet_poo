package noyeau.operations.stateless;

import java.util.Iterator;

import noyeau.Attribut;
import noyeau.Relation;
import noyeau.Tuple;
import noyeau.Schema;
public class Projection extends StateLessrelationUnaire {
	
	private final int[] indexes;
	public Projection(Relation r,Schema sc) {
		super(r.nom(), sc, r);
		Attribut at;
		indexes = new int[sc.degre()];
		for (int i =0;i<indexes.length;i++) {
			at =sc.getAttribute(i);
			indexes[i] = sc.getOrdre(at);
		}
		
	}

	@Override
	public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			private Iterator<Tuple> it = r.iterator();
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
