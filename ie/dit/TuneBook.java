package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook{

	ArrayList<Tune> tunes = new ArrayList<Tune>();

	public TuneBook(String abc){

		BufferedReader inputStream = null; 

		try{
			inputStream = new BufferedReader(new FileReader(abc));

			String l;

			int x;
			String title, altTitle, notation;

    		while ((l = inputStream.readLine()) != null) 
    		{
    			if(l.contains("T:")){
    				title = l;
    			}
    			if (l.contains("X:")){
    				x = l.toString();
    			}

    			Tune t = new Tune(x,title,altTitle,notation);

    			tunes.add(t);
			}

		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally{
			if (inputStream != null){
				try{
					inputStream.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}

	public String toString(){

		StringBuffer sb = new StringBuffer();
		for(String tune:tunes){
			sb.append (tune + "\n");
		}

		return sb.toString();
	}

	public Tune findTune(String title){

		Tune search = new Tune();

		for(tune:tunes){
			tune = search; 

			if(search.title == title){
				return search
			}
		}

		return null;

	}

	 public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("ABC.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
    }
}