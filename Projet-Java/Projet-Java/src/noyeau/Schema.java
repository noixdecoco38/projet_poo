package noyeau;

/*
 * @invariant degre()>0
 *
 */
public class Schema implements InterfaceSchema {
	private final Attribut[] attributs;
 
	/**
	 * @require attribut.length>0
	 * @param attributs
	 */
	public Schema(Attribut... attributs) {		this.attributs = attributs;}
	public Attribut getAttribute(int numAttribute) {return attributs[numAttribute];}
	public int degre(){return attributs.length;}
	/*
	 * retourner l'ordre de l'attribut passé en paramètre s'il existe
	 * @param a : l'attribut dont on cherche l'indice
	 * @return l'indice (l'ordre) de l'attribut s'il existe si non return -1
	 */
	public int getOrdre(Attribut a) {
		int i;
		for(i=0;i<attributs.length;i++) {
			if(attributs[i].equals(a)) {
				return i;
			}
		}
		return -1;
	}
}
