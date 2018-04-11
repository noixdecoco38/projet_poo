package noyeau.operations.statefull;

import java.io.IOException;

import noyeau.Key;
import noyeau.Relation;
import noyeau.Schema;
import noyeau.Tuple;


public abstract class StateFull extends Relation{

	protected StateFull(String nom, Schema schema) {super(nom, schema);}


	public abstract void add(Tuple t);

	
}
