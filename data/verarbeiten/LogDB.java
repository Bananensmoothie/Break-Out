package verarbeiten;

import java.util.ArrayList;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public final class LogDB
{
	private ArrayList<String> tabellenEintraege = new ArrayList<String>();
	
	public LogDB(String dateiPfad)
	{
		splitEintraege(dateiPfad);
	}
	
	private void splitEintraege(String dateiPfad)
	{
		ArrayList<String> log = Tools.readLogCSV(dateiPfad);
		
		for (String zeile : log)
		{
			String[] teile = zeile.split(";");
			
			if (teile.length >= 2)
			{
				for (int i = 0; i < teile.length; i++)
				{
					tabellenEintraege.add(teile[i]);
				}
			}
		}
	}

	public ArrayList<String> getTabellenEintraege()
	{
		return tabellenEintraege;
	}
}