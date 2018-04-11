package noyeau;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;


/****************************************************************************************
 * Classe implementant le concept de tuple
 * tuple : ensemble de valeurs (object) d'une relations , c'est donc iterable				
 ****************************************************************************************/

public class Tuple implements Iterable<Object>{

		private Object[] valeurTuple;
		
		/*
		 * Constructeur Tuple : passage de la liste d'objects (valeurs) 
		 ******************************************************/
		public Tuple(Object... valeur) {
			valeurTuple=valeur;
		}
		
		
		/*
		 * Iterator Tuple :
		 ********************************************/
		@Override
		public Iterator<Object> iterator() {
			// TODO Auto-generated method stub
			return new Iterator<Object>() {
				private int index = 0;
				@Override public boolean hasNext() {return index<valeurTuple.length ;}
				@Override public Object next() {return valeurTuple[index++];}
			};
		}

		/*
		 * get() permet la selection d'une des valeurs d'un tuple
		 ********************************************/
		public Object get(int i) {return valeurTuple[i];}
		
		
		/*
		 * serialize: transformation de l'objet en flux Integer
		 ********************************************/
		public void serialize(RandomAccessFile os, Integer data) throws IOException {
			os.write(data.toString().getBytes());		
		}

		/*
		 * serialize: transformation de l'objet en flux byte
		 ********************************************/
		public void serialize(RandomAccessFile os, Tuple data) throws IOException {
				for (Object o : data)os.write(data.toString().getBytes());	
		}
}
