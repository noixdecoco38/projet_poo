package BaseDeDonnee;

/**
 * @invariant degre()>0
 * @author mourthas
 *
 */
public class SchemaC implements Schema {
	private final Attribut[] attributs;
//	private ArrayList<Attribut> cle;
	/**
	 * @require attribut.length>0
	 * @param attributs
	 */
	public SchemaC(Attribut... attributs) {		this.attributs = attributs;}
	public Attribut getAttribute(int numAttribute) {return attributs[numAttribute];}
	public int degre(){return attributs.length;}
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
