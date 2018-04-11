package noyeau.types;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;


/**********************************************************************************
 * Classe reprensentant un type Integer										      *
 * :herite de TypeAttribut<Integer>:								     		  *
 **********************************************************************************/

public class TypeEntier extends TypeAttribut<Integer> {
	public static final TypeEntier type = new TypeEntier();

	public TypeEntier() {}


	/*
	 * parse() , utilisation du parseur de la classe Integer
	 ******************************************************/
	@Override
	public Integer parse(String is) throws IOException {
		return Integer.parseInt(is);
	}

	/*
	 * size() , taille d'un Type integer en java
	 ******************************************************/
	@Override
	public int size() {
		return Integer.SIZE;
	}

	/*
	 * serialize() serialization vers le outputstream
	 ******************************************************/
	@Override
	public void serialize(OutputStream os, Integer data) throws IOException {
		os.write(data.toString().getBytes());		
	}

	/*
	 * unserialize() , Input Stream ---> Integer object
	 ******************************************************/
	@Override
	public Integer unserialize(InputStream is) throws IOException {
		return new Integer(is.read(new byte[size()]));
	}

}
