package noyeau.operations.statefull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import noyeau.Key;
import noyeau.Relation;
import noyeau.Tuple;
import noyeau.Schema;

public class FullInFileRelation extends StateFull {
	
	private final Map<Key, Long> tuples;   
	private RandomAccessFile f = null;
	private byte [] b ;
	
	
	public FullInFileRelation(String nom, Schema schema) { 
		super(nom, schema); 
		this.tuples = new HashMap<Key, Long>();
		
		this.b = new byte[tuples.size()];
	
		try {f = new RandomAccessFile(new File(nom+".tuples"), "rw");} 
		catch (FileNotFoundException e) {e.getMessage();}
	}

	@Override
	public int degre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			private Iterator <Long> it = tuples.values().iterator();
			public boolean hasNext() {
				return it.hasNext();
			}

			public Tuple next() {
				 try {
					f.seek(it.next());
					f.read(b);
					return new Tuple(b);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
	}

	public void add(Long t) { 
		Key key = new Key(Integer.toString(tuples.size()).getBytes());
		 try {
			f.seek(f.length());
			this.tuples.put(key, f.length());
			f.write(t.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public Long getinFile(Long t) { 
		Key key = new Key(Integer.toString(tuples.size()).getBytes());
		 try {
			 
			f.seek(f.length());
			this.tuples.put(key, f.length());
			return new Long(f.read(t.toString().getBytes()));
			
		} catch (IOException e) {e.printStackTrace();}
		return null;	
	}
	
	/**
	 * charge une liste de points cartesiens en format Objet
	 * @param File le fichier à charger
	 */
	public Relation chargerFormatObjet(File f) {
		Relation r = null;
		try {		
			this.f = new RandomAccessFile(f, "rw");
			getinFile(new Long(this.f.read(b)));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
		 
	}


	public void add(Tuple t, Key c) throws IOException {
		long offset = f.length();
		f.seek(offset);
		t.serialize(f, t);
		this.tuples.put(c, offset);}

	@Override
	public void add(Tuple t) {
		// TODO Auto-generated method stub
		
	}


}
