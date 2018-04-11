package test;

import noyeau.Attribut;
import noyeau.ProprietesAttribut;
import noyeau.Relation;
import noyeau.Schema;
import noyeau.Tuple;
import noyeau.operations.statefull.FullInMemoryRelation;
import noyeau.operations.stateless.Identite;
import noyeau.operations.stateless.Projection;
import noyeau.operations.stateless.Selection;
import noyeau.types.TypeString;

public class Test {
	public static void main(String[] args) {
		Schema sc = new Schema(
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
		for(Tuple t : pr){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
		Relation sel = new Selection (relation,null);
		for(Tuple t : sel){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
	}

}
