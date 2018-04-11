package noyeau.operations.statefull;

import noyeau.Relation;
import noyeau.Schema;
import noyeau.Tuple;

public abstract class StateFull extends Relation{

	protected StateFull(String nom, Schema schema) {super(nom, schema);}

	public abstract void add(Tuple t);

	
}
