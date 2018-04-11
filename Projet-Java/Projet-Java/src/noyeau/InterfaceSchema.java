package noyeau;

public interface InterfaceSchema {
	
	/*
	 * @return le degrer tu schema
	 */
	public int degre();
	
	/**
	 * @require numAttribute>=0 & numAttribute<degre()
	 * @param numAttribute
	 * @return attribut
	 */
	public Attribut getAttribute(int numAttribute);
}
