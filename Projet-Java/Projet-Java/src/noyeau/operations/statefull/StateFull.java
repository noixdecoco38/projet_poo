package noyeau.operations.statefull;

import java.io.IOException;

import noyeau.Key;
import noyeau.Relation;
import noyeau.Schema;
import noyeau.Tuple;

/**********************************************************************************
 * Classe Statefull:													  *
 * Classe mere de tous les StateFullin.				  *
 * :herite de Relation								     		  *
 **********************************************************************************/
public abstract class StateFull extends Relation{

	/*
	 * Constructeur: entree nom / schema
	 ******************************************************/
	protected StateFull(String nom, Schema schema) {super(nom, schema);}


	/*
	 * add(): minimum ajouter un tuple
	 ******************************************************/
	public abstract void add(Tuple t);

	
}
