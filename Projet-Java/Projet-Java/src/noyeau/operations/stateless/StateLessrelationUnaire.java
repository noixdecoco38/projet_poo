package noyeau.operations.stateless;


import noyeau.Relation;
import noyeau.Schema;

public abstract class StateLessrelationUnaire extends StateLessRelation {
	protected final Relation r;
	protected StateLessrelationUnaire(String nom, Schema schema, Relation r) {
		super(nom, schema);
		this.r = r;
	}
}
