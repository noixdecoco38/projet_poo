package test;

import BaseDeDonnee.Attribut;
import BaseDeDonnee.FullInMemoryRelation;
import BaseDeDonnee.ProprietesAttribut;
import BaseDeDonnee.IntefaceRelation;
import BaseDeDonnee.Schema;
import BaseDeDonnee.Tuple;
import BaseDeDonnee.TypeString;
import Operateur.Identite;
import Operateur.Projection;
import Operateur.Selection;

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
		
		IntefaceRelation r = new Identite(relation);
		for(Tuple t : r){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		IntefaceRelation pr = new Projection (relation);
		for(Tuple t : pr){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
		
		IntefaceRelation sel = new Selection (relation,null);
		for(Tuple t : sel){
			for(Object o : sel){
				System.out.print(o+" ");
			}
			System.out.println();
		}
	}

}
