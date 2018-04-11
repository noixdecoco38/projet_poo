package noyeau.types;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/****************************************************************************************
 * Classe generique constituera plus tard 4 methodes implementable  par les autres Types*
 * @param <T> T etant un type primitif													*
 ****************************************************************************************/
public abstract class TypeAttribut<T> {

	/*
	 * methode parse() , permetra le parse de la chaine de caractere 
	 *****************************************************************/
	public abstract T parse(String is) throws IOException;
	
	/*
	 * size() , retourne la taille du type en question
	 ***************************************************/
	public abstract int size() throws IOException;
	
	
	/*
	 * serialize() objet -> state byte stream()
	 * unserialize() revenir un a un objet java
	 ***************************************************/	
	public abstract void serialize(OutputStream os, T data) throws IOException;
	public abstract T unserialize(InputStream is) throws IOException;
}
