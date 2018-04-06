package Operateur;

import BaseDeDonnee.Relation;
import BaseDeDonnee.SchemaC;

public abstract class StateLessrelationBinaire extends StateLessRelation {
	protected final Relation r1,r2;
	protected StateLessrelationBinaire(String nom, SchemaC schema,Relation r1, Relation r2) {
		super(nom, schema);
		this.r1=r1;
		this.r2=r2;
	}
	
	
	
	
}
