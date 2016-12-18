package verarbeiten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public final class Tools
{
	public static ArrayList<String> readLogCSV(String dateiPfad)
	{
		ArrayList<String> log = new ArrayList<String>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(dateiPfad)))
		{
			String zeile = null;
			
			while ((zeile = reader.readLine()) != null)
			{
				log.add(zeile);
			}
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		
		return log;
	}
}