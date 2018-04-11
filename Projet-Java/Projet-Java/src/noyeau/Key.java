package noyeau;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import noyeau.types.TypeAttribut;
/****************************************************************************************
 * Classe implementant le concept de cle*
 * Elle instanciera des objets comparables (relation d'ordre						
 ****************************************************************************************/

public class Key implements Comparable<Key> {

		
	private byte[] key;  // key codé en byte

	
	/*
	 * Constructeur key : elle va transformer l'objet en flux byte
	 ******************************************************/
	public Key(TypeAttribut<?> type, Object key) throws IOException {
		this.key = new byte[type.size()];
		type.unserialize(new ByteArrayInputStream(key.toString().getBytes()));
	}
	
	/*
	 * Constructeur a passage standard
	 ******************************************************/
	public Key(byte[] key) {
		this.key = key;
	}


	/*
	 * methode implementant la relation d'egalite
	 * true si egual , false , si non
	 ******************************************************/
	public boolean equals(Object e) {
		
		if (e == this)return true; 
		else if (e == null)return false;
		else if (!(e instanceof Key))return false;
		// l'objet doit etre de meme instance , et non nul pour l'egalite
		
		Key elem_key = Key.class.cast(e); // On cast l'objet en key apres verification
		
		/* Verifiation de l'egalité de "valeur" */
		for (int i = 0; i < key.length; i++) {
			if (elem_key.key[i] != key[i])return false; 
		}
		return true;

	}
	
	@Override
	/*
	 * methode implementant la relation d'ordre
	 * true si a < b , false !not
	 ******************************************************/
	public int compareTo(Key element) {
		
		/* verification primaire par taille */
		if (key.length != element.key.length) { 
			try {throw new Exception("method error : compareTo");} 
			catch (Exception e) {e.printStackTrace();}
		}
		
		/* test 2 a 2 */
		for (int i = 0; i < key.length; i++) {
			if (element.key[i] < key[i])return -1;
			if (element.key[i] > key[i])return 1;
		}
		return 0;
	}

	/* retourne le hashcode du key byte */
	public int hashCode() {
		return key.hashCode();
	}



}