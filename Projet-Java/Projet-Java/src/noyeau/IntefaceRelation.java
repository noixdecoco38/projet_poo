package noyeau;


/*
 * l'interface relation qui hérite de la class Iterable (ensemble des tuples)
 */
public interface IntefaceRelation extends Iterable<Tuple>{
	
	public String nom();

	public Schema schema();

}
