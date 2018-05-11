package MapClasses;

public class MapBuilder
{
	private GameMap map;
	
	
	public MapBuilder()
	{
		System.out.print("Nombre del nuevo mapa: ");
		map = new GameMap(Program.input.nextLine());
		
		while(!mapIsCompleted())
		{
			
		}
	}
	
	private boolean mapIsCompleted()
	{
		boolean completed = true;
		
		for(int i = 0; i < GameMap.HEIGHT; i++)
		{
			for(int j = 0; j < GameMap.WIDTH; j++)
			{
				if(map.getTile(i, j) == null)
				{
					completed = false;
				}
			}
		}
		
		return completed;
		
	}
}
