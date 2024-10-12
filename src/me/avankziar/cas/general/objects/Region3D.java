package me.avankziar.cas.general.objects;

import org.bukkit.util.Vector;

public class Region3D
{
	private String servername;
	private String worldname;
	private Vector minimumPoint;
	private Vector maximumPoint;
	
	public Region3D(){}
	
	public Region3D(String servername, String worldname, Vector minimumPoint, Vector maximumPoint)
	{
		setServername(servername);
		setWorldname(worldname);
		setMinimumPoint(minimumPoint);
		setMaximumPoint(maximumPoint);
	}
	
	public Region3D getRegion()
	{
		return this;
	}

	public String getServername()
	{
		return servername;
	}

	public void setServername(String servername)
	{
		this.servername = servername;
	}

	public String getWorldname()
	{
		return worldname;
	}

	public void setWorldname(String worldname)
	{
		this.worldname = worldname;
	}

	public Vector getMinimumPoint()
	{
		return minimumPoint;
	}

	public void setMinimumPoint(Vector minimumPoint)
	{
		this.minimumPoint = minimumPoint;
	}

	public Vector getMaximumPoint()
	{
		return maximumPoint;
	}

	public void setMaximumPoint(Vector maximumPoint)
	{
		this.maximumPoint = maximumPoint;
	}
	
	public boolean equal(Region3D region)
	{
		return getServername().equals(region.getServername())
				&& getWorldname().equals(region.getWorldname())
				&& getMinimumPoint().getX() == region.getMinimumPoint().getX()
				&& getMinimumPoint().getY() == region.getMinimumPoint().getY()
				&& getMinimumPoint().getZ() == region.getMinimumPoint().getZ()
				&& getMaximumPoint().getX() == region.getMaximumPoint().getX()
				&& getMaximumPoint().getY() == region.getMaximumPoint().getY()
				&& getMaximumPoint().getZ() == region.getMaximumPoint().getZ();
	}
}