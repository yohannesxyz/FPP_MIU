package polimorphism_art;

public class Main {

	static FineArt[] fineArtsArr;
	static WebArt[] webArtsArr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		populateArrays();
		ArtCreationData bb= new ArtCreationData();
		ArtCount[] aa= bb.assembleCommonArt(fineArtsArr, webArtsArr);
		System.out.println(bb.computeNumberArtworks(aa));
		

	}
private static void populateArrays() {
	fineArtsArr= new FineArt[] {
			new FineArt(paintings1,sculptures1),new FineArt(paintings2,sculptures2)};
	
webArtsArr= new WebArt[] {new WebArt(animations1,new String[0])};
}
static String[] paintings1 
= new String[] {"Hor","sun", "spee"};
static String[] sculptures1 
= new String[] {"Hor","sun", "spee"};
static String[] paintings2 
= new String[] {"Hor","sun", "spee"};
static String[] sculptures2 
= new String[] {"Hor","sun", "spee"};
static String[] animations1 
= new String[] {"Hor","sun", "spee"};
static String[] advertisments
= new String[] {"Hor","sun", "spee"};
}
