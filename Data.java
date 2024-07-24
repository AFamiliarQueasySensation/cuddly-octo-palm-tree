
public class Data {

	private String config;
	private int score;
	
	
	//Blue = 'X', Red = 'O'
	public Data(String Config, int Score)
	{
		this.config = Config;
		this.score = Score;
	}
	
	public String getConfiguration()
	{
		return config;
	}
	
	public int getScore()
	{
		return score;
	}
	


	
}
