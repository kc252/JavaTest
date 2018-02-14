package ie.dit;

public class Tune implements Player{

	private int x;
	private String title;
	private String altTitle;
	private String notation;

	public String getTitle(){
		return title;
	}

	public String getAltTitle(){
		return altTitle;
	}

	public String getNotation(){
		return notation;
	}

	public int getX(){
		return x; 
	}


	public String toString()
	{

		StringBuffer sb = new StringBuffer();
		sb.append(getX());
		sb.append(", ");
		sb.append(getTitle());
		sb.append(" ");

		String alt = getAltTitle();

		if(alt == null){
			return sb.toString();
		}
		else{
			sb.append(getAltTitle());
		}

		return sb.toString();

	}


}
