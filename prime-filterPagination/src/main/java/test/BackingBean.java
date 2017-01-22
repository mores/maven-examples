package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="BackingBean")
@ViewScoped
public class BackingBean implements java.io.Serializable 
{
	private LocationType locationType;
	private java.util.List<LocationType> locationTypes;
	private java.util.List<LocationType> filteredLocationTypes;

        public BackingBean()
        {
		locationTypes = new java.util.ArrayList();
		locationTypes.add( new LocationType( 1L, "one" ) );
		locationTypes.add( new LocationType( 2L, "two" ) );
		locationTypes.add( new LocationType( 3L, "three" ) );
		locationTypes.add( new LocationType( 4L, "four" ) );
                locationTypes.add( new LocationType( 5L, "five" ) );
                locationTypes.add( new LocationType( 6L, "six" ) );
		locationTypes.add( new LocationType( 7L, "seven" ) );
                locationTypes.add( new LocationType( 8L, "eight" ) );
                locationTypes.add( new LocationType( 9L, "nine" ) );
		locationTypes.add( new LocationType( 10L, "ten" ) );
                locationTypes.add( new LocationType( 11L, "eleven" ) );
                locationTypes.add( new LocationType( 12L, "twelve" ) );
		locationTypes.add( new LocationType( 13L, "thirteen" ) );
                locationTypes.add( new LocationType( 14L, "fourteen" ) );
                locationTypes.add( new LocationType( 15L, "fifteen" ) );
        }

	public LocationType getLocationType()
	{
		return locationType;
	}

	public void setLocationType( LocationType locationType )
	{
		this.locationType = locationType;
	}

	public java.util.List<LocationType> getLocationTypes()
	{
		return locationTypes;
	}

        public java.util.List<LocationType> getFilteredLocationTypes()
        {
                return filteredLocationTypes;
        }

	public void setFilteredLocationTypes( java.util.List<LocationType> filteredlocationTypes )
	{
		this.filteredLocationTypes = filteredlocationTypes;
	}
}
