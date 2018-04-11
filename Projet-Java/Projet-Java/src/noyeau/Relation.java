package noyeau;

/*
 * Class relation 
 */
public abstract class Relation implements IntefaceRelation {

		private final String nomR;
		private final Schema Schema;
		/*
		 * Constructor de class pour initialiser les attributs de class
		 * @param nom : nom de la relation
		 * @param Schema : schema de la relation
		 */
		protected Relation(String nom, Schema schema) {
			Schema = schema;
			nomR=nom;
		}
		
		public int degre() {return this.Schema.degre();}
		/*
		 * @return nom de la relation
		 */
		@Override public String nom() {return nomR;}
		/*
		 * @return le schema de la relation
		 */
		@Override public Schema schema() {return Schema;}
	
}
