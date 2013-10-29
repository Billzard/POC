package com.billzard.vo.input;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HotSpotDetailsVO extends CustomerVO {

	private String hotspotName;

	private String coordinates;

	private String strength;

	private Boolean isPublic;

	public String getHotspotName() {
		return hotspotName;
	}

	public void setHotspotName(String hotspotName) {
		this.hotspotName = hotspotName;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

}
