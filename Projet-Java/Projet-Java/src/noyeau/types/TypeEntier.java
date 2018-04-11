package noyeau.types;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class TypeEntier extends TypeAttribut<Integer> {
	public static final TypeEntier type = new TypeEntier();

	public TypeEntier() {}


	@Override
	public Integer parse(String is) throws IOException {
		return Integer.parseInt(is);
	}

	@Override
	public int size() {
		return 4;
	}

	@Override
	public void serialize(OutputStream os, Integer data) throws IOException {
		os.write(data.toString().getBytes());		
	}

	@Override
	public Integer unserialize(InputStream is) throws IOException {
		return new Integer(is.read(new byte[size()]));
	}

}
