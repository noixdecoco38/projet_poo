package noyeau;

import java.io.IOException;
import java.io.RandomAccessFile;
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
		
		
		public void serialize(RandomAccessFile os, Integer data) throws IOException {
			os.write(data.toString().getBytes());		
		}

		public void serialize(RandomAccessFile os, Tuple data) throws IOException {
				for (Object o : data)os.write(data.toString().getBytes());	
		}
}
