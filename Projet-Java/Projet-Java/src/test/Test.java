package test;

import BaseDeDonnee.Attribut;
import BaseDeDonnee.FullInMemoryRelation;
import BaseDeDonnee.ProprietesAttribut;
import BaseDeDonnee.Relation;
import BaseDeDonnee.SchemaC;
import BaseDeDonnee.Tuple;
import BaseDeDonnee.TypeString;
import Operateur.Identite;
import Operateur.Projection;

public class Test {
	public static void main(String[] args) {
		SchemaC sc = new SchemaC(
				new Attribut("NOM", new TypeString(), ProprietesAttribut.Standard),
				new Attribut("PRENOM", new TypeString(), ProprietesAttribut.Standard)
		);
		FullInMemoryRelation relation = new FullInMemoryRelation("RELATION", sc);
		relation.add(new Tuple("Zakaria","Choukchou"));
		relation.add(new Tuple("Ilyas","Bouyacoub"));
		relation.add(new Tuple("Abdou","Sassi"));
		relation.add(new Tuple("Nouredine","Ziani"));
		for(Tuple t : relation){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
		Relation r = new Identite(relation);
		for(Tuple t : r){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		Relation pr = new Projection (relation);
		for(Tuple t : r){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
	}

}
