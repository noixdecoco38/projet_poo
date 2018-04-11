package noyeau.types;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;


/**********************************************************************************
 * Classe reprensentant un type double											  *
 * :herite de TypeAttribut<StringBuffer>:												  *
 **********************************************************************************/

public class TypeString extends TypeAttribut<StringBuffer> {
	public static TypeString type = new TypeString();

	public TypeString() {}

	/*
	 * parse() , le parse n'a pas lieu au tant que telle (String de base)
	 *******************************************************************/
	@Override
	public StringBuffer parse(String data) throws IOException {
		return new StringBuffer(data);
	}

	/*
	 * size() , en DB la taille d'un Double est de 8 bytes
	 ******************************************************/
	public int size() {
		return 255; 
	}

	/*
	 * serialize() serialization vers le outputstream
	 ******************************************************/
	@Override
	public void serialize(OutputStream os, StringBuffer data) throws IOException {
		os.write(data.toString().getBytes());
	}

	/*
	 * unserialize() , Input Stream ---> StringBuffer object
	 ******************************************************/
	@Override
	public StringBuffer unserialize(InputStream is) throws IOException {
		return new StringBuffer(is.read(new byte[size()]));
	}
}
