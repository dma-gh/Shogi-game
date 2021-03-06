import java.util.ArrayList;

public class Hand {

	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	private int owner;
	
	public Hand(int owner) {
		this.owner = owner;
		for(int i=0;i<38;i++) {
			pieces.add(null);
		}
	}
	
	public Piece getPiece(int i) {
		return pieces.get(i);
	}
	
	public void addPiece(Piece p) {
		for(int i=0;i<pieces.size();i++) {
			if(pieces.get(i) == null) {
				pieces.set(i,p);
				break;
			}
		}
	}
	
	public void removePiece(Piece p) {
		for(int i=0;i<pieces.size();i++) {
			if(pieces.get(i).getSymbol() == p.getSymbol()) {
				pieces.set(i, null);
				break;
			}
		}
	}
	
	public void setPiece(int index, Piece p) {
		pieces.set(index, p);
	}
	
	public int getOwner() {
		return owner;
	}
}
