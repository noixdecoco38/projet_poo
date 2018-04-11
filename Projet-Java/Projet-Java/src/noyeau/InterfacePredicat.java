package noyeau;

/*
 *  Interface Predicat est utilisé pour vérifier si la conditio est valide sur le tuple ou pas
 */
public interface InterfacePredicat {

/*
 * méthode pour tester si le tuple est valide par rapport a la conditon
 * 
 */
 boolean eval(Tuple t);

}
