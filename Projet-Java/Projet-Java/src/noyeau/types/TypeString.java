package noyeau.types;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class TypeString extends TypeAttribut<StringBuffer> {
	public static TypeString type = new TypeString();

	public TypeString() {}



	@Override
	public StringBuffer parse(String data) throws IOException {
		return new StringBuffer(data);
	}

	public int size() {
		return 255; 
	}

	@Override
	public void serialize(OutputStream os, StringBuffer data) throws IOException {
		os.write(data.toString().getBytes());
	}

	@Override
	public StringBuffer unserialize(InputStream is) throws IOException {
		return new StringBuffer(is.read(new byte[size()]));
	}


}
