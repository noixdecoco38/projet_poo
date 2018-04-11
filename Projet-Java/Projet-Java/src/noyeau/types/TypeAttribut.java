package noyeau.types;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class TypeAttribut<T> {

	public abstract T parse(String is) throws IOException;
	public abstract int size() throws IOException;
	
	public abstract void serialize(OutputStream os, T data) throws IOException;
	public abstract T unserialize(InputStream is) throws IOException;
}
