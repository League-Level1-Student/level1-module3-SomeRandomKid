
public class Netflix {
public static void main(String[] args) {
	Movie boi = new Movie("Deadpool 2", 4);
	Movie memes = new Movie("Avengers: Infinity War", 4);
	Movie yodel = new Movie("Overboard", 1);
	Movie kid = new Movie("Solo", 3);
	Movie love = new Movie("Shrek", 5);
	boi.getTicketPrice();
	memes.getTicketPrice();
	yodel.getTicketPrice();
	kid.getTicketPrice();
	love.getTicketPrice();
	NetflixQueue hey = new NetflixQueue();
	hey.addMovie(boi);
	hey.addMovie(memes);
	hey.addMovie(yodel);
	hey.addMovie(kid);
	hey.addMovie(love);
	hey.printMovies();
	}
}