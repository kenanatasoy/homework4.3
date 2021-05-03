package Entities;

public class Sale {
	private int id;
	private int playerId;
	private int gameId;
	private int campaignId;
	
	public Sale() {
		
	}

	public Sale(int id, int playerId, int gameId, int campaignId) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
	
}
