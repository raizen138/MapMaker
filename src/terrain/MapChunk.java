package terrain;
import java.util.HashMap;

import graphics.Hud;
import interactables.Interactable;
import main.CodigoNES;

public class MapChunk 
{
	public String name = new String();
	public int[][] layout;
	public HashMap<Integer, String> exits = new HashMap<>(); 
	public int[][] exitLayout;
	public String BgImg = new String();
	public int[][] charLayout;
	public int nEnemy;
	public Interactable[][] interLayout;
	
	public MapChunk()
	{
		name = "defaultname";
		layout = new int[11][16];
	}
	
	public MapChunk(String newName, int[][] newLayout, HashMap<Integer, String> newExits, int[][] newExitLayout, int[][] newCharLayout, String newBgImg, int newEnemy, Interactable[][] newILayout)
	{
		name = newName;
		layout = newLayout;
		exitLayout = newExitLayout;
		exits.putAll(newExits);
		charLayout = newCharLayout;
		BgImg = newBgImg;
		nEnemy = newEnemy;
		interLayout = newILayout;
	}
	
	public void resetEnemies()
	{
		MapChunk currentMap = CodigoNES.CurrentMap();
		
		for(int i = 0; i < currentMap.layout.length; i++) {
			for(int j = 0; j < currentMap.layout[i].length; j++) {
				if (currentMap.layout[i][j] == 8) {
					currentMap.layout[i][j] = 0;
					currentMap.charLayout[i][j] = 0;
				}
			}
		}
		
		
	}
	
	
	public String getNextMap(int key)
	{
		return exits.get(key);
	}
	
	public String toString()
	{
		return "Name: " + name + "\nExits: " + exits;
	}
	
	public void changeBgImg() {
		
		if (name.equals("Camara Resurrección")) {
			BgImg = "map/mapa0abierto.jpg";
		}
		else if (name.equals("Santuario Resurrección")) {
			BgImg = "map/mapa1abierto.jpg";
		}
		else if (name.equals("La Espada")) {
			BgImg = "map/mapa5noes.jpg";
		}
	}
	
	
	
	
	
}
