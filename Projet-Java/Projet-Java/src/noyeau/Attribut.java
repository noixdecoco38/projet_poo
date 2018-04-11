package noyeau;

import noyeau.types.TypeAttribut;
/*
 * Class Attribut represente un attribut d'un schema.
 * 
 */
public class Attribut {
	
	// Nom de l'attribut
	private final String nameAttribut;
	// Type de l'attribut
	private final TypeAttribut<?> typeAttribut;
	// Type de l'attribut
	private Boolean ifPrimaryKey = false;
		
	/*
	 * Constructeur de class pour initialiser les attributs de la class
	 * @param nom : le nom de l'attribut
	 * @param type : le type de l'attribut
	 * @param prop : propriété de l'attribut (clé primaire,étrangaire ou standard)
	 */
	public Attribut(String nom,TypeAttribut<?> type,ProprietesAttribut prop){
		
		nameAttribut=nom;
		typeAttribut=type;
		if(prop==ProprietesAttribut.primaire) {
			ifPrimaryKey=true;
		}
	}
	
	/**
	 * @return true si l'attribut est une clé primaire
	 */
	public Boolean getifPrimaryKey() {
		return ifPrimaryKey;
	}

	/**
	 * @return le nom de l'attribut
	 */
	public String getNameAttribut() {
		return nameAttribut;
	}

	/**
	 * @return le type de l'attribut
	 */
	public TypeAttribut<?> getTypeAttribut() {
		return typeAttribut;
	}
	
}
