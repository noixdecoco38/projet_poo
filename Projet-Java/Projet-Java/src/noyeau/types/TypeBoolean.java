package noyeau.types;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**********************************************************************************
 * Classe reprensentant un type boolean											  *
 * :herite de TypeAttribut<Double>:														  *
 **********************************************************************************/

public class TypeBoolean extends TypeAttribut<Boolean> {
	public static final TypeBoolean type = new TypeBoolean();

	public TypeBoolean() {}

	/*
	 * parse() , utilisation du parseur de la classe boolean
	 ******************************************************/
	@Override
	public Boolean parse(String is) throws IOException {
		return Boolean.parseBoolean(is);
	}
	
	/*
	 * size() , en DB la taille d'un boolean est de 1
	 ******************************************************/
	@Override
	public int size() {
		return 1;
	}

	/*
	 * serialize() serialization vers le outputstream
	 ******************************************************/
	@Override
	public void serialize(OutputStream os, Boolean data) throws IOException {
		os.write(data.toString().getBytes());				
	}

	/*
	 * unserialize() , Input Stream ---> Boolean object
	 ******************************************************/
	@Override
	public Boolean unserialize(InputStream is) throws IOException {
		return new Boolean(new StringBuffer(is.read()).toString());
	}

}
