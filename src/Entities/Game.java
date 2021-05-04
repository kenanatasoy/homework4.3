package Entities;

public class Game {
	
	private int id;
	private int playerId;
	private int name;
	private int price;
	private int campaignId;
	
	public Game() {
		
	}

	public Game(int id, int playerId, int name, int price, int campaignId) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.name = name;
		this.price = price;
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

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
}
