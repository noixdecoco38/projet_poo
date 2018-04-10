package Operateur;

import java.util.ArrayList;
import java.util.Iterator;

import BaseDeDonnee.Relation;
import BaseDeDonnee.Schema;
import BaseDeDonnee.Tuple;

public abstract class StateLessRelation extends Relation{

	protected StateLessRelation(String nom, Schema schema) {
		super(nom, schema);
		// TODO Auto-generated constructor stub
	}
}
