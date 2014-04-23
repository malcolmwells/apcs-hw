public class BlusterCritter extends Critter{
    private int c;
    public BlusterCritter(int c){
	this.c = c;
	color = Color.BLUE;
        direction = Location.NORTH;
        grid = null;
        location = null;
    }
    public ArrayList<Actor> getActors(){
	Location l = getLocation();
	ArrayList<Location> locs = new ArrayList<Location>();
        int d = Location.NORTH;
        for (int i = 0; i < Location.FULL_CIRCLE / Location.HALF_RIGHT; i++)
	    {
		Location neighborLoc = loc.getAdjacentLocation(d);
		if (isValid(neighborLoc))
		    locs.add(neighborLoc);
		if(isValid(neighborLoc.getAdjacentLocation(d)))
		    locs.add(neighborLoc.getAdjacentLocation(d));
		if(d % 90 == 45){
		    locs.add(neighborLoc.getAdjacentLocation(d+45));
		    locs.add(neighborLoc.getAdjacentLocation(d-45));
		}
		d = d + Location.HALF_RIGHT;
	    }
	for(Location neighborLoc : locs){
	    if(get(neighborLoc) != null)
		locs.remove(neighborLoc);
	}
	ArrayList<E> neighbors = new ArrayList<E>();
	for (Location neighborLoc : getOccupiedAdjacentLocations(loc))
            neighbors.add(get(neighborLoc));
	return neighbors;
    }
    public void processActors(ArrayList<Actor> actors){
	for(Actor a : actors){
	    int count = 0;
	    if(a instanceof Critter) count++;
	}
	Color c = getColor();
	int red = (int) (c.getRed() * (1 + 0.05*(c-count)));
	int green = (int) (c.getGreen() * (1 + 0.05*(c-count)));
	int blue = (int) (c.getBlue() * (1 + 0.05*(c-count)));	
	setColor(new Color(red, green, blue));
    }

}