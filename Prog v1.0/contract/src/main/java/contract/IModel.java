package contract;

import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel 
{
	
	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	String getMap();
	/**
	 * Load the map.
	 *
	 * @param key
	 *          the key
	 */
	void loadMap(String key);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
