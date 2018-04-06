package BaseDeDonnee;

public class Attribut {
	
	private final String nomA;
	private final TypeAttribut<?> typeA;
	private final ProprietesAttribut protAtt;
	public Attribut(String nom, TypeAttribut<?> type, ProprietesAttribut prop){
		this.nomA = nom;
		this.typeA = type;
		this.protAtt= prop;
	}
}
