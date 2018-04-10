package BaseDeDonnee;

public class Attribut {
	
	private final String nameAttribut;
	private final TypeAttribut<?> typeAttribut;
	private Boolean ifPrimaryKey = false;
		
	public Attribut(String nom,TypeAttribut<?> type,ProprietesAttribut prop){
		
		nameAttribut=nom;
		typeAttribut=type;
		if(prop==ProprietesAttribut.primaire) {
			ifPrimaryKey=true;
		}
	}
	
	/**
	 * @return True if the attribute is primary key
	 */
	public Boolean getifPrimaryKey() {
		return ifPrimaryKey;
	}

	/**
	 * @return the nameAttribut
	 */
	public String getNameAttribut() {
		return nameAttribut;
	}

	/**
	 * @return the typeAttribut
	 */
	public TypeAttribut<?> getTypeAttribut() {
		return typeAttribut;
	}
	
}
