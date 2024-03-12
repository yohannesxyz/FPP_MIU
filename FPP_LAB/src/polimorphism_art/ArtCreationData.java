package polimorphism_art;

public class ArtCreationData {

	public ArtCount[] assembleCommonArt(FineArt[] fineArtWorks,WebArt[] webArtWorks) {
		ArtCount[] arr= new ArtCount[fineArtWorks.length+webArtWorks.length];
		System.arraycopy(webArtWorks, 0, arr, 0, webArtWorks.length);
	System.arraycopy(fineArtWorks,0,arr,webArtWorks.length,fineArtWorks.length);
	return arr;
	}

	
	
	public int computeNumberArtworks(ArtCount[] artWorks)
	{
		int count = 0;
		for(ArtCount p:artWorks) {
			count+=p.numArtPieces();
		}
		return count;
	}
}
