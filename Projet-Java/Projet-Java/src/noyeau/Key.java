package noyeau;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import noyeau.types.Type;


public class Key implements Comparable<Key> {

	private byte[] key;

	
	public Key(Type<?> type, Object key) throws IOException {
		this.key = new byte[type.size()];
		type.unserialize(new ByteArrayInputStream(key.toString().getBytes()));
	}
	
	
	public Key(byte[] key) {
		this.key = key;
	}


	public boolean equals(Object e) {
		
		if (e == this)return true;
		
		else if (e == null)return false;
		else if (!(e instanceof Key))return false;
		
		
		Key elem_key = Key.class.cast(e);
		
		for (int i = 0; i < key.length; i++) {
			if (elem_key.key[i] != key[i])return false;
		}
		return true;

	}
	
	@Override
	public int compareTo(Key element) {
		
		if (key.length != element.key.length) {
			try {throw new Exception("method error : compareTo");} 
			catch (Exception e) {e.printStackTrace();}
		}
		
		for (int i = 0; i < key.length; i++) {
			if (element.key[i] < key[i])return -1;
			if (element.key[i] > key[i])return 1;
		}
		return 0;
	}

	public int hashCode() {
		return key.hashCode();
	}


}