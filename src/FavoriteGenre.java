import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/discuss/interview-question/373006
 * 
 * @author Parikshith Kedilaya Mallar
 *
 */
public class FavoriteGenre {
	private static Map<String, List<String>> favoriteGenres(Map<String, List<String>> userSongs,
			Map<String, List<String>> songGenres) {
		
		Map<String, List<String>> res = new HashMap<>();
		Map<String, String> songGenreMap = new HashMap<>();

		// Create a map of song-genre
		for (String genre : songGenres.keySet()) {
			List<String> songs = songGenres.get(genre);
			for (String song : songs) {
				songGenreMap.put(song, genre);
			}
		}
		
		// For each user, check the genre for each song and keep a counter
		Map<String, Integer> genreCount = new HashMap<>();
		int max = 0;
		for (String user : userSongs.keySet()) {
			genreCount = new HashMap<>();
			max = 0;
			res.put(user, new ArrayList<>());
			List<String> songs = userSongs.get(user);
			for (String song : songs) {
				String genre = songGenreMap.get(song);
				int c = genreCount.getOrDefault(genre, 0) + 1;
				if (genre != null)
					genreCount.put(genre, c);
				max = Math.max(c, max);
			}
			for (String key : genreCount.keySet()) {
				if (genreCount.get(key) == max) {
					res.get(user).add(key);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		// Test Case 01
		Map<String, List<String>> userSongs = new HashMap<String, List<String>>();
		Map<String, List<String>> songGenres = new HashMap<String, List<String>>();

		String[] david = { "song1", "song2", "song3", "song4", "song8" };
		userSongs.put("David", addToList(david));

		String[] emma = { "song5", "song6", "song7" };
		userSongs.put("Emma", addToList(emma));

		String[] rock = { "song1", "song3" };
		songGenres.put("Rock", addToList(rock));

		String[] dubstep = { "song7" };
		songGenres.put("Dubstep", addToList(dubstep));

		String[] techno = { "song2", "song4" };
		songGenres.put("Techno", addToList(techno));

		String[] pop = { "song5", "song6" };
		songGenres.put("Pop", addToList(pop));

		String[] jazz = { "song8", "song9" };
		songGenres.put("Jazz", addToList(jazz));

		Map<String, List<String>> favoriteGenres = favoriteGenres(userSongs, songGenres);

		// Test Case 02
		Map<String, List<String>> userSongs1 = new HashMap<String, List<String>>();
		Map<String, List<String>> songGenres1 = new HashMap<String, List<String>>();

		String[] david1 = { "song1", "song2" };
		userSongs1.put("David", addToList(david1));

		String[] emma1 = { "song3", "song4" };
		userSongs1.put("Emma", addToList(emma1));

		Map<String, List<String>> favoriteGenres1 = favoriteGenres(userSongs1, songGenres1);

		try {
			assertEquals(favoriteGenres.get("David").get(0), "Rock");
			assertEquals(favoriteGenres.get("David").get(1), "Techno");
			assertEquals(favoriteGenres.get("Emma").get(0), "Pop");

			assertEquals(Integer.toString(favoriteGenres1.get("David").size()), "0");
			assertEquals(Integer.toString(favoriteGenres1.get("Emma").size()), "0");

			System.out.println("ALL TEST CASES PASSED");
		} catch (Exception e) {
			System.err.println("FAILED\n" + e);
		}

	}

	private static void assertEquals(String string, String string2) throws Exception {
		// TODO Auto-generated method stub
		if (!string.equals(string2)) {
			throw new Exception("Output: " + string + "\nExpected: " + string2);
		}
	}

	private static List<String> addToList(String[] strArray) {
		List<String> list = new ArrayList<String>();
		for (String str : strArray) {
			list.add(str);
		}
		return list;
	}
}
