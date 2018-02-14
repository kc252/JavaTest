package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook{

	ArrayList<Tune> tunes = new ArrayList<Tune>();

	public TuneBook(String abc) {

		BufferedReader inputStream = null; 

		try{
			inputStream = newBufferedReader(new FileReader("ABC.txt"));

			Tune t = new Tune();

			while((t = inputStream.readLine())) != null){

				t.x = getX();
				t.title = getTitle();

				t.AltTitle

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
		for(String tune:tunes)
	}
}