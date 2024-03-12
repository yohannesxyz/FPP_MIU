package polimorphism_art;

public class WebArt implements ArtCount{
	private String[] animations;
	private String[] advertisments;
	public WebArt(String[] animations, String[] advertisments) {
		this.animations=animations;
		this.advertisments=advertisments;
	}
	public String[] getAnimations() {
		return animations;
	}
	public String[] getAdvertisments() {
		return advertisments;
	}
	@Override
	public int numArtPieces() {
		return animations.length+advertisments.length;
	}
}
