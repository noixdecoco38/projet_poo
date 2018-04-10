package Operateur;

import java.util.Iterator;
import BaseDeDonnee.Predicat;
import BaseDeDonnee.IntefaceRelation;
import BaseDeDonnee.Tuple;

public class Selection extends StateLessrelationUnaire implements Predicat{

	
	
	private final int[] indexes;
	public Selection( IntefaceRelation r, Predicat p) {
		super(r.nom(), r.schema(), r);
		indexes = new int[r.schema().degre()];
	}

	@Override
	public Iterator<Tuple> iterator() {
	
		return new Iterator<Tuple>() {
			private Iterator<Tuple>it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}

			@Override public Tuple next() {
				Tuple t = it.next();
				Object[] temp = new Object[indexes.length];
				for(int i = 0; i<indexes.length;i++) 
					if (eval())
						temp[i] = t.get(indexes[i]);
				return new Tuple(temp);
			}
		};
	}

	@Override
	public boolean eval() {
		
		return true;
	}

}
