package Operateur;

import BaseDeDonnee.Relation;
import BaseDeDonnee.RelationC;
import BaseDeDonnee.SchemaC;

public abstract class StateLessrelationUnaire extends StateLessRelation {
	protected final Relation r;
	protected StateLessrelationUnaire(String nom, SchemaC schema,Relation r) {
		super(nom, schema);
		this.r=r;
	}
	
	
	
	
}
