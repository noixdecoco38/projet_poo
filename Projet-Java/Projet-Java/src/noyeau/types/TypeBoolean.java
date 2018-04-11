package noyeau.types;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TypeBoolean extends TypeAttribut<Boolean> {
	public static final TypeBoolean type = new TypeBoolean();

	public TypeBoolean() {}

	@Override
	public Boolean parse(String is) throws IOException {
		return Boolean.parseBoolean(is);
	}

	@Override
	public int size() {
		return 1;
	}

	@Override
	public void serialize(OutputStream os, Boolean data) throws IOException {
		os.write(data.toString().getBytes());				
	}

	@Override
	public Boolean unserialize(InputStream is) throws IOException {
		return new Boolean(new StringBuffer(is.read()).toString());
	}

}
