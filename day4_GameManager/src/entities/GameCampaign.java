package entities;

public class GameCampaign {
private int gameCampaignId;
private String gameCampaignName;
private String gameCampaignDiscount;

public GameCampaign() {
	
}

public GameCampaign(int gameCampaignId, String gameCampaignName, String gameCampaignDiscount) {
	super();
	this.gameCampaignId = gameCampaignId;
	this.gameCampaignName = gameCampaignName;
	this.gameCampaignDiscount = gameCampaignDiscount;
}

public int getGameCampaignId() {
	return gameCampaignId;
}

public void setGameCampaignId(int gameCampaignId) {
	this.gameCampaignId = gameCampaignId;
}

public String getGameCampaignName() {
	return gameCampaignName;
}

public void setGameCampaignName(String gameCampaignName) {
	this.gameCampaignName = gameCampaignName;
}

public String getGameCampaignDiscount() {
	return gameCampaignDiscount;
}

public void setGameCampaignDiscount(String gameCampaignDiscount) {
	this.gameCampaignDiscount = gameCampaignDiscount;
}

}
