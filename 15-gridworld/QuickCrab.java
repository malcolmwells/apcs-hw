public class QuickCrab extends CrabCritter{
    //Unfinished, temporary push for now.
    public ArrayList<Location> getLocationsInDirections(int[] directions)
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        Location loc = getLocation();

        for (int d : directions)
	    {
		Location neighborLoc = loc.getAdjacentLocation
		    (getDirection()+d).getAdjacentLocation(getDirection()+d);
		if (gr.isValid(neighborLoc))
		    locs.add(neighborLoc);
	    }
        return locs;
    }
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        int[] dirs =
	    { Location.LEFT, Location.RIGHT };
        for (Location loc : getLocationsInDirections(dirs))
            if (getGrid().get(loc) == null)
                locs.add(loc);

        return locs;
    }
}
