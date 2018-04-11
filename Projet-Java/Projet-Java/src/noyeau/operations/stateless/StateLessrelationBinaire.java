package noyeau.operations.stateless;

import noyeau.Relation;
import noyeau.Schema;

public abstract class StateLessrelationBinaire extends StateLessRelation {
	protected final Relation r1,r2;
	protected StateLessrelationBinaire(String nom, Schema schema,Relation r1, Relation r2) {
		super(nom, schema);
		this.r1=r1;
		this.r2=r2;
	}	
}
