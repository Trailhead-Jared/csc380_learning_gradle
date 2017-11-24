package org.trailheadsystems.weatherApplication;

import org.trailheadsystems.lib.owm.*;
public class MainWindow
{
	public static void main(String[] args)
	{
		System.out.println("wut am I doing?");
		OwmClient owmClient = new OwmClient();
		owmClient.DoQuery();
	}
}

