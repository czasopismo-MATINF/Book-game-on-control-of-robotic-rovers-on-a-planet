package game.control.robot.rovers.board;

import java.io.Serializable;

public class Blizzard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected int volume;

	public Blizzard(int volume) {
		super();
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

}
