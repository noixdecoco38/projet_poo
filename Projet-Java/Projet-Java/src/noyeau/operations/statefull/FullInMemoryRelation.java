package noyeau.operations.statefull;

/**********************************************************************************
 * Classe FullInMemoryRelation													  *
 * Ajout de Tuples , Chargement de données , et autres utilitaires 				  *
 * :herite de StateFull:								     		  *
 **********************************************************************************/
import java.util.ArrayList;
import java.util.Iterator;

import noyeau.Schema;
import noyeau.Tuple;

public class FullInMemoryRelation extends StateFull {
	private final ArrayList<Tuple> tuples;

	/*
	 * Constructeur: chargement du nom et du schema
	 ******************************************************/
	public FullInMemoryRelation(String nom, Schema schema) {
		super(nom, schema);
		tuples = new ArrayList<>();
	}

	/*
	 * Iterator du tuple
	 ******************************************************/
	@Override public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Tuple>() {
			private int index = 0;
			@Override public boolean hasNext() {return index<tuples.size();}
			@Override public Tuple next() {return tuples.get(index++);}
		};
	}

	/*
	 * add , ajout du tuple dans la liste de tuples
	 ******************************************************/
	@Override
	public void add(Tuple t) {
		tuples.add(t);
		
	}



}
