package noyeau;


/*
 * l'interface relation qui h�rite de la class Iterable (ensemble des tuples)
 */
public interface IntefaceRelation extends Iterable<Tuple>{
	
	public String nom();

	public Schema schema();

}
