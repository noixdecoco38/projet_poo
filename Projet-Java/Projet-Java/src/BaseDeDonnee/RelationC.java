package BaseDeDonnee;


public abstract class RelationC implements Relation {

		private final String nomR;
		private final SchemaC Schema;
		
		protected RelationC(String nom, SchemaC schema) {
			Schema = schema;
			nomR=nom;
		}

		@Override public String nom() {return nomR;}

		@Override public SchemaC schema() {return Schema;}
	
}
