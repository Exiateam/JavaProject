package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel 
{
	/** The map. */
	private String map;
	int x;
	int y;
	public Lorann lorann;
	public FireBall fireBall;
	public Crystal_Ball crystal_ball;
	public Gate_Closed gate_closed;
	public Gate_Open gate_open;
	public Bone bone;
	public Bone_Horizontal bone_horizontal;
	public Bone_Vertical bone_vertical;
	public Demon1 demon1;
	public Demon2 demon2;
	public Demon3 demon3;
	public Demon4 demon4;
	public Purse purse;
	public Empt empt;
	
	/**
	 * Instantiates a new model.
	 */
	public Model() 
	{
		this.map = "";
		x++;
		for (int i = 0; i != 240; i++)
    	{
        	char c = (!map.equals("")) ? map.charAt(i) : ' ';
        	if (c == '\n')
        	{
        		y++;
        		x = 0;
        	}
        	switch (c)
        	{
        	case 'A':
        		this.lorann = new Lorann(x*32, y*32);
        		break;
        	case 'B':
        		this.fireBall = new FireBall(x*32, y*32);
        		break;
        	case 'C':
        		this.crystal_ball = new Crystal_Ball(x*32, y*32);
        		break;
        	case 'D':
        		this.gate_closed = new Gate_Closed(x*32, y*32);
        		break;
        	case 'E':
        		this.gate_open = new Gate_Open(x*32, y*32);
        		break;
        	case 'F':
        		this.bone = new Bone(x*32, y*32);
        		break;
        	case 'G':
        		this.bone_horizontal = new Bone_Horizontal(x*32, y*32);
        		break;
        	case 'H':
        		this.bone_vertical = new Bone_Vertical(x*32, y*32);
        		break;
        	case 'I':
        		this.demon1= new Demon1(x*32, y*32);
        		break;
        	case 'J':
        		this.demon2= new Demon2(x*32, y*32);
        		break;
        	case 'K':
        		this.demon3= new Demon3(x*32, y*32);
        		break;
        	case 'L':
        		this.demon4= new Demon4(x*32, y*32);
        		break;
        	case 'M':
        		this.purse = new Purse(x*32, y*32);
        		break;
        	case 'N':
        		this.empt = new Empt(x*32, y*32);
        		break;
        	}
    	}
	}	
	
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMap()
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
	private void setMap(final String map) {
		this.map = map;
		this.setChanged();
		this.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMap(java.lang.String)
	 */
	public void loadMap(final String key) {
		try {
			final DAOMap daoMap = new DAOMap(DBConnection.getInstance().getConnection());
			this.setMap(daoMap.find(key).getMap());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
}
