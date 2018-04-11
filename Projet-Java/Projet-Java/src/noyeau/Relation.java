package noyeau;


public abstract class Relation implements IntefaceRelation {

		private final String nomR;
		private final Schema Schema;
		
		protected Relation(String nom, Schema schema) {
			Schema = schema;
			nomR=nom;
		}
		
		public int degre() {return this.Schema.degre();}
		
		@Override public String nom() {return nomR;}

		@Override public Schema schema() {return Schema;}
	
}
