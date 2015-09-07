import javax.swing.JFrame;

public class Application 
{
	public static void main(String[] args)
	{
		//instantiates new GUI object
		GUI window = new GUI();
		//program ends when window is closed
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//size of window
		window.setSize(1024, 720);
		//window is made visible
		window.setVisible(true);
	}
}
