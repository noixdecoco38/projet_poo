package noyeau.types;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**********************************************************************************
 * Classe reprensentant un type double											  *
 * :herite de TypeAttribut<Double>:												  *
 **********************************************************************************/

public class TypeDouble extends TypeAttribut<Double> {
	public static final TypeDouble type = new TypeDouble();

	private TypeDouble() {}
	
	/*
	 * parse() , utilisation du parseur de la classe Double
	 ******************************************************/
	@Override
	public Double parse(String is) throws IOException {
		return Double.parseDouble(is);
	}
	

	/*
	 * size() , en DB la taille d'un Double est de 8 bytes
	 ******************************************************/
	@Override
	public int size() {
		return Double.SIZE;
	}

	/*
	 * serialize() serialization vers le outputstream
	 ******************************************************/
	@Override
	public void serialize(OutputStream os, Double data) throws IOException {
		os.write(data.toString().getBytes());		
	}

	/*
	 * unserialize() , Input Stream ---> Double object
	 ******************************************************/
	@Override
	public Double unserialize(InputStream is) throws IOException {
		return new Double(is.read(new byte[size()]));
	}

	
}