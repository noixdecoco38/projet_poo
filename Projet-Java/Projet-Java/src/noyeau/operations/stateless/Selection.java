package noyeau.operations.stateless;

import java.util.Iterator;
import java.util.NoSuchElementException;

import noyeau.IntefaceRelation;
import noyeau.InterfacePredicat;
import noyeau.Relation;
import noyeau.Tuple;

public class Selection extends StateLessrelationUnaire{

	
	private final InterfacePredicat p;
	private final int[] indexes;
	public Selection( Relation r, InterfacePredicat p) {
		super(r.nom(), r.schema(), r);
		this.p = p;
		indexes = new int[r.schema().degre()];
	}

	@Override
	public Iterator<Tuple> iterator() {
	
		return new Iterator<Tuple>() {
			
			private Tuple next;
			private boolean hasNext=getNext();
			private Iterator<Tuple>it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}

			@Override public Tuple next() {
				if(!hasNext) throw new NoSuchElementException();
				Tuple t = next;
				hasNext =getNext();
				return t;
			}

			private boolean getNext() {
				boolean b=false;
				while(it.hasNext() && !(b=p.eval(next = it.next())));
				return b;
			}	
		};
	}


}
