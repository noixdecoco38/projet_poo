package BaseDeDonnee;

import java.util.Iterator;

public class Tuple implements Iterable<Object>{

		private Object[] valeurTuple;
		
		public Tuple(Object... valeur) {
			
			valeurTuple=valeur;
			
		}

		@Override
		public Iterator<Object> iterator() {
			// TODO Auto-generated method stub
			return new Iterator<Object>() {
				private int index = 0;
				@Override public boolean hasNext() {return index<valeurTuple.length ;}
				@Override public Object next() {return valeurTuple[index++];}
			};
		}

		public Object get(int i) {return valeurTuple[i];}
}
