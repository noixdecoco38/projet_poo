package noyeau;

public interface InterfaceSchema {
	public int degre();
	/**
	 * @require numAttribute>=0 & numAttribute<degre()
	 * @param numAttribute
	 * @return
	 */
	public Attribut getAttribute(int numAttribute);
}
