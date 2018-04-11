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


/**********************************************************************************
 * Classe FullInFileRelation:													  *
 * Ajout de Tuples , Chargement de données , et autres utilitaires 				  *
 * :herite de StateFull:								     		  *
 **********************************************************************************/
public class FullInFileRelation extends StateFull {
	
	private RandomAccessFile file_access;
	private final Map<Key, Long> tuples;   
	private byte [] bites ;
	
	
	/*
	 * Constructeur: entree nom / schema
	 ******************************************************/
	
	public FullInFileRelation(String file_name, Schema schema) {
		super(file_name, schema);  // appel du constructeur Statefull
		
		this.tuples = new HashMap<Key, Long>(); //matrice Clé : Tuple
		this.bites = new byte[tuples.size()];
		
		//Creation d'un fichier.bd qui contient les tuples and bd
		try {file_access = new RandomAccessFile(new File(file_name +".bd"), "rw");} 
		catch (FileNotFoundException e) {e.getMessage();}
		//try_catch si la creation echoue
	}


	/*
	 * iterator<long> , Permet l'iteration Tuple
	 ******************************************************/
	@Override
	public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			
			private Iterator <Long> it = tuples.values().iterator();
			public boolean hasNext() {return it.hasNext();}

			public Tuple next() {
				 try {
					file_access.seek(it.next()); //recherche du Long t
					file_access.read(bites); //lecture
					return new Tuple(bites); 
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
	}

	
	/*
	 * add(long t), ajout d'un tuple serialisé
	 ******************************************************/
	public void add(Long t) { 
		//Key correspond a la taille - 1 indice 
		Key key = new Key(Integer.toString(tuples.size()).getBytes()); 
		 try {
			//on ecrit le tuple serialize dans le fichier
			file_access.seek(file_access.length()); // taille =  "index" en quelque sorte
			this.tuples.put(key, file_access.length()); //affecter fil_acess.length to key
			//ecriture du tuple serialize dans le fichier
			file_access.write(t.toString().getBytes()); 
		} catch (IOException e) {
			e.printStackTrace(); // catch d'erreur
		}	
	}
	
	/*
	 * getInFile(long t), permet la lecture d'un tuple long du inFile
	 ******************************************************************/
	public Long getinFile(Long t) { 
		Key key = new Key(Integer.toString(tuples.size()).getBytes());
		 try {
			file_access.seek(file_access.length()); //recherche du dernier element
			this.tuples.put(key, file_access.length()); //enregistre la cle 
			return new Long(file_access.read(t.toString().getBytes())); //lecture
		} catch (IOException e) {e.printStackTrace();}
		return null;	
	}
	
	
	/*
	 * chargerFormatObjet(), entree fichier 
	 * 
	 ******************************************************/
	public Relation chargerFormatObjet(File f) {
		Relation r = null;
		try {		
			this.file_access = new RandomAccessFile(f, "rw");
			getinFile(new Long(this.file_access.read(bites)));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
		 
	}

	/*
	 * add() , ajout d'un tuple , cle stockee
	 ******************************************************/
	public void add(Tuple t, Key key) throws IOException {
		file_access.seek(file_access.length());
		long temp = file_access.length();
		
		t.serialize(file_access, t); //serialization
		this.tuples.put(key, temp);}

	/*
	 * add() , add d'un tuple + key generee
	 ******************************************************/
	@Override
	public void add(Tuple t) {
		Key key = new Key(Integer.toString(tuples.size()).getBytes());
		try {
			add(t,key); // utilisation du ass avec key stockée
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
