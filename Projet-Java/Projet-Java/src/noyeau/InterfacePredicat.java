package noyeau;

/*
 *  Interface Predicat est utilis� pour v�rifier si la conditio est valide sur le tuple ou pas
 */
public interface InterfacePredicat {

/*
 * m�thode pour tester si le tuple est valide par rapport a la conditon
 * 
 */
 boolean eval(Tuple t);

}
