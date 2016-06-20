package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController 
{
	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;
	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) 
	{
		this.setView(view);
		this.setModel(model);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() 
	{
		this.view.printMap("Press the key ‘A’, ‘Z’, ‘E’, ‘R’ or ‘T’ to display the map you have chosen. \nUse the key Up, Down, Left, Right to move Lorann. \nUse the space key to throw the fireball. \nNow let’s play.");
	}
	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) 
	{
		this.view = view;
	}
	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) 
	{
		this.model = model;
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) 
	{
		switch (controllerOrder) {
			case Map1:
				this.model.loadMap("MAP1");
				break;
			case Map2:
				this.model.loadMap("MAP2");
				break;
			case Map3:
				this.model.loadMap("MAP3");
				break;
			case Map4:
				this.model.loadMap("MAP4");
				break;
			case Map5:
				this.model.loadMap("MAP5");
				break;
			case MoveUp:
				break;
			case MoveDown:
				break;
			case MoveRight:
				break;
			case MoveLeft:
				break;
			case Shot:
				break;
			case Error:
				break;
			default:
				break;
		}
	}
}
