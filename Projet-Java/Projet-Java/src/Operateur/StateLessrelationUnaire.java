package Operateur;

import BaseDeDonnee.IntefaceRelation;
import BaseDeDonnee.Relation;
import BaseDeDonnee.Schema;

public abstract class StateLessrelationUnaire extends StateLessRelation {
	protected final IntefaceRelation r;
	protected StateLessrelationUnaire(String nom, Schema schema,IntefaceRelation r) {
		super(nom, schema);
		this.r=r;
	}
	
	
	
	
}
