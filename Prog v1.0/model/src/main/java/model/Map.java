package model;

/**
 * The Class Map.
 *
 * @author Jean-Aymeric Diet
 */
class Map extends Entity {

	/** The id. */
	private int			id;

	/** The key. */
	private String	key;

	/** The message. */
	private String	map;

	/**
	 * Instantiates a new hello world.
	 *
	 * @param id
	 *          the id
	 * @param key
	 *          the key
	 * @param map
	 *          the map
	 */
	public Map(final int id, final String key, final String map) {
		this.setId(id);
		this.setKey(key);
		this.setMap(map);
	}

	/**
	 * Instantiates a new hello world.
	 */
	public Map() {
		this(0, "", "");
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *          the new key
	 */
	public void setKey(final String key) {
		this.key = key;
	}

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public String getMap() {
		return this.map;
	}

	/**
	 * Sets the map.
	 *
	 * @param map
	 *          the new map
	 */
	public void setMap(final String map) {
		this.map = map;
	}

}
