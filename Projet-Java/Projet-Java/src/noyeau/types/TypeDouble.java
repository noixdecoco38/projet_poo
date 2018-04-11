package noyeau.types;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TypeDouble extends TypeAttribut<Double> {
	public static final TypeDouble type = new TypeDouble();

	private TypeDouble() {
	}

	@Override
	public Double parse(String is) throws IOException {
		return Double.parseDouble(is);
	}
	
	@Override
	public int size() {
		return 8;
	}

	@Override
	public void serialize(OutputStream os, Double data) throws IOException {
		os.write(data.toString().getBytes());		
	}

	@Override
	public Double unserialize(InputStream is) throws IOException {
		return new Double(is.read(new byte[size()]));
	}

	
}