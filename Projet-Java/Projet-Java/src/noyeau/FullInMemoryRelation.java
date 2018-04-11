package noyeau;

import java.util.ArrayList;
import java.util.Iterator;

import noyeau.operations.statefull.StateFull;

public class FullInMemoryRelation extends StateFull {
	private final ArrayList<Tuple> tuples;

	public FullInMemoryRelation(String nom, Schema schema) {
		super(nom, schema);
		tuples = new ArrayList<>();
	}

	@Override public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Tuple>() {
			private int index = 0;
			@Override public boolean hasNext() {return index<tuples.size();}
			@Override public Tuple next() {return tuples.get(index++);}
		};
	}

	@Override public void add(Tuple t) {
		tuples.add(t);
	}

}
