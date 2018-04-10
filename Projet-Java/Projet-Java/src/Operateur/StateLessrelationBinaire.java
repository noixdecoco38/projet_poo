package Operateur;

import BaseDeDonnee.IntefaceRelation;
import BaseDeDonnee.Schema;

public abstract class StateLessrelationBinaire extends StateLessRelation {
	protected final IntefaceRelation r1,r2;
	protected StateLessrelationBinaire(String nom, Schema schema,IntefaceRelation r1, IntefaceRelation r2) {
		super(nom, schema);
		this.r1=r1;
		this.r2=r2;
	}
	
	
	
	
}
