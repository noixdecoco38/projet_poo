package noyeau.operations.stateless;

import java.util.Iterator;

import noyeau.IntefaceRelation;
import noyeau.Tuple;

public class Identite extends StateLessrelationUnaire {

	public Identite(IntefaceRelation r) {
		super("identite("+r.nom()+")", r.schema(), r);
		// TODO Auto-generated constructor stub
	}

	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}

			@Override public Tuple next() {return it.next();}
		};
	}

}
