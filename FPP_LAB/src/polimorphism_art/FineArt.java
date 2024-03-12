package polimorphism_art;

public class FineArt implements ArtCount {
private String[] paintings;
private String[] sculptures;
public FineArt(String[] paintings, String[] sculptures) {
	this.paintings=paintings;
	this.sculptures=sculptures;
}
public String[] getPaintings() {
	return paintings;
}
public String[] getSculptures() {
	return sculptures;
}
@Override
public int numArtPieces() {
	return paintings.length+sculptures.length;
}
}
